package controllers;

import play.mvc.*;

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
        return ok(views.html.index.render("Je suis le controleur"));
    }
	
	public Result vide() {
        return ok(views.html.vide.render());
    }
	
	public Result helloworld(String fname,String fage, String faddress){
        return ok(views.html.helloworld.render(fname,fage,faddress));
    }
	
	public Result formulaire1() {
        return ok(views.html.formulaire1.render());
    }
}
