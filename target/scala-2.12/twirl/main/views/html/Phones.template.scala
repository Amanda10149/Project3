
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

object Phones extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

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
					<li class="dropdown"><a href="/index">Home</a></li>
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
        <div class="panel-heading">iPhone X</div>
        <div class="panel-body"><img src="/assets/images/iphoneX.jpg" alt="iPhoneX img" class="iPhoneX" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*102.10*/for(p <-products) yield /*102.27*/ {_display_(Seq[Any](format.raw/*102.29*/("""
          """),_display_(/*103.12*/if(p.getId == 2)/*103.28*/ {_display_(Seq[Any](format.raw/*103.30*/("""
"""),format.raw/*104.1*/("""<h4>"""),_display_(/*104.6*/p/*104.7*/.getName),format.raw/*104.15*/(""" """),format.raw/*104.16*/("""</h4>
<ul>	
<li>"""),_display_(/*106.6*/p/*106.7*/.getDescription),format.raw/*106.22*/("""</li><br>

<li>"""),_display_(/*108.6*/p/*108.7*/.getStock),format.raw/*108.16*/("""</li><br>
<li>"""),_display_(/*109.6*/p/*109.7*/.getPrice),format.raw/*109.16*/("""</li><br>
              """)))}),format.raw/*110.16*/("""   
          """),format.raw/*111.11*/("""</ul>
      """)))}),format.raw/*112.8*/("""   
      """),format.raw/*113.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">iPhone 7</div>
        <div class="panel-body"><img src="/assets/images/iphone7.jpg" alt="32' LG TV" class="productImg" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*119.10*/for(p <-products) yield /*119.27*/ {_display_(Seq[Any](format.raw/*119.29*/("""
          """),_display_(/*120.12*/if(p.getId == 8)/*120.28*/ {_display_(Seq[Any](format.raw/*120.30*/("""
        """),format.raw/*121.9*/("""<h4>"""),_display_(/*121.14*/p/*121.15*/.getName),format.raw/*121.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*123.16*/p/*123.17*/.getDescription),format.raw/*123.32*/("""  """),format.raw/*123.34*/("""</li><br>
          <li>"""),_display_(/*124.16*/p/*124.17*/.getStock),format.raw/*124.26*/("""</li><br>
          <li>"""),_display_(/*125.16*/p/*125.17*/.getPrice),format.raw/*125.26*/("""</li><br>
          
            """)))}),format.raw/*127.14*/("""
        """),format.raw/*128.9*/("""</ul>
      """)))}),format.raw/*129.8*/("""
      """),format.raw/*130.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">iPhone 6</div>
        <div class="panel-body"><img src="/assets/images/iphone6.jpg" alt="32' LG TV" class="productImg" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*136.10*/for(p <-products) yield /*136.27*/ {_display_(Seq[Any](format.raw/*136.29*/("""
          """),_display_(/*137.12*/if(p.getId == 5)/*137.28*/ {_display_(Seq[Any](format.raw/*137.30*/("""
        """),format.raw/*138.9*/("""<h4>"""),_display_(/*138.14*/p/*138.15*/.getName),format.raw/*138.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*140.16*/p/*140.17*/.getDescription),format.raw/*140.32*/("""</li><br>
        
          <li>"""),_display_(/*142.16*/p/*142.17*/.getStock),format.raw/*142.26*/("""</li><br>
          <li>"""),_display_(/*143.16*/p/*143.17*/.getPrice),format.raw/*143.26*/("""</li><br>
          
            """)))}),format.raw/*145.14*/("""
        """),format.raw/*146.9*/("""</ul>
      """)))}),format.raw/*147.8*/("""
      """),format.raw/*148.7*/("""</div>
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
                  SOURCE: /home/wdd/webapps/attempt/app/views/Phones.scala.html
                  HASH: a35fba38df05cf46696d4a46d844e3df1434591a
                  MATRIX: 963->1|1090->33|1118->35|1256->147|1270->153|1336->198|4968->3802|5002->3819|5043->3821|5083->3833|5109->3849|5150->3851|5179->3852|5211->3857|5221->3858|5251->3866|5281->3867|5325->3884|5335->3885|5372->3900|5415->3916|5425->3917|5456->3926|5498->3941|5508->3942|5539->3951|5596->3976|5639->3990|5683->4003|5721->4013|6060->4324|6094->4341|6135->4343|6175->4355|6201->4371|6242->4373|6279->4382|6312->4387|6323->4388|6353->4396|6416->4431|6427->4432|6464->4447|6495->4449|6548->4474|6559->4475|6590->4484|6643->4509|6654->4510|6685->4519|6751->4553|6788->4562|6832->4575|6867->4582|7207->4894|7241->4911|7282->4913|7322->4925|7348->4941|7389->4943|7426->4952|7459->4957|7470->4958|7500->4966|7563->5001|7574->5002|7611->5017|7673->5051|7684->5052|7715->5061|7768->5086|7779->5087|7810->5096|7876->5130|7913->5139|7957->5152|7992->5159
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|134->102|134->102|134->102|135->103|135->103|135->103|136->104|136->104|136->104|136->104|136->104|138->106|138->106|138->106|140->108|140->108|140->108|141->109|141->109|141->109|142->110|143->111|144->112|145->113|151->119|151->119|151->119|152->120|152->120|152->120|153->121|153->121|153->121|153->121|155->123|155->123|155->123|155->123|156->124|156->124|156->124|157->125|157->125|157->125|159->127|160->128|161->129|162->130|168->136|168->136|168->136|169->137|169->137|169->137|170->138|170->138|170->138|170->138|172->140|172->140|172->140|174->142|174->142|174->142|175->143|175->143|175->143|177->145|178->146|179->147|180->148
                  -- GENERATED --
              */
          