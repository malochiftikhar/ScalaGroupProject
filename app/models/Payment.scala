package models

import play.api.data._
import play.api.data.Forms._

import scala.collection.mutable.ArrayBuffer

case class Payment(email:String,cardNo:String)

object Payment {
  val createPayment = Form(
    mapping(
      "email" -> email,
      "cardNo" -> nonEmptyText
    )(Payment.apply)(Payment.unapply)
  )
  val paid = ArrayBuffer(
    Payment("HughMann1972@Gmail.com","1234567891011121")
  )

}
