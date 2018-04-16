
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Online Shop - """),_display_(/*11.23*/title),format.raw/*11.28*/("""</title>

<!-- Bootstrap Core CSS -->

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS --> <link href=""""),_display_(/*17.34*/routes/*17.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.81*/("""" rel="stylesheet" />

</head>

<body>

<nav class="navbar navbar-inverse">

<div class="container-fluid">

<div class="navbar-header">

<a class="navbar-brand" href="#">Online Shop</a>

</div>

<ul class="nav navbar-nav">
<li """),_display_(/*34.6*/if(title=="Products")/*34.27*/{_display_(Seq[Any](format.raw/*34.28*/("""class="active"""")))}),format.raw/*34.43*/(""">
    <a href=""""),_display_(/*35.15*/routes/*35.21*/.HomeController.index()),format.raw/*35.44*/("""">Products</a>
</li>

<li class="active"><a href="#">About</a></li>

<li><a href="#">Services</a></li>

<li><a href="#">Contact</a></li>
<li """),_display_(/*43.6*/if(title=="Login")/*43.24*/{_display_(Seq[Any](format.raw/*43.25*/("""class="active"""")))}),format.raw/*43.40*/(""">
    <a href=""""),_display_(/*44.15*/routes/*44.21*/.LoginController.login()),format.raw/*44.45*/("""">Login</a>
</li>

</ul>

</div>

</nav>

<container>

<div class="row">

<div class="col-md-12">

"""),_display_(/*59.2*/content),format.raw/*59.9*/("""

"""),format.raw/*61.1*/("""</div>

</div>

</container>

<container>

<div class="row">

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</div>

</container>

</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 16 15:49:44 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/main.scala.html
                  HASH: fa101c1370c63dc756714f991602bba5b69043e5
                  MATRIX: 952->1|1077->31|1105->33|1221->122|1247->127|1446->299|1461->305|1523->346|1777->574|1807->595|1846->596|1892->611|1935->627|1950->633|1994->656|2162->798|2189->816|2228->817|2274->832|2317->848|2332->854|2377->878|2503->978|2530->985|2559->987
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|66->34|66->34|66->34|66->34|67->35|67->35|67->35|75->43|75->43|75->43|75->43|76->44|76->44|76->44|91->59|91->59|93->61
                  -- GENERATED --
              */
          