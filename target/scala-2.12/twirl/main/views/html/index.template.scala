
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
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
<style>
.carousel-inner img """),format.raw/*64.21*/("""{"""),format.raw/*64.22*/("""
      
      """),format.raw/*66.7*/("""width: 50%; /* Set width to 100% */
      margin: auto;
	  height:50%;
  """),format.raw/*69.3*/("""}"""),format.raw/*69.4*/("""
  """),format.raw/*70.3*/("""</style>
    

				
				<ul id="navbar">
					<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/Laptop">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
          <li class="dropdown"><a href="/subscribe">Subscribe</a></li>
          <li class="dropdown"><a href="/login">Login</a></li>
				</ul>
			</header>

			<main>
				<style>
table, th, td """),format.raw/*87.15*/("""{"""),format.raw/*87.16*/("""
    """),format.raw/*88.5*/("""border: 1px solid black;
    border-collapse: collapse;
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""
"""),format.raw/*91.1*/("""th, td """),format.raw/*91.8*/("""{"""),format.raw/*91.9*/("""
    """),format.raw/*92.5*/("""padding: 5px;
    text-align: left;
"""),format.raw/*94.1*/("""}"""),format.raw/*94.2*/("""


"""),format.raw/*97.1*/("""</style>
</head>
<body>

<table id="t01" style="width:50%" >
 
  <tr>
    <th><img src="/assets/images/t-laptop.PNG" alt="32' laptop" class="productImg" style=";"></th>
    <th><img src="/assets/images/t-laptop1.PNG" alt="32' LG TV" class="productImg" style=""></th>
  </tr>
  <tr>
    <th><img src="/assets/images/t-laptop2.PNG" alt="32' LG TV" class="productImg" style=""></th>
    <th><img src="/assets/images/t-tablet.PNG" alt="32' LG TV" class="productImg" style=""></th>
  </tr>
  <tr>
    <th><img src="/assets/images/t-tv.PNG" alt="32' LG TV" class="productImg" style=""></th>
    <th><img src="/assets/images/t-laptop1.PNG" alt="32' LG TV" class="productImg" style=""></th>
  </tr>
</table>

<map name="facebook" id="facebook">
		<area href="https://www.facebook.com/" shape="circle" coords="100, 80,80,50" alt="fb"/>
		<area href="https://twitter.com/" shape="circle" coords="300, 80,80,80" alt="tw"/>
		<area href="https://www.instagram.com/" shape="circle" coords="500, 80,80,50" alt="in"/>
		</map>
		<img src="/assets/images/follow.png" usemap="#facebook" alt"wh"width="570" height="200"/>
			</main>
			
			
			<footer>
				Copyright &copy; 2017
			</footer>
		</div>
	</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 16 15:49:44 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/index.scala.html
                  HASH: 22ceac053f9f198a1814919a3ccb8b1533df263d
                  MATRIX: 1030->0|1185->129|1199->135|1265->180|3075->1962|3104->1963|3145->1977|3245->2050|3273->2051|3303->2054|3861->2584|3890->2585|3922->2590|4005->2646|4033->2647|4061->2648|4095->2655|4123->2656|4155->2661|4218->2697|4246->2698|4276->2701
                  LINES: 33->1|40->8|40->8|40->8|96->64|96->64|98->66|101->69|101->69|102->70|119->87|119->87|120->88|122->90|122->90|123->91|123->91|123->91|124->92|126->94|126->94|129->97
                  -- GENERATED --
              */
          