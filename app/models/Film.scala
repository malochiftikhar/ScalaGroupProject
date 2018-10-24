package models

case class Film(film_id: Int, name: String, ageRating: Int, runningTime: Double, availableTimes: Map[Int, Double], synopsis: String, image: Any)

object Film {

}