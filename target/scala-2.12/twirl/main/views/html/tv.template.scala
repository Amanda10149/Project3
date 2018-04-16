
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

object tv extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
		<<link rel="stylesheet" type="text/css" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*8.101*/("""">
		
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
<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Samsung 24 inch HD TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img1.jpg" alt="24' Samsung TV" class="productImg" style="height: 13em"></div>
        """),_display_(/*102.10*/for(p <-products) yield /*102.27*/ {_display_(Seq[Any](format.raw/*102.29*/("""
          """),_display_(/*103.12*/if(p.getId == 9)/*103.28*/ {_display_(Seq[Any](format.raw/*103.30*/("""
        """),format.raw/*104.9*/("""<h4>"""),_display_(/*104.14*/p/*104.15*/.getName),format.raw/*104.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*106.16*/p/*106.17*/.getDescription),format.raw/*106.32*/("""</li><br>
          <li>"""),_display_(/*107.16*/p/*107.17*/.getStock),format.raw/*107.26*/("""</li><br>
          <li>"""),_display_(/*108.16*/p/*108.17*/.getPrice),format.raw/*108.26*/("""</li><br>
          
            """)))}),format.raw/*110.14*/("""
        """),format.raw/*111.9*/("""</ul>
          """)))}),format.raw/*112.12*/("""
      """),format.raw/*113.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Samsung 40 Inch Full HD TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img2.jpg" alt="40' Samsung TV" class="productImg" style="height: 13em"></div>
        """),_display_(/*119.10*/for(p <-products) yield /*119.27*/ {_display_(Seq[Any](format.raw/*119.29*/("""
          """),_display_(/*120.12*/if(p.getId == 10)/*120.29*/ {_display_(Seq[Any](format.raw/*120.31*/("""
        """),format.raw/*121.9*/("""<h4>"""),_display_(/*121.14*/p/*121.15*/.getName),format.raw/*121.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*123.16*/p/*123.17*/.getDescription),format.raw/*123.32*/("""</li><br>
          <li>"""),_display_(/*124.16*/p/*124.17*/.getStock),format.raw/*124.26*/("""</li><br>
          <li>"""),_display_(/*125.16*/p/*125.17*/.getPrice),format.raw/*125.26*/("""</li><br>
          
            """)))}),format.raw/*127.14*/("""
        """),format.raw/*128.9*/("""</ul>
          """)))}),format.raw/*129.12*/("""
      """),format.raw/*130.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Samsung 49 Inch Full HD Smart TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img3.jpg" alt="49' Samsung TV" class="productImg" style="height: 13em;"></div>
        """),_display_(/*136.10*/for(p <-products) yield /*136.27*/ {_display_(Seq[Any](format.raw/*136.29*/("""
          """),_display_(/*137.12*/if(p.getId == 6)/*137.28*/ {_display_(Seq[Any](format.raw/*137.30*/("""
        """),format.raw/*138.9*/("""<h4>"""),_display_(/*138.14*/p/*138.15*/.getName),format.raw/*138.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*140.16*/p/*140.17*/.getDescription),format.raw/*140.32*/("""</li><br>
          <li>"""),_display_(/*141.16*/p/*141.17*/.getStock),format.raw/*141.26*/("""</li><br>
          <li>"""),_display_(/*142.16*/p/*142.17*/.getPrice),format.raw/*142.26*/("""</li><br>
          
            """)))}),format.raw/*144.14*/("""
        """),format.raw/*145.9*/("""</ul>
          """)))}),format.raw/*146.12*/("""
      """),format.raw/*147.7*/("""</div>
    </div>
  </div>
</div>
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
                  DATE: Mon Apr 16 17:41:42 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/tv.scala.html
                  HASH: 387c2a920c275a1b6a64ac2ef6334d174ed92a64
                  MATRIX: 959->1|1086->33|1114->35|1253->148|1267->154|1333->199|4952->3790|4986->3807|5027->3809|5067->3821|5093->3837|5134->3839|5171->3848|5204->3853|5215->3854|5245->3862|5308->3897|5319->3898|5356->3913|5409->3938|5420->3939|5451->3948|5504->3973|5515->3974|5546->3983|5612->4017|5649->4026|5698->4043|5733->4050|6068->4357|6102->4374|6143->4376|6183->4388|6210->4405|6251->4407|6288->4416|6321->4421|6332->4422|6362->4430|6425->4465|6436->4466|6473->4481|6526->4506|6537->4507|6568->4516|6621->4541|6632->4542|6663->4551|6729->4585|6766->4594|6815->4611|6850->4618|7193->4933|7227->4950|7268->4952|7308->4964|7334->4980|7375->4982|7412->4991|7445->4996|7456->4997|7486->5005|7549->5040|7560->5041|7597->5056|7650->5081|7661->5082|7692->5091|7745->5116|7756->5117|7787->5126|7853->5160|7890->5169|7939->5186|7974->5193
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|134->102|134->102|134->102|135->103|135->103|135->103|136->104|136->104|136->104|136->104|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|142->110|143->111|144->112|145->113|151->119|151->119|151->119|152->120|152->120|152->120|153->121|153->121|153->121|153->121|155->123|155->123|155->123|156->124|156->124|156->124|157->125|157->125|157->125|159->127|160->128|161->129|162->130|168->136|168->136|168->136|169->137|169->137|169->137|170->138|170->138|170->138|170->138|172->140|172->140|172->140|173->141|173->141|173->141|174->142|174->142|174->142|176->144|177->145|178->146|179->147
                  -- GENERATED --
              */
          