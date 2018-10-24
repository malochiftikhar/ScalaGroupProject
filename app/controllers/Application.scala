package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def individualMoviePage = Action {
    Ok(views.html.individualMoviePage())
  }

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}