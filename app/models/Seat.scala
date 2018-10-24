package models

import play.api.data._
import play.api.data.Forms._

import scala.collection.immutable.Range
import scala.collection.mutable.ArrayBuffer

case class Seat(seatID: Int) {

  object Seats {

    val Seats = ArrayBuffer(
      ("1A", true), ("1B", true), ("1C", true), ("1D", true), ("1E", true), ("1F", true), ("1G", true),
      ("2A", true), ("2B", true), ("2C", true), ("2D", true), ("2E", true), ("2F", true), ("2G", true),
      ("3A", true), ("3B", true), ("3C", true), ("3D", true), ("3E", true), ("3F", true), ("3G", true),
      ("4A", true), ("4B", true), ("4C", true), ("4D", true), ("4E", true), ("4F", true), ("4G", true),
      ("5A", true), ("5B", true), ("5C", true), ("5D", true), ("5E", true), ("5F", true), ("5G", true),
      ("6A", true), ("6B", true), ("6C", true), ("6D", true), ("6E", true), ("6F", true), ("6G", true),
      ("7A", true), ("7B", true), ("7C", true), ("7D", true), ("7E", true), ("7F", true), ("7G", true),
      ("8A", true), ("8B", true), ("8C", true), ("8D", true), ("8E", true), ("8F", true), ("8G", true),
      ("9A", true), ("9B", true), ("9C", true), ("9D", true), ("9E", true), ("9F", true), ("9G", true),
      ("10A", true), ("10B", true), ("10C", true), ("10D", true), ("10E", true), ("10F", true), ("10G", true)
    )


    def changeOccupied(id: String) = {
      Seats filter (_._1==id)
    }

  }
}
