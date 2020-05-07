
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
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(a:  String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
 """),format.raw/*4.2*/("""<h1>Welcome to Play !!!</h1>
	<p> """),_display_(/*5.7*/a),format.raw/*5.8*/("""</p>
""")))}),format.raw/*6.2*/("""

"""))
      }
    }
  }

  def render(a:String): play.twirl.api.HtmlFormat.Appendable = apply(a)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (a) => apply(a)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-07T16:42:42.108779700
                  SOURCE: C:/Users/William/Desktop/play/play-java-seed/app/views/index.scala.html
                  HASH: 50ab4f763a76506e2bb112e489153f7416dfe0e2
                  MATRIX: 908->1|1014->14|1041->16|1072->39|1111->41|1139->43|1199->78|1219->79|1254->85
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|35->5|35->5|36->6
                  -- GENERATED --
              */
          