package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;

import views.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public Result index() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.index.render());

    }

    public Result about() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.about.render());

    }

    public Result tv() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.tv.render(productList));
    
    }

    public Result   Phones() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.Phones.render(productList));

    }

    public Result subscribe() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.subscribe.render(productList));

    }


    public Result pc() {

        List<Product> productList = Product.findAll();

        return ok(views.html.Laptop.render(productList));
    }

}
