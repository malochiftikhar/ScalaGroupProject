package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }


  def screenBooking = Action {
   Ok(views.html.screenBooking("starting screen booking"))
  }

}