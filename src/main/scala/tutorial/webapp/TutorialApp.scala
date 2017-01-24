package tutorial.webapp

import scala.scalajs.js.JSApp

import org.scalajs.jquery.jQuery
import com.scalawarrior.scalajs.ace._

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
    val editor = ace.edit("editor")
  }

  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World</p>")
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }
}
