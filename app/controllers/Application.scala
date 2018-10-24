package controllers

import javax.inject.Inject

import models.Payment
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

class Application @Inject()(val messagesApi: MessagesApi, environment: play.api.Environment) extends Controller with I18nSupport {

  def confirmPayment = Action { implicit request =>
    Ok(views.html.confirmPayment(Payment.paid, Payment.createPayment))
  }

  def pay = Action { implicit request =>
    val formValidationResult = Payment.createPayment.bindFromRequest
    formValidationResult.fold({ formWithErrors =>
      BadRequest(views.html.confirmPayment(Payment.paid, formWithErrors))
    }, {payer =>
      Payment.paid.append(payer)
      Redirect(routes.Application.confirmPayment)
    })
  }

}