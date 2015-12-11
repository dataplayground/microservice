package controllers

import controllers.actors.MyWebSocketActor
import org.slf4j.LoggerFactory
import play.api._
import play.api.libs.json.JsValue
import play.api.mvc._

class Application extends Controller {

  implicit val app = play.api.Play.current
  val logger = LoggerFactory.getLogger(this.getClass)


  def index = Action {
    Ok(views.html.app())
  }

  def socket = WebSocket.acceptWithActor[JsValue, JsValue] { request => out =>
    Logger.debug("received socket something  " + out)
    MyWebSocketActor.props(out)
  }

}
