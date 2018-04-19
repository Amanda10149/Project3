
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

object FAQ extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Question],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(questionForm : Form[models.Question]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*9.49*/routes/*9.55*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*9.100*/("""">
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
		
		
	</head>

	<body>
	
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

    

				
				<ul id="navbar">
					<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/Laptop">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
          <li class="dropdown"><a href="/FAQ">FAQ</a></li>
          <li class="dropdown"><a href="/login">Login</a></li>
				</ul>
			</header>
			<main>
				<div id="columns">
					<div id="leftCol">
						<div class="outerColDiv">
							<div class="col-sm-5">
      <p>If you're question isint answered in the FAQ you can submit your own question here and one of our staff will respond within 24 hours. </p>
	  
      <p><span class="glyphicon glyphicon-map-marker"></span> Sandyford, Dublin</p>
      <p><span class="glyphicon glyphicon-phone"></span> 01 820876</p>
      
    </div>
						</div>
					
          </div>
          """),_display_(/*90.12*/main("Add Question")/*90.32*/ {_display_(Seq[Any](format.raw/*90.34*/("""
            """),format.raw/*91.13*/("""<p class="lead">Ask a question</p>
        
            """),_display_(/*93.14*/form(action=routes.HomeController.addQuestionSubmit(), 'class -> "form-horizontal", 'role -> "form")/*93.114*/{_display_(Seq[Any](format.raw/*93.115*/("""
                """),format.raw/*94.45*/("""
                """),format.raw/*95.107*/("""
                """),_display_(/*96.18*/CSRF/*96.22*/.formField),format.raw/*96.32*/("""
        
        
                """),_display_(/*99.18*/inputText(questionForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*99.94*/("""
                """),_display_(/*100.18*/inputText(questionForm("email"), '_label -> "descripton", 'class -> "form-control")),format.raw/*100.101*/("""
                """),_display_(/*101.18*/inputText(questionForm("question"), '_label -> "stock", 'class -> "form-control")),format.raw/*101.99*/("""
               
        
               
        
        
                """),format.raw/*107.17*/("""<div class="actions">
                        <input type="submit" value="AddQuestion" class="btn btn-primary">
                        <a href=""""),_display_(/*109.35*/routes/*109.41*/.HomeController.FAQ),format.raw/*109.60*/("""">
                            <button type="button" class="btn btn-warning"> Cancel </button>
                        
                        </a>
                </div>
            """)))}),format.raw/*114.14*/("""   
        """)))}),format.raw/*115.10*/("""
          
					
					"""),format.raw/*118.6*/("""<div id="centreCol">
						<div class="outerColDiv">
							<div>
<!-- Accordain -->
<button class="accordion">Q1</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

<button class="accordion">Q2</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

</div><button class="accordion">Q3</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

<!-- JS For Accordain-->
<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) """),format.raw/*142.34*/("""{"""),format.raw/*142.35*/("""
  """),format.raw/*143.3*/("""acc[i].addEventListener("click", function() """),format.raw/*143.47*/("""{"""),format.raw/*143.48*/("""
    """),format.raw/*144.5*/("""this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight)"""),format.raw/*146.31*/("""{"""),format.raw/*146.32*/("""
      """),format.raw/*147.7*/("""panel.style.maxHeight = null;
    """),format.raw/*148.5*/("""}"""),format.raw/*148.6*/(""" """),format.raw/*148.7*/("""else """),format.raw/*148.12*/("""{"""),format.raw/*148.13*/("""
      """),format.raw/*149.7*/("""panel.style.maxHeight = panel.scrollHeight + "px";
    """),format.raw/*150.5*/("""}"""),format.raw/*150.6*/(""" 
  """),format.raw/*151.3*/("""}"""),format.raw/*151.4*/(""");
"""),format.raw/*152.1*/("""}"""),format.raw/*152.2*/("""
"""),format.raw/*153.1*/("""</script>



											<!-- Container (Contact Section) -->
<div id="contact" class="container-fluid bg-grey">
  <h2 class="text-center">Ask a Question</h2>
  <div class="row">
    
    <div class="col-sm-7 slideanim">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
</div>
							</div>
						</div>
					</div>
				</div>
				<map name="facebook" id="facebook">
		<area href="https://www.facebook.com/" shape="circle" coords="100, 80,80,50" alt="fb"/>
		<area href="https://twitter.com/" shape="circle" coords="300, 80,80,80" alt="tw"/>
		<area href="https://www.instagram.com/" shape="circle" coords="500, 80,80,50" alt="in"/>
		</map>
		<img src="/assets/images/follow.png" usemap="#facebook" alt"wh"width="570" height="200"/>
			</main>

			
			<footer>
				Copyright &copy; 2018
			</footer>
		</div>
	</body>
</html>"""))
      }
    }
  }

  def render(questionForm:Form[models.Question]): play.twirl.api.HtmlFormat.Appendable = apply(questionForm)

  def f:((Form[models.Question]) => play.twirl.api.HtmlFormat.Appendable) = (questionForm) => apply(questionForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 15:03:46 IST 2018
                  SOURCE: /home/wdd/webapps/newWorkingVersion/Project3/app/views/FAQ.scala.html
                  HASH: 73bc305eac851f7564fa313958cd0b2f1d7f9d31
                  MATRIX: 961->1|1072->41|1117->39|1144->58|1171->59|1309->171|1323->177|1389->222|4131->2937|4160->2957|4200->2959|4241->2972|4325->3029|4435->3129|4475->3130|4520->3175|4566->3282|4611->3300|4624->3304|4655->3314|4718->3350|4815->3426|4861->3444|4967->3527|5013->3545|5116->3626|5221->3702|5395->3848|5411->3854|5452->3873|5669->4058|5714->4071|5765->4094|6280->4580|6310->4581|6341->4584|6414->4628|6444->4629|6477->4634|6610->4738|6640->4739|6675->4746|6737->4780|6766->4781|6795->4782|6829->4787|6859->4788|6894->4795|6977->4850|7006->4851|7038->4855|7067->4856|7098->4859|7127->4860|7156->4861
                  LINES: 28->1|31->2|34->1|35->3|36->4|41->9|41->9|41->9|122->90|122->90|122->90|123->91|125->93|125->93|125->93|126->94|127->95|128->96|128->96|128->96|131->99|131->99|132->100|132->100|133->101|133->101|139->107|141->109|141->109|141->109|146->114|147->115|150->118|174->142|174->142|175->143|175->143|175->143|176->144|178->146|178->146|179->147|180->148|180->148|180->148|180->148|180->148|181->149|182->150|182->150|183->151|183->151|184->152|184->152|185->153
                  -- GENERATED --
              */
          