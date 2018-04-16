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

    
    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }
    
   

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

    public Result FAQ() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.FAQ.render(productList));

    }


    public Result Laptop() {

        List<Product> productList = Product.findAll();

        return ok(views.html.Laptop.render(productList));
    }

    
    public Result addProduct() {
        

        Form<Product> productForm = formFactory.form(Product.class);

        return ok(views.html.addProduct.render(productForm));

    }

    public Result addProductSubmit() {

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(views.html.addProduct.render(newProductForm));

        }else {
            Product newProduct = newProductForm.get();

            newProduct.save();
            
            flash("success", "Product "+ newProduct.getName() + "was added");

            return redirect(controllers.routes.HomeController.Laptop());
            
        
        }
    }

    public Result deleteProduct(Long id){
    
    
        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");

        return redirect(routes.HomeController.Laptop());

    
        
    }

}
