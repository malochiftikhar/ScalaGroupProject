package models

import play.api.data._
import play.api.data.Forms._

import scala.collection.mutable.ArrayBuffer

case class Customer(name: String, comment: String)

object Customer {

  val createCustomerForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "comment" -> nonEmptyText
    ) (Customer.apply)(Customer.unapply)
  )

  val customers = ArrayBuffer(
    Customer("Daryl", "I Love the film"),
    Customer("Ifti", "I hate this film"),
    Customer("Alex", "I don't go cinemas")
  )

}
