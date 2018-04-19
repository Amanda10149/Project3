
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*5.98*/("""">

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
.carousel-inner img """),format.raw/*65.21*/("""{"""),format.raw/*65.22*/("""

"""),format.raw/*67.1*/("""width: 50%; /* Set width to 100% */
margin: auto;
height:80%;
"""),format.raw/*70.1*/("""}"""),format.raw/*70.2*/("""
"""),format.raw/*71.1*/("""</style>

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

"""),_display_(/*101.2*/main("Add Product")/*101.21*/ {_display_(Seq[Any](format.raw/*101.23*/("""
    """),format.raw/*102.5*/("""<p class="lead">Add a new product</p>

    """),_display_(/*104.6*/form(action=routes.HomeController.addQuestionSubmit(), 'class -> "form-horizontal", 'role -> "form")/*104.106*/{_display_(Seq[Any](format.raw/*104.107*/("""
        """),format.raw/*105.37*/("""
        """),format.raw/*106.99*/("""
        """),_display_(/*107.10*/CSRF/*107.14*/.formField),format.raw/*107.24*/("""


        """),_display_(/*110.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*110.85*/("""
        """),_display_(/*111.10*/inputText(productForm("descripton"), '_label -> "descripton", 'class -> "form-control")),format.raw/*111.97*/("""
        """),_display_(/*112.10*/inputText(productForm("stock"), '_label -> "stock", 'class -> "form-control")),format.raw/*112.87*/("""
        """),_display_(/*113.10*/inputText(productForm("price"), '_label -> "stock", 'class -> "form-control")),format.raw/*113.87*/("""
        

       


        """),format.raw/*119.9*/("""<div class="actions">
                <input type="submit" value="Add/Update Product" class="btn btn-primary">
                <a href=""""),_display_(/*121.27*/routes/*121.33*/.HomeController.index),format.raw/*121.54*/("""">
                    <button type="button" class="btn btn-warning"> Cancel </button>
                
                </a>
        </div>
    """)))}),format.raw/*126.6*/("""   
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 14:44:00 IST 2018
                  SOURCE: /home/wdd/webapps/newWorkingVersion/Project3/app/views/addProduct.scala.html
                  HASH: a341a8d822a40a0c16c486ebf897378dc047c448
                  MATRIX: 967->1|1075->39|1120->36|1148->55|1175->56|1247->102|1261->108|1326->153|3356->2155|3385->2156|3414->2158|3503->2220|3531->2221|3559->2222|4777->3413|4806->3432|4847->3434|4880->3439|4951->3483|5062->3583|5103->3584|5141->3621|5179->3720|5217->3730|5231->3734|5263->3744|5303->3756|5400->3831|5438->3841|5547->3928|5585->3938|5684->4015|5722->4025|5821->4102|5878->4131|6043->4268|6059->4274|6102->4295|6278->4440
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|37->5|97->65|97->65|99->67|102->70|102->70|103->71|133->101|133->101|133->101|134->102|136->104|136->104|136->104|137->105|138->106|139->107|139->107|139->107|142->110|142->110|143->111|143->111|144->112|144->112|145->113|145->113|151->119|153->121|153->121|153->121|158->126
                  -- GENERATED --
              */
          