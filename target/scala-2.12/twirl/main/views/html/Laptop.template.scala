
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

object Laptop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""



"""),format.raw/*5.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*10.49*/routes/*10.55*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*10.100*/("""">
		
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
					<li class="dropdown"><a href="/pc">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
					<li class="dropdown"><a href="/subscribe">Subscribe</a></li>
				</ul>
			</header>
			
			<main>
				<div id="columns">
					<h2>Dell Laptops</h2>
					<div id="leftCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
                                    <img src="/assets/images/dell-xps.jpg" alt="xps" class="productImg">
                                    """),_display_(/*92.38*/for(p <-products) yield /*92.55*/ {_display_(Seq[Any](format.raw/*92.57*/("""
                                    """),_display_(/*93.38*/if(p.getId == 1)/*93.54*/ {_display_(Seq[Any](format.raw/*93.56*/("""
									"""),format.raw/*94.10*/("""<h4>"""),_display_(/*94.15*/p/*94.16*/.getName),format.raw/*94.24*/(""" """),format.raw/*94.25*/("""</h4>
									<ul>	
										<li>"""),_display_(/*96.16*/p/*96.17*/.getDescription),format.raw/*96.32*/("""</li><br>
										
										<li>"""),_display_(/*98.16*/p/*98.17*/.getStock),format.raw/*98.26*/("""</li><br>
										<li>"""),_display_(/*99.16*/p/*99.17*/.getPrice),format.raw/*99.26*/("""</li><br>
                    <li><a href="#" class="moreInfoBtn">Click for more info</a></li>
                                        """)))}),format.raw/*101.42*/("""   
                                    """),format.raw/*102.37*/("""</ul>
                                """)))}),format.raw/*103.34*/("""   
								"""),format.raw/*104.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/Alienware.png" alt="Alienware" class="productImg">
									"""),_display_(/*108.11*/for(p <-products) yield /*108.28*/ {_display_(Seq[Any](format.raw/*108.30*/("""
										"""),_display_(/*109.12*/if(p.getId == 7)/*109.28*/ {_display_(Seq[Any](format.raw/*109.30*/("""
									"""),format.raw/*110.10*/("""<h4>"""),_display_(/*110.15*/p/*110.16*/.getName),format.raw/*110.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*112.16*/p/*112.17*/.getDescription),format.raw/*112.32*/("""</li><br>
									
										<li>"""),_display_(/*114.16*/p/*114.17*/.getStock),format.raw/*114.26*/("""</li><br>
										<li>"""),_display_(/*115.16*/p/*115.17*/.getPrice),format.raw/*115.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*117.13*/("""
									"""),format.raw/*118.10*/("""</ul>
								""")))}),format.raw/*119.10*/("""
								"""),format.raw/*120.9*/("""</div>
							</div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
									<img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg">
									"""),_display_(/*131.11*/for(p <-products) yield /*131.28*/ {_display_(Seq[Any](format.raw/*131.30*/("""
										"""),_display_(/*132.12*/if(p.getId == 4)/*132.28*/ {_display_(Seq[Any](format.raw/*132.30*/("""
									"""),format.raw/*133.10*/("""<h4>"""),_display_(/*133.15*/p/*133.16*/.getName),format.raw/*133.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*135.16*/p/*135.17*/.getDescription),format.raw/*135.32*/("""  """),format.raw/*135.34*/("""</li><br>
										<li>"""),_display_(/*136.16*/p/*136.17*/.getStock),format.raw/*136.26*/("""</li><br>
										<li>"""),_display_(/*137.16*/p/*137.17*/.getPrice),format.raw/*137.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*139.13*/("""
									"""),format.raw/*140.10*/("""</ul>
								""")))}),format.raw/*141.10*/("""
								"""),format.raw/*142.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/Latitude.jpg" alt="Latitude" class="productImg">
									"""),_display_(/*146.11*/for(p <-products) yield /*146.28*/ {_display_(Seq[Any](format.raw/*146.30*/("""
										"""),_display_(/*147.12*/if(p.getId == 3)/*147.28*/ {_display_(Seq[Any](format.raw/*147.30*/("""
									"""),format.raw/*148.10*/("""<h4>"""),_display_(/*148.15*/p/*148.16*/.getName),format.raw/*148.24*/("""</h4>
									<ul>
										<li>"""),_display_(/*150.16*/p/*150.17*/.getDescription),format.raw/*150.32*/("""</li><br>
										<li>"""),_display_(/*151.16*/p/*151.17*/.getStock),format.raw/*151.26*/("""</li><br>
										<li>"""),_display_(/*152.16*/p/*152.17*/.getPrice),format.raw/*152.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*154.13*/("""
									"""),format.raw/*155.10*/("""</ul>
								""")))}),format.raw/*156.10*/("""
								"""),format.raw/*157.9*/("""</div>
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
                  SOURCE: /home/wdd/webapps/play/Project/app/views/Laptop.scala.html
                  HASH: a8e59246ab0cfcf4a5366a621d72de3476c845dc
                  MATRIX: 963->1|1090->33|1120->37|1259->149|1274->155|1341->200|3146->1977|3175->1978|3216->1992|3316->2065|3344->2066|3374->2069|4130->2798|4163->2815|4203->2817|4268->2855|4293->2871|4333->2873|4371->2883|4403->2888|4413->2889|4442->2897|4471->2898|4534->2934|4544->2935|4580->2950|4643->2986|4653->2987|4683->2996|4735->3021|4745->3022|4775->3031|4943->3167|5012->3207|5083->3246|5123->3258|5296->3403|5330->3420|5371->3422|5411->3434|5437->3450|5478->3452|5517->3462|5550->3467|5561->3468|5591->3476|5655->3512|5666->3513|5703->3528|5766->3563|5777->3564|5808->3573|5861->3598|5872->3599|5903->3608|6032->3705|6071->3715|6118->3730|6155->3739|6439->3995|6473->4012|6514->4014|6554->4026|6580->4042|6621->4044|6660->4054|6693->4059|6704->4060|6734->4068|6798->4104|6809->4105|6846->4120|6877->4122|6930->4147|6941->4148|6972->4157|7025->4182|7036->4183|7067->4192|7196->4289|7235->4299|7282->4314|7319->4323|7490->4466|7524->4483|7565->4485|7605->4497|7631->4513|7672->4515|7711->4525|7744->4530|7755->4531|7785->4539|7848->4574|7859->4575|7896->4590|7949->4615|7960->4616|7991->4625|8044->4650|8055->4651|8086->4660|8215->4757|8254->4767|8301->4782|8338->4791
                  LINES: 28->1|33->1|37->5|42->10|42->10|42->10|96->64|96->64|98->66|101->69|101->69|102->70|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|126->94|126->94|128->96|128->96|128->96|130->98|130->98|130->98|131->99|131->99|131->99|133->101|134->102|135->103|136->104|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|144->112|144->112|144->112|146->114|146->114|146->114|147->115|147->115|147->115|149->117|150->118|151->119|152->120|163->131|163->131|163->131|164->132|164->132|164->132|165->133|165->133|165->133|165->133|167->135|167->135|167->135|167->135|168->136|168->136|168->136|169->137|169->137|169->137|171->139|172->140|173->141|174->142|178->146|178->146|178->146|179->147|179->147|179->147|180->148|180->148|180->148|180->148|182->150|182->150|182->150|183->151|183->151|183->151|184->152|184->152|184->152|186->154|187->155|188->156|189->157
                  -- GENERATED --
              */
          