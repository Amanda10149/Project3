
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


    

				
				<ul id="navbar">
				<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/Laptop">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
					<li class="dropdown"><a href="/FAQ">FAQ</a></li>
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
                                    """),_display_(/*86.38*/for(p <-products) yield /*86.55*/ {_display_(Seq[Any](format.raw/*86.57*/("""
                                    """),_display_(/*87.38*/if(p.getId == 1)/*87.54*/ {_display_(Seq[Any](format.raw/*87.56*/("""
									"""),format.raw/*88.10*/("""<h4>"""),_display_(/*88.15*/p/*88.16*/.getName),format.raw/*88.24*/(""" """),format.raw/*88.25*/("""</h4>
									<ul>	
										<li>"""),_display_(/*90.16*/p/*90.17*/.getDescription),format.raw/*90.32*/("""</li><br>
										
										<li>"""),_display_(/*92.16*/p/*92.17*/.getStock),format.raw/*92.26*/("""</li><br>
										<li>"""),_display_(/*93.16*/p/*93.17*/.getPrice),format.raw/*93.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
										<td>
											<a href=""""),_display_(/*96.22*/routes/*96.28*/.HomeController.deleteProduct(p.getId)),format.raw/*96.66*/("""" class="button-xs btn-danger" onclick="confirm confirmDel();">
												<span class="glyphicon-trash"></span>
											</a>
										</td>
                                        """)))}),format.raw/*100.42*/("""   
                                    """),format.raw/*101.37*/("""</ul>
                                """)))}),format.raw/*102.34*/("""   
								"""),format.raw/*103.9*/("""</div>
								
				
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
										<td>
											<a href=""""),_display_(/*118.22*/routes/*118.28*/.HomeController.deleteProduct(p.getId)),format.raw/*118.66*/("""" class="button-xs btn-danger">
												<span class="glyphicon-trash"></span>
											</a>
										</td>
											""")))}),format.raw/*122.13*/("""
									"""),format.raw/*123.10*/("""</ul>
								""")))}),format.raw/*124.10*/("""
								"""),format.raw/*125.9*/("""</div>
							</div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
									<img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg">
									"""),_display_(/*136.11*/for(p <-products) yield /*136.28*/ {_display_(Seq[Any](format.raw/*136.30*/("""
										"""),_display_(/*137.12*/if(p.getId == 4)/*137.28*/ {_display_(Seq[Any](format.raw/*137.30*/("""
									"""),format.raw/*138.10*/("""<h4>"""),_display_(/*138.15*/p/*138.16*/.getName),format.raw/*138.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*140.16*/p/*140.17*/.getDescription),format.raw/*140.32*/("""  """),format.raw/*140.34*/("""</li><br>
										<li>"""),_display_(/*141.16*/p/*141.17*/.getStock),format.raw/*141.26*/("""</li><br>
										<li>"""),_display_(/*142.16*/p/*142.17*/.getPrice),format.raw/*142.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
										<!-- Deleting the Product-->
										<td>
											<a href=""""),_display_(/*146.22*/routes/*146.28*/.HomeController.deleteProduct(p.getId)),format.raw/*146.66*/("""" class="button-xs btn-danger">
												<span class="glyphicon-trash"></span>
											</a>
										</td>
											""")))}),format.raw/*150.13*/("""
									"""),format.raw/*151.10*/("""</ul>
								""")))}),format.raw/*152.10*/("""
								"""),format.raw/*153.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/Latitude.jpg" alt="Latitude" class="productImg">
									"""),_display_(/*157.11*/for(p <-products) yield /*157.28*/ {_display_(Seq[Any](format.raw/*157.30*/("""
										"""),_display_(/*158.12*/if(p.getId == 3)/*158.28*/ {_display_(Seq[Any](format.raw/*158.30*/("""
									"""),format.raw/*159.10*/("""<h4>"""),_display_(/*159.15*/p/*159.16*/.getName),format.raw/*159.24*/("""</h4>
									<ul>
										<li>"""),_display_(/*161.16*/p/*161.17*/.getDescription),format.raw/*161.32*/("""</li><br>
										<li>"""),_display_(/*162.16*/p/*162.17*/.getStock),format.raw/*162.26*/("""</li><br>
										<li>"""),_display_(/*163.16*/p/*163.17*/.getPrice),format.raw/*163.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
										<td>
											<a href=""""),_display_(/*166.22*/routes/*166.28*/.HomeController.deleteProduct(p.getId)),format.raw/*166.66*/("""" class="button-xs btn-danger">
												<span class="glyphicon-trash"></span>
											</a>
										</td>
											""")))}),format.raw/*170.13*/("""
									"""),format.raw/*171.10*/("""</ul>
								""")))}),format.raw/*172.10*/("""
								"""),format.raw/*173.9*/("""</div>
							</div>
						</div>
					</div>

					<p>
							<a href=""""),_display_(/*179.18*/routes/*179.24*/.HomeController.addProduct()),format.raw/*179.52*/("""">
								<button class="btn btn-primary">Add a product</button>
							</a>
					</p>
					
					<div id="bottomCol">
						<div class="outerColDiv">
							
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
                  DATE: Mon Apr 16 17:43:51 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/Laptop.scala.html
                  HASH: efad70eedd4fb610e25f78a94ef74d0a78299f43
                  MATRIX: 963->1|1090->33|1120->37|1259->149|1274->155|1341->200|3831->2663|3864->2680|3904->2682|3969->2720|3994->2736|4034->2738|4072->2748|4104->2753|4114->2754|4143->2762|4172->2763|4235->2799|4245->2800|4281->2815|4344->2851|4354->2852|4384->2861|4436->2886|4446->2887|4476->2896|4624->3017|4639->3023|4698->3061|4917->3248|4986->3288|5057->3327|5097->3339|5275->3489|5309->3506|5350->3508|5390->3520|5416->3536|5457->3538|5496->3548|5529->3553|5540->3554|5570->3562|5634->3598|5645->3599|5682->3614|5745->3649|5756->3650|5787->3659|5840->3684|5851->3685|5882->3694|6031->3815|6047->3821|6107->3859|6265->3985|6304->3995|6351->4010|6388->4019|6672->4275|6706->4292|6747->4294|6787->4306|6813->4322|6854->4324|6893->4334|6926->4339|6937->4340|6967->4348|7031->4384|7042->4385|7079->4400|7110->4402|7163->4427|7174->4428|7205->4437|7258->4462|7269->4463|7300->4472|7488->4632|7504->4638|7564->4676|7722->4802|7761->4812|7808->4827|7845->4836|8016->4979|8050->4996|8091->4998|8131->5010|8157->5026|8198->5028|8237->5038|8270->5043|8281->5044|8311->5052|8374->5087|8385->5088|8422->5103|8475->5128|8486->5129|8517->5138|8570->5163|8581->5164|8612->5173|8761->5294|8777->5300|8837->5338|8995->5464|9034->5474|9081->5489|9118->5498|9219->5571|9235->5577|9285->5605
                  LINES: 28->1|33->1|37->5|42->10|42->10|42->10|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|120->88|120->88|122->90|122->90|122->90|124->92|124->92|124->92|125->93|125->93|125->93|128->96|128->96|128->96|132->100|133->101|134->102|135->103|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|144->112|144->112|144->112|146->114|146->114|146->114|147->115|147->115|147->115|150->118|150->118|150->118|154->122|155->123|156->124|157->125|168->136|168->136|168->136|169->137|169->137|169->137|170->138|170->138|170->138|170->138|172->140|172->140|172->140|172->140|173->141|173->141|173->141|174->142|174->142|174->142|178->146|178->146|178->146|182->150|183->151|184->152|185->153|189->157|189->157|189->157|190->158|190->158|190->158|191->159|191->159|191->159|191->159|193->161|193->161|193->161|194->162|194->162|194->162|195->163|195->163|195->163|198->166|198->166|198->166|202->170|203->171|204->172|205->173|211->179|211->179|211->179
                  -- GENERATED --
              */
          