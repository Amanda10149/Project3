
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
.carousel-inner img """),format.raw/*62.21*/("""{"""),format.raw/*62.22*/("""
      
      """),format.raw/*64.7*/("""width: 50%; /* Set width to 100% */
      margin: auto;
	  height:50%;
  """),format.raw/*67.3*/("""}"""),format.raw/*67.4*/("""
  """),format.raw/*68.3*/("""</style>
    

				
				<ul id="navbar">
				<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/pc">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
					<li class="dropdown"><a href="/subscribe">Subscribe</a></li>
				</ul>
			</header>
			
			<main>
				<div id="columns">
					<h2>Samsung TVs</h2>
					<div id="leftCol">
						<div class="outerColDiv">
							<div>
								<h4>Standard TVs</h4>
								<div class="productInfo">
									<img src="/assets/images/SamsungTV-img1.jpg" alt="24' Samsung TV" class="productImg">
									"""),_display_(/*91.11*/for(p <-products) yield /*91.28*/ {_display_(Seq[Any](format.raw/*91.30*/("""
										"""),_display_(/*92.12*/if(p.getId == 6)/*92.28*/ {_display_(Seq[Any](format.raw/*92.30*/("""
									"""),format.raw/*93.10*/("""<h4>"""),_display_(/*93.15*/p/*93.16*/.getName),format.raw/*93.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*95.16*/p/*95.17*/.getDescription),format.raw/*95.32*/("""</li><br>
										<li>"""),_display_(/*96.16*/p/*96.17*/.getStock),format.raw/*96.26*/("""</li><br>
										<li>"""),_display_(/*97.16*/p/*97.17*/.getPrice),format.raw/*97.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*99.13*/("""
									"""),format.raw/*100.10*/("""</ul>
										""")))}),format.raw/*101.12*/("""
								"""),format.raw/*102.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/SamsungTV-img2.jpg" alt="40' Samsung TV" class="productImg">
									"""),_display_(/*106.11*/for(p <-products) yield /*106.28*/ {_display_(Seq[Any](format.raw/*106.30*/("""
										"""),_display_(/*107.12*/if(p.getId == 9)/*107.28*/ {_display_(Seq[Any](format.raw/*107.30*/("""
									"""),format.raw/*108.10*/("""<h4>"""),_display_(/*108.15*/p/*108.16*/.getName),format.raw/*108.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*110.16*/p/*110.17*/.getDescription),format.raw/*110.32*/("""</li><br>
										<li>"""),_display_(/*111.16*/p/*111.17*/.getStock),format.raw/*111.26*/("""</li><br>
										<li>"""),_display_(/*112.16*/p/*112.17*/.getPrice),format.raw/*112.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*114.13*/("""
									"""),format.raw/*115.10*/("""</ul>
										""")))}),format.raw/*116.12*/("""
								"""),format.raw/*117.9*/("""</div>
							</div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
								<h4>Smart TVs</h4>
								<div class="productInfo">
									<img src="/assets/images/SamsungTV-img3.jpg" alt="49' Samsung Smart TV" class="productImg">
									"""),_display_(/*129.11*/for(p <-products) yield /*129.28*/ {_display_(Seq[Any](format.raw/*129.30*/("""
										"""),_display_(/*130.12*/if(p.getId == 10)/*130.29*/ {_display_(Seq[Any](format.raw/*130.31*/("""
									"""),format.raw/*131.10*/("""<h4>"""),_display_(/*131.15*/p/*131.16*/.getName),format.raw/*131.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*133.16*/p/*133.17*/.getDescription),format.raw/*133.32*/("""</li><br>
										<li>"""),_display_(/*134.16*/p/*134.17*/.getStock),format.raw/*134.26*/("""</li><br>
										<li>"""),_display_(/*135.16*/p/*135.17*/.getPrice),format.raw/*135.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*137.13*/("""
									"""),format.raw/*138.10*/("""</ul>
										""")))}),format.raw/*139.12*/("""
								"""),format.raw/*140.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/SamsungTV-img4.jpg" alt="55' Samsung Smart TV" class="productImg">
									"""),_display_(/*144.11*/for(p <-products) yield /*144.28*/ {_display_(Seq[Any](format.raw/*144.30*/("""
										"""),_display_(/*145.12*/if(p.getId == 11)/*145.29*/ {_display_(Seq[Any](format.raw/*145.31*/("""
									"""),format.raw/*146.10*/("""<h4>"""),_display_(/*146.15*/p/*146.16*/.getName),format.raw/*146.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*148.16*/p/*148.17*/.getDescription),format.raw/*148.32*/("""</li><br>
										<li>"""),_display_(/*149.16*/p/*149.17*/.getStock),format.raw/*149.26*/("""</li><br>
										<li>"""),_display_(/*150.16*/p/*150.17*/.getPrice),format.raw/*150.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*152.13*/("""
									"""),format.raw/*153.10*/("""</ul>
									""")))}),format.raw/*154.11*/("""
								"""),format.raw/*155.9*/("""</div>
							</div>
						</div>
					</div>
					
					<div id="bottomCol">
						<div class="outerColDiv">
							
						</div>
					</div>
				</div>
			</main>
				
			<footer>
				Copyright &copy; 2016 
				
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
                  DATE: Fri Apr 13 11:05:55 IST 2018
                  SOURCE: /home/wdd/webapps/play/Project/app/views/tv.scala.html
                  HASH: 38398c6c9f64117884c66f2eb30ce6905e46b35f
                  MATRIX: 959->1|1086->33|1114->35|1252->147|1266->153|1332->198|3138->1976|3167->1977|3208->1991|3308->2064|3336->2065|3366->2068|4114->2789|4147->2806|4187->2808|4226->2820|4251->2836|4291->2838|4329->2848|4361->2853|4371->2854|4400->2862|4463->2898|4473->2899|4509->2914|4561->2939|4571->2940|4601->2949|4653->2974|4663->2975|4693->2984|4821->3081|4860->3091|4909->3108|4946->3117|5129->3272|5163->3289|5204->3291|5244->3303|5270->3319|5311->3321|5350->3331|5383->3336|5394->3337|5424->3345|5488->3381|5499->3382|5536->3397|5589->3422|5600->3423|5631->3432|5684->3457|5695->3458|5726->3467|5855->3564|5894->3574|5943->3591|5980->3600|6309->3901|6343->3918|6384->3920|6424->3932|6451->3949|6492->3951|6531->3961|6564->3966|6575->3967|6605->3975|6669->4011|6680->4012|6717->4027|6770->4052|6781->4053|6812->4062|6865->4087|6876->4088|6907->4097|7036->4194|7075->4204|7124->4221|7161->4230|7350->4391|7384->4408|7425->4410|7465->4422|7492->4439|7533->4441|7572->4451|7605->4456|7616->4457|7646->4465|7710->4501|7721->4502|7758->4517|7811->4542|7822->4543|7853->4552|7906->4577|7917->4578|7948->4587|8077->4684|8116->4694|8164->4710|8201->4719
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|94->62|94->62|96->64|99->67|99->67|100->68|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|125->93|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|131->99|132->100|133->101|134->102|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|142->110|142->110|142->110|143->111|143->111|143->111|144->112|144->112|144->112|146->114|147->115|148->116|149->117|161->129|161->129|161->129|162->130|162->130|162->130|163->131|163->131|163->131|163->131|165->133|165->133|165->133|166->134|166->134|166->134|167->135|167->135|167->135|169->137|170->138|171->139|172->140|176->144|176->144|176->144|177->145|177->145|177->145|178->146|178->146|178->146|178->146|180->148|180->148|180->148|181->149|181->149|181->149|182->150|182->150|182->150|184->152|185->153|186->154|187->155
                  -- GENERATED --
              */
          