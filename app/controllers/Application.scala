package controllers

import javax.inject.Inject
import models.Viewing
import play.api._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

import scala.collection.mutable.ArrayBuffer

class Application @Inject()(val messagesApi: MessagesApi, environment: play.api.Environment) extends Controller with I18nSupport {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def individualFilmPage = Action { implicit request =>
    Ok(views.html.individualFilmPage(Viewing.theViewings))
  }


}