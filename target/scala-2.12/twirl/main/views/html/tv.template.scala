
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
      <a class="navbar-brand" href="/"><span class="glyphicon glyphicon-home"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
					<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/Laptop">Laptops</a></li>
          <li class="dropdown"><a href="/about">About Us</a></li>
          <li class="dropdown"><a href="/FAQ">FAQ</a></li>
          <li class="dropdown"><a href="/login">Login</a></li>
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
        """),_display_(/*104.10*/for(p <-products) yield /*104.27*/ {_display_(Seq[Any](format.raw/*104.29*/("""
          """),_display_(/*105.12*/if(p.getId == 9)/*105.28*/ {_display_(Seq[Any](format.raw/*105.30*/("""
        """),format.raw/*106.9*/("""<h4>"""),_display_(/*106.14*/p/*106.15*/.getName),format.raw/*106.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*108.16*/p/*108.17*/.getDescription),format.raw/*108.32*/("""</li><br>
          <li>"""),_display_(/*109.16*/p/*109.17*/.getStock),format.raw/*109.26*/("""</li><br>
          <li>"""),_display_(/*110.16*/p/*110.17*/.getPrice),format.raw/*110.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*112.23*/routes/*112.29*/.HomeController.deleteProduct(p.getId)),format.raw/*112.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*117.14*/("""
        """),format.raw/*118.9*/("""</ul>
          """)))}),format.raw/*119.12*/("""
      """),format.raw/*120.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Samsung 40 Inch Full HD TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img2.jpg" alt="40' Samsung TV" class="productImg" style="height: 13em"></div>
        """),_display_(/*126.10*/for(p <-products) yield /*126.27*/ {_display_(Seq[Any](format.raw/*126.29*/("""
          """),_display_(/*127.12*/if(p.getId == 10)/*127.29*/ {_display_(Seq[Any](format.raw/*127.31*/("""
        """),format.raw/*128.9*/("""<h4>"""),_display_(/*128.14*/p/*128.15*/.getName),format.raw/*128.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*130.16*/p/*130.17*/.getDescription),format.raw/*130.32*/("""</li><br>
          <li>"""),_display_(/*131.16*/p/*131.17*/.getStock),format.raw/*131.26*/("""</li><br>
          <li>"""),_display_(/*132.16*/p/*132.17*/.getPrice),format.raw/*132.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*134.23*/routes/*134.29*/.HomeController.deleteProduct(p.getId)),format.raw/*134.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*139.14*/("""
        """),format.raw/*140.9*/("""</ul>
          """)))}),format.raw/*141.12*/("""
      """),format.raw/*142.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Samsung 49 Inch Full HD Smart TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img3.jpg" alt="49' Samsung TV" class="productImg" style="height: 13em;"></div>
        """),_display_(/*148.10*/for(p <-products) yield /*148.27*/ {_display_(Seq[Any](format.raw/*148.29*/("""
          """),_display_(/*149.12*/if(p.getId == 6)/*149.28*/ {_display_(Seq[Any](format.raw/*149.30*/("""
        """),format.raw/*150.9*/("""<h4>"""),_display_(/*150.14*/p/*150.15*/.getName),format.raw/*150.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*152.16*/p/*152.17*/.getDescription),format.raw/*152.32*/("""</li><br>
          <li>"""),_display_(/*153.16*/p/*153.17*/.getStock),format.raw/*153.26*/("""</li><br>
          <li>"""),_display_(/*154.16*/p/*154.17*/.getPrice),format.raw/*154.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*156.23*/routes/*156.29*/.HomeController.deleteProduct(p.getId)),format.raw/*156.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*161.14*/("""
        """),format.raw/*162.9*/("""</ul>
          """)))}),format.raw/*163.12*/("""
      """),format.raw/*164.7*/("""</div>
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
                  DATE: Thu Apr 19 14:32:57 IST 2018
                  SOURCE: /home/wdd/webapps/newWorkingVersion/Project3/app/views/tv.scala.html
                  HASH: b199b0118e223487f6fe07baa8744f8f01deed29
                  MATRIX: 959->1|1086->33|1114->35|1252->147|1266->153|1332->198|5067->3905|5101->3922|5142->3924|5182->3936|5208->3952|5249->3954|5286->3963|5319->3968|5330->3969|5360->3977|5423->4012|5434->4013|5471->4028|5524->4053|5535->4054|5566->4063|5619->4088|5630->4089|5661->4098|5736->4145|5752->4151|5812->4189|5985->4330|6022->4339|6071->4356|6106->4363|6441->4670|6475->4687|6516->4689|6556->4701|6583->4718|6624->4720|6661->4729|6694->4734|6705->4735|6735->4743|6798->4778|6809->4779|6846->4794|6899->4819|6910->4820|6941->4829|6994->4854|7005->4855|7036->4864|7111->4911|7127->4917|7187->4955|7360->5096|7397->5105|7446->5122|7481->5129|7824->5444|7858->5461|7899->5463|7939->5475|7965->5491|8006->5493|8043->5502|8076->5507|8087->5508|8117->5516|8180->5551|8191->5552|8228->5567|8281->5592|8292->5593|8323->5602|8376->5627|8387->5628|8418->5637|8493->5684|8509->5690|8569->5728|8742->5869|8779->5878|8828->5895|8863->5902
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|136->104|136->104|136->104|137->105|137->105|137->105|138->106|138->106|138->106|138->106|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|144->112|144->112|144->112|149->117|150->118|151->119|152->120|158->126|158->126|158->126|159->127|159->127|159->127|160->128|160->128|160->128|160->128|162->130|162->130|162->130|163->131|163->131|163->131|164->132|164->132|164->132|166->134|166->134|166->134|171->139|172->140|173->141|174->142|180->148|180->148|180->148|181->149|181->149|181->149|182->150|182->150|182->150|182->150|184->152|184->152|184->152|185->153|185->153|185->153|186->154|186->154|186->154|188->156|188->156|188->156|193->161|194->162|195->163|196->164
                  -- GENERATED --
              */
          