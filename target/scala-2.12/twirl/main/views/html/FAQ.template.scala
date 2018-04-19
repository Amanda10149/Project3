
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

object FAQ extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*8.49*/routes/*8.55*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*8.100*/("""">
		
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
          """),_display_(/*89.12*/main("FAQ")/*89.23*/ {_display_(Seq[Any](format.raw/*89.25*/("""
            """),format.raw/*90.13*/("""<p class="lead">ask a question</p>
        
            """),_display_(/*92.14*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*92.113*/{_display_(Seq[Any](format.raw/*92.114*/("""
                """),format.raw/*93.45*/("""
                """),format.raw/*94.107*/("""
                """),_display_(/*95.18*/CSRF/*95.22*/.formField),format.raw/*95.32*/("""
        
        
                """),_display_(/*98.18*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*98.93*/("""
                """),_display_(/*99.18*/inputText(productForm("Email"), '_label -> "descripton", 'class -> "form-control")),format.raw/*99.100*/("""
                """),_display_(/*100.18*/inputText(productForm("Queston"), '_label -> "stock", 'class -> "form-control")),format.raw/*100.97*/("""
               
        
               
        
        
                """),format.raw/*106.17*/("""<div class="actions">
                        <input type="submit" value="Add/Update Product" class="btn btn-primary">
                        <a href=""""),_display_(/*108.35*/routes/*108.41*/.HomeController.index),format.raw/*108.62*/("""">
                            <button type="button" class="btn btn-warning"> Cancel </button>
                        
                        </a>
                </div>
            """)))}),format.raw/*113.14*/("""   
        """)))}),format.raw/*114.10*/("""          
					
					"""),format.raw/*116.6*/("""<div id="centreCol">
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

for (i = 0; i < acc.length; i++) """),format.raw/*140.34*/("""{"""),format.raw/*140.35*/("""
  """),format.raw/*141.3*/("""acc[i].addEventListener("click", function() """),format.raw/*141.47*/("""{"""),format.raw/*141.48*/("""
    """),format.raw/*142.5*/("""this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight)"""),format.raw/*144.31*/("""{"""),format.raw/*144.32*/("""
      """),format.raw/*145.7*/("""panel.style.maxHeight = null;
    """),format.raw/*146.5*/("""}"""),format.raw/*146.6*/(""" """),format.raw/*146.7*/("""else """),format.raw/*146.12*/("""{"""),format.raw/*146.13*/("""
      """),format.raw/*147.7*/("""panel.style.maxHeight = panel.scrollHeight + "px";
    """),format.raw/*148.5*/("""}"""),format.raw/*148.6*/(""" 
  """),format.raw/*149.3*/("""}"""),format.raw/*149.4*/(""");
"""),format.raw/*150.1*/("""}"""),format.raw/*150.2*/("""
"""),format.raw/*151.1*/("""</script>



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

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 11:10:38 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/FAQ.scala.html
                  HASH: d8b585252c7ca9076f316a55258be944d15ac550
                  MATRIX: 960->1|1087->33|1115->35|1253->147|1267->153|1333->198|4075->2913|4095->2924|4135->2926|4176->2939|4260->2996|4369->3095|4409->3096|4454->3141|4500->3248|4545->3266|4558->3270|4589->3280|4652->3316|4748->3391|4793->3409|4897->3491|4943->3509|5044->3588|5149->3664|5330->3817|5346->3823|5389->3844|5606->4029|5651->4042|5701->4064|6216->4550|6246->4551|6277->4554|6350->4598|6380->4599|6413->4604|6546->4708|6576->4709|6611->4716|6673->4750|6702->4751|6731->4752|6765->4757|6795->4758|6830->4765|6913->4820|6942->4821|6974->4825|7003->4826|7034->4829|7063->4830|7092->4831
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|121->89|121->89|121->89|122->90|124->92|124->92|124->92|125->93|126->94|127->95|127->95|127->95|130->98|130->98|131->99|131->99|132->100|132->100|138->106|140->108|140->108|140->108|145->113|146->114|148->116|172->140|172->140|173->141|173->141|173->141|174->142|176->144|176->144|177->145|178->146|178->146|178->146|178->146|178->146|179->147|180->148|180->148|181->149|181->149|182->150|182->150|183->151
                  -- GENERATED --
              */
          