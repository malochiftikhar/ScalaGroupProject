package controllers

import models.Customer
import javax.inject.Inject
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

class Applications @Inject() (val messagesApi: MessagesApi, environment: play.api.Environment) extends Controller with I18nSupport {

  def listCustomers = Action { implicit request =>
    // we return a view file which expects two arguments passed to it
    // The first argument is the Seq[CD] which contains all the CDs we want to display
    // The second argument is the Form[CD], where we pass the form we have created
    Ok(views.html.listCustomers(Customer.customers, Customer.createCustomerForm))
  }

  def createCD = Action { implicit request =>

    val formValidationResult = Customer.createCustomerForm.bindFromRequest


    formValidationResult.fold({ formWithErrors =>
      BadRequest(views.html.listCustomers(Customer.customers, formWithErrors))
    }, { customer =>

      Customer.customers.append(customer)
      Redirect(routes.Application.listCustomers)
    })
  }

}




