package models

import slick.jdbc.MySQLProfile.api._

class AvailableTimes(tag: Tag) extends Table[(Int, Int, String)](tag, "AVAILABLETIMES") {
def timeslot_id = column[Int]("PER_TIMESLOT_ID", O.PrimaryKey, O.AutoInc)
  def film_id = column[Int]("PER_FILM_ID")
  def time = column[String]("PER_TIME")
  def * = (timeslot_id, film_id, time)
}