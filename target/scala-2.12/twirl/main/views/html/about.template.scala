
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
.carousel-inner img """),format.raw/*68.21*/("""{"""),format.raw/*68.22*/("""
      
      """),format.raw/*70.7*/("""width: 50%; /* Set width to 100% */
      margin: auto;
	  height:80%;
  """),format.raw/*73.3*/("""}"""),format.raw/*73.4*/("""
  """),format.raw/*74.3*/("""</style>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="./index.html"><span class="glyphicon glyphicon-home"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
					<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/Laptop">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
			
			<main>
	<div id="columns">
	<div id="leftCol">
	<div class="outerColDiv">
	<div>
	<!-- CONTENT GOES HERE -->
	<h4>Contact Information</h4>
	<ul>
	<li>Ph: 01 298 1234</li><br>
	<li>Fax: 01 298 9876</li><br>
	
	<li>
	Post: 
	<ul>	
	<li>Computer Hub,</li><br>
	<li>Block 2B</li><br>
	<li>Sandyford Business Park,</li><br>
	<li>Sandyford,</li><br>
	<li>Dublin 18.</li>
	</ul>	
	</li>
	<li></li>
	</ul>
	</div>
	</div>
	
	</div>
	
	<div id="centreCol">
	<div class="outerColDiv">
	<div>
	<!-- CONTENT GOES HERE -->
	<h3>About Us</h3>
	<p>We were founded in 2005.</p>
	<br>
	<h4>Our goals</h4>
	<p>We strive to provide great quality products made from the best materials. We wish to provide fast shipping. </p>
	
	<h4>Money-back guarantee</h4>	
	<p>We offer a 14-day cooling off period. So if you're not completely satisfied with your order, you can send it back to us, no questions asked!</p>
	<h4>Real-time order tracking</h4>	
	<p>Sign in to your account to track the status of your order in real time.<br> You will also receive emails at each step of the delivery process, from picking & packing to shipping.</p>
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
	Copyright &copy; 
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
                  DATE: Mon Apr 16 16:31:02 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/about.scala.html
                  HASH: 3ba0c20d600d0b342c5aa0a7c07f296bff5a1c1a
                  MATRIX: 1030->0|1185->129|1199->135|1265->180|3433->2320|3462->2321|3503->2335|3603->2408|3631->2409|3661->2412
                  LINES: 33->1|40->8|40->8|40->8|100->68|100->68|102->70|105->73|105->73|106->74
                  -- GENERATED --
              */
          