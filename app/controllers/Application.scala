package controllers
import java.awt.image.BufferedImage

import models.Film
import play.api._
import play.api.mvc._

class Application extends Controller {

  def individualMoviePage = Action { implicit request =>
    Ok(views.html.individualMoviePage(Film.viewings))
  }

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}