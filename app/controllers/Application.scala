package controllers

import com.google.inject.Inject
import models.Movie
import play.api.libs.ws.WSClient
import play.api.mvc.{Action, Controller}

class Application @Inject() (ws: WSClient) extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def listOfMovies = Action { implicit request =>
    Ok(views.html.listOfMovies(Movie.movies))
  }

  def movies = Action.async {
    ws.url("https://api.themoviedb.org/3/movie/popular?api_key=1890d4ee35de48a184176ac6ed26ddc7&language=en-US&page=1").get().map {
      response => Ok(views.html.listOfMovies(Movie.movies)(response.body))
    }
  }
}