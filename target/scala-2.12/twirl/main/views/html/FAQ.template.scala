
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
					
					<div id="centreCol">
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

for (i = 0; i < acc.length; i++) """),format.raw/*114.34*/("""{"""),format.raw/*114.35*/("""
  """),format.raw/*115.3*/("""acc[i].addEventListener("click", function() """),format.raw/*115.47*/("""{"""),format.raw/*115.48*/("""
    """),format.raw/*116.5*/("""this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight)"""),format.raw/*118.31*/("""{"""),format.raw/*118.32*/("""
      """),format.raw/*119.7*/("""panel.style.maxHeight = null;
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/(""" """),format.raw/*120.7*/("""else """),format.raw/*120.12*/("""{"""),format.raw/*120.13*/("""
      """),format.raw/*121.7*/("""panel.style.maxHeight = panel.scrollHeight + "px";
    """),format.raw/*122.5*/("""}"""),format.raw/*122.6*/(""" 
  """),format.raw/*123.3*/("""}"""),format.raw/*123.4*/(""");
"""),format.raw/*124.1*/("""}"""),format.raw/*124.2*/("""
"""),format.raw/*125.1*/("""</script>



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
                  DATE: Mon Apr 16 20:31:25 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/FAQ.scala.html
                  HASH: 0d0bbb556ed6346e796c9c1dc73886ac6f04d487
                  MATRIX: 960->1|1087->33|1115->35|1253->147|1267->153|1333->198|4558->3394|4588->3395|4619->3398|4692->3442|4722->3443|4755->3448|4888->3552|4918->3553|4953->3560|5015->3594|5044->3595|5073->3596|5107->3601|5137->3602|5172->3609|5255->3664|5284->3665|5316->3669|5345->3670|5376->3673|5405->3674|5434->3675
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|146->114|146->114|147->115|147->115|147->115|148->116|150->118|150->118|151->119|152->120|152->120|152->120|152->120|152->120|153->121|154->122|154->122|155->123|155->123|156->124|156->124|157->125
                  -- GENERATED --
              */
          