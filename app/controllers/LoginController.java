package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

//import user model
import models.users.*;

public class LoginController extends Controller {
    //depend inject
    private FormFactory formFactory;

    //
    private Environment env;

    //
    @Inject
    public LoginController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }

    //render return login
    public Result login(){

        //create form
        //in formFactory
        Form<Login> loginForm = formFactory.form(Login.class);

        //render add product view
        return ok(login.render(loginForm));
    }
    public Result loginSubmit() {
        // Bind form instance to the values submitted from the form
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        //check for errors
        //uses the validate method defined in the login class
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            //user logged in successfully
            //clear the existing session - resets session id
            session().clear();
            //store the logged in email in the session (cookie)
            session("email", loginForm.get().getEmail());
        }
        //return to home page
        return redirect(controllers.routes.HomeController.index());
        }
    }


    