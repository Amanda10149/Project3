
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
                                    """),_display_(/*92.38*/for(p <-products) yield /*92.55*/ {_display_(Seq[Any](format.raw/*92.57*/("""
                                    """),_display_(/*93.38*/if(p.getId == 1)/*93.54*/ {_display_(Seq[Any](format.raw/*93.56*/("""
									"""),format.raw/*94.10*/("""<h4>"""),_display_(/*94.15*/p/*94.16*/.getName),format.raw/*94.24*/(""" """),format.raw/*94.25*/("""</h4>
									<ul>	
										<li>"""),_display_(/*96.16*/p/*96.17*/.getDescription),format.raw/*96.32*/("""</li><br>
										
										<li>"""),_display_(/*98.16*/p/*98.17*/.getStock),format.raw/*98.26*/("""</li><br>
										<li>"""),_display_(/*99.16*/p/*99.17*/.getPrice),format.raw/*99.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
										<td>
											<a href=""""),_display_(/*102.22*/routes/*102.28*/.HomeController.deleteProduct(p.getId)),format.raw/*102.66*/("""" class="button-xs btn-danger" onclick="confirm confirmDel();">
												<span class="glyphicon-trash"></span>
											</a>
										</td>
                                        """)))}),format.raw/*106.42*/("""   
                                    """),format.raw/*107.37*/("""</ul>
                                """)))}),format.raw/*108.34*/("""   
								"""),format.raw/*109.9*/("""</div>
								
				
								<div class="productInfo">
									<img src="/assets/images/Alienware.png" alt="Alienware" class="productImg">
									"""),_display_(/*114.11*/for(p <-products) yield /*114.28*/ {_display_(Seq[Any](format.raw/*114.30*/("""
										"""),_display_(/*115.12*/if(p.getId == 7)/*115.28*/ {_display_(Seq[Any](format.raw/*115.30*/("""
									"""),format.raw/*116.10*/("""<h4>"""),_display_(/*116.15*/p/*116.16*/.getName),format.raw/*116.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*118.16*/p/*118.17*/.getDescription),format.raw/*118.32*/("""</li><br>
									
										<li>"""),_display_(/*120.16*/p/*120.17*/.getStock),format.raw/*120.26*/("""</li><br>
										<li>"""),_display_(/*121.16*/p/*121.17*/.getPrice),format.raw/*121.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
										<td>
											<a href=""""),_display_(/*124.22*/routes/*124.28*/.HomeController.deleteProduct(p.getId)),format.raw/*124.66*/("""" class="button-xs btn-danger">
												<span class="glyphicon-trash"></span>
											</a>
										</td>
											""")))}),format.raw/*128.13*/("""
									"""),format.raw/*129.10*/("""</ul>
								""")))}),format.raw/*130.10*/("""
								"""),format.raw/*131.9*/("""</div>
							</div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
									<img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg">
									"""),_display_(/*142.11*/for(p <-products) yield /*142.28*/ {_display_(Seq[Any](format.raw/*142.30*/("""
										"""),_display_(/*143.12*/if(p.getId == 4)/*143.28*/ {_display_(Seq[Any](format.raw/*143.30*/("""
									"""),format.raw/*144.10*/("""<h4>"""),_display_(/*144.15*/p/*144.16*/.getName),format.raw/*144.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*146.16*/p/*146.17*/.getDescription),format.raw/*146.32*/("""  """),format.raw/*146.34*/("""</li><br>
										<li>"""),_display_(/*147.16*/p/*147.17*/.getStock),format.raw/*147.26*/("""</li><br>
										<li>"""),_display_(/*148.16*/p/*148.17*/.getPrice),format.raw/*148.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
										<!-- Deleting the Product-->
										<td>
											<a href=""""),_display_(/*152.22*/routes/*152.28*/.HomeController.deleteProduct(p.getId)),format.raw/*152.66*/("""" class="button-xs btn-danger">
												<span class="glyphicon-trash"></span>
											</a>
										</td>
											""")))}),format.raw/*156.13*/("""
									"""),format.raw/*157.10*/("""</ul>
								""")))}),format.raw/*158.10*/("""
								"""),format.raw/*159.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/Latitude.jpg" alt="Latitude" class="productImg">
									"""),_display_(/*163.11*/for(p <-products) yield /*163.28*/ {_display_(Seq[Any](format.raw/*163.30*/("""
										"""),_display_(/*164.12*/if(p.getId == 3)/*164.28*/ {_display_(Seq[Any](format.raw/*164.30*/("""
									"""),format.raw/*165.10*/("""<h4>"""),_display_(/*165.15*/p/*165.16*/.getName),format.raw/*165.24*/("""</h4>
									<ul>
										<li>"""),_display_(/*167.16*/p/*167.17*/.getDescription),format.raw/*167.32*/("""</li><br>
										<li>"""),_display_(/*168.16*/p/*168.17*/.getStock),format.raw/*168.26*/("""</li><br>
										<li>"""),_display_(/*169.16*/p/*169.17*/.getPrice),format.raw/*169.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
										<td>
											<a href=""""),_display_(/*172.22*/routes/*172.28*/.HomeController.deleteProduct(p.getId)),format.raw/*172.66*/("""" class="button-xs btn-danger">
												<span class="glyphicon-trash"></span>
											</a>
										</td>
											""")))}),format.raw/*176.13*/("""
									"""),format.raw/*177.10*/("""</ul>
								""")))}),format.raw/*178.10*/("""
								"""),format.raw/*179.9*/("""</div>
							</div>
						</div>
					</div>

					<p>
							<a href=""""),_display_(/*185.18*/routes/*185.24*/.HomeController.addProduct()),format.raw/*185.52*/("""">
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
                  DATE: Mon Apr 16 15:49:44 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/Laptop.scala.html
                  HASH: e8e6959fe54316824d5a8bb01cb51a4d3e39d126
                  MATRIX: 963->1|1090->33|1120->37|1259->149|1274->155|1341->200|3146->1977|3175->1978|3216->1992|3316->2065|3344->2066|3374->2069|4122->2790|4155->2807|4195->2809|4260->2847|4285->2863|4325->2865|4363->2875|4395->2880|4405->2881|4434->2889|4463->2890|4526->2926|4536->2927|4572->2942|4635->2978|4645->2979|4675->2988|4727->3013|4737->3014|4767->3023|4916->3144|4932->3150|4992->3188|5211->3375|5280->3415|5351->3454|5391->3466|5569->3616|5603->3633|5644->3635|5684->3647|5710->3663|5751->3665|5790->3675|5823->3680|5834->3681|5864->3689|5928->3725|5939->3726|5976->3741|6039->3776|6050->3777|6081->3786|6134->3811|6145->3812|6176->3821|6325->3942|6341->3948|6401->3986|6559->4112|6598->4122|6645->4137|6682->4146|6966->4402|7000->4419|7041->4421|7081->4433|7107->4449|7148->4451|7187->4461|7220->4466|7231->4467|7261->4475|7325->4511|7336->4512|7373->4527|7404->4529|7457->4554|7468->4555|7499->4564|7552->4589|7563->4590|7594->4599|7782->4759|7798->4765|7858->4803|8016->4929|8055->4939|8102->4954|8139->4963|8310->5106|8344->5123|8385->5125|8425->5137|8451->5153|8492->5155|8531->5165|8564->5170|8575->5171|8605->5179|8668->5214|8679->5215|8716->5230|8769->5255|8780->5256|8811->5265|8864->5290|8875->5291|8906->5300|9055->5421|9071->5427|9131->5465|9289->5591|9328->5601|9375->5616|9412->5625|9513->5698|9529->5704|9579->5732
                  LINES: 28->1|33->1|37->5|42->10|42->10|42->10|96->64|96->64|98->66|101->69|101->69|102->70|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|126->94|126->94|128->96|128->96|128->96|130->98|130->98|130->98|131->99|131->99|131->99|134->102|134->102|134->102|138->106|139->107|140->108|141->109|146->114|146->114|146->114|147->115|147->115|147->115|148->116|148->116|148->116|148->116|150->118|150->118|150->118|152->120|152->120|152->120|153->121|153->121|153->121|156->124|156->124|156->124|160->128|161->129|162->130|163->131|174->142|174->142|174->142|175->143|175->143|175->143|176->144|176->144|176->144|176->144|178->146|178->146|178->146|178->146|179->147|179->147|179->147|180->148|180->148|180->148|184->152|184->152|184->152|188->156|189->157|190->158|191->159|195->163|195->163|195->163|196->164|196->164|196->164|197->165|197->165|197->165|197->165|199->167|199->167|199->167|200->168|200->168|200->168|201->169|201->169|201->169|204->172|204->172|204->172|208->176|209->177|210->178|211->179|217->185|217->185|217->185
                  -- GENERATED --
              */
          