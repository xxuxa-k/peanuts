package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._

@Singleton
class CharacterController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def index() = Action {
    val json: JsValue =
      Json.obj("hoge" -> "hage", "foo" -> "bar")

    Ok(json)
  }
}
