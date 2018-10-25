package models

import scala.collection.mutable.ArrayBuffer

case class Viewing(name: String, viewingTimes: ArrayBuffer[String])

object Viewing {
  val theViewings = ArrayBuffer(
    Viewing("LOTR", ArrayBuffer("8:00","10:00", "11:00","12:00","13:00","18:00","00:00"))
  )
}
