
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*4.47*/routes/*4.53*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*4.98*/("""">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
  
     <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="/assets/images/sale.jpg" alt="Sale">
      </div>
      
  
      <div class="item">
        <img src="/assets/images/tv.jpg" alt="TV">
      </div>
  
      <div class="item">
        <img src="/assets/images/iphone.png" alt="iPhone">
      </div>
      
      <div class="item">
        <img src="/assets/images/laptop.jpg" alt="Macbook">
      </div>
    </div>
  
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

  <nav class="navbar navbar-inverse">
    <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>                        
        </button>
        <a class="navbar-brand" href="/"><span class="glyphicon glyphicon-home"></a>
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
                      <li class="dropdown"><a href="/">Home</a></li>
                      <li class="dropdown"><a href="/tv">Televisions</a></li>
                      <li class="dropdown"><a href="/Phones">Phones</a></li>
                      <li class="dropdown"><a href="/Laptop">Laptops</a></li>
                      <li class="dropdown"><a href="/about">About Us</a></li>
                      <li class="dropdown"><a href="/faq">FAQ</a></li>
                       <li class="dropdown"><a href="/login">Login</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
          <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
        </ul>
      </div>
    </div>
  </nav>

"""),format.raw/*86.73*/("""
    """),_display_(/*87.6*/main("Login")/*87.19*/ {_display_(Seq[Any](format.raw/*87.21*/("""
       
        """),format.raw/*89.9*/("""<!--HTML content for the index view -->
        <div class="col-xs-4">
            <h3>Sign in</h3>
            <!-- Display login errors if they exist -->
            """),_display_(/*93.14*/if(loginForm.hasGlobalErrors)/*93.43*/ {_display_(Seq[Any](format.raw/*93.45*/("""
                """),format.raw/*94.17*/("""<p class="alert alert-warning">
                    """),_display_(/*95.22*/loginForm/*95.31*/.globalError.message),format.raw/*95.51*/("""
                """),format.raw/*96.17*/("""</p>
            """)))}),format.raw/*97.14*/("""
            """),_display_(/*98.14*/if(flash.containsKey("error"))/*98.44*/ {_display_(Seq[Any](format.raw/*98.46*/("""
                """),format.raw/*99.17*/("""<p class="alert alert-warning">
                    """),_display_(/*100.22*/flash/*100.27*/.get("loginRequired")),format.raw/*100.48*/("""
                """),format.raw/*101.17*/("""</p>
             """)))}),format.raw/*102.15*/("""
    """),format.raw/*103.5*/("""<!-- The login form -->
            """),_display_(/*104.14*/helper/*104.20*/.form(action = controllers.routes.LoginController.loginSubmit())/*104.84*/ {_display_(Seq[Any](format.raw/*104.86*/("""
             """),format.raw/*105.42*/("""
             """),format.raw/*106.103*/("""
             """),_display_(/*107.15*/CSRF/*107.19*/.formField),format.raw/*107.29*/("""

             """),format.raw/*109.14*/("""<div class-"form-group">
                """),_display_(/*110.18*/inputText(loginForm("email"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*111.76*/("""
            """),format.raw/*112.13*/("""</div>
            <div class-"form-group">
                """),_display_(/*114.18*/inputPassword(loginForm("password"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*115.79*/("""
            """),format.raw/*116.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*120.10*/(""" """),format.raw/*120.27*/("""
        """),format.raw/*121.9*/("""</div>
        <!-- End of content for main -->
""")))}),format.raw/*123.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 14:44:00 IST 2018
                  SOURCE: /home/wdd/webapps/newWorkingVersion/Project3/app/views/login.scala.html
                  HASH: b6588ec01ec9491959931a8fbd9bbe42a0792a85
                  MATRIX: 966->1|1076->40|1121->38|1148->56|1175->57|1247->103|1261->109|1326->154|4888->3760|4920->3766|4942->3779|4982->3781|5026->3798|5222->3967|5260->3996|5300->3998|5345->4015|5425->4068|5443->4077|5484->4097|5529->4114|5578->4132|5619->4146|5658->4176|5698->4178|5743->4195|5824->4248|5839->4253|5882->4274|5928->4291|5979->4310|6012->4315|6077->4352|6093->4358|6167->4422|6208->4424|6251->4466|6295->4569|6338->4584|6352->4588|6384->4598|6428->4613|6498->4655|6640->4775|6682->4788|6771->4849|6923->4979|6965->4992|7147->5142|7177->5159|7214->5168|7294->5217
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|36->4|118->86|119->87|119->87|119->87|121->89|125->93|125->93|125->93|126->94|127->95|127->95|127->95|128->96|129->97|130->98|130->98|130->98|131->99|132->100|132->100|132->100|133->101|134->102|135->103|136->104|136->104|136->104|136->104|137->105|138->106|139->107|139->107|139->107|141->109|142->110|143->111|144->112|146->114|147->115|148->116|152->120|152->120|153->121|155->123
                  -- GENERATED --
              */
          