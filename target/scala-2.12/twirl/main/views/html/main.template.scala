
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

<title>Computer Hub - """),_display_(/*11.24*/title),format.raw/*11.29*/("""</title>

<!-- Bootstrap Core CSS -->

</head>

<body>


<container>

<div class="row">

<div class="col-md-12">

"""),_display_(/*26.2*/content),format.raw/*26.9*/("""
"""),format.raw/*27.1*/("""l
</div>

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
                  DATE: Mon Apr 16 20:57:31 IST 2018
                  SOURCE: /home/wdd/webapps/attempt/app/views/main.scala.html
                  HASH: 9689150c985ba95f3b02d47cdc85e029a7c28599
                  MATRIX: 952->1|1077->31|1105->33|1222->123|1248->128|1389->243|1416->250|1444->251
                  LINES: 28->1|33->1|35->3|43->11|43->11|58->26|58->26|59->27
                  -- GENERATED --
              */
          