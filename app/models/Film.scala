package models

import scala.collection.mutable.ArrayBuffer

case class Film(name: String, ageRating: Int, runningTime: Double, viewings: List[Double], synopsis: String, image: Any)

object Film {
val viewings = ArrayBuffer(
  12.00,
  13.00,
  18.00,
  00.00
)

}