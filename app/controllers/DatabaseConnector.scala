package controllers

import models.AvailableTimes
import slick.jdbc.MySQLProfile.api._

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success, Try}

object DatabaseConnector {

  val db = Database.forConfig("mysqlDB")
val FilmViewingsTable = TableQuery[AvailableTimes]
}
