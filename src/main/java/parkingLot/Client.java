package parkingLot;

import parkingLot.controller.PaymentController;
import parkingLot.controller.TicketController;
import parkingLot.models.Payment;

public class Client {

    public static void main(String[] args) {

        PaymentController tc = new PaymentController();

         Payment payment =  tc.getPaymentDetails(12);
    }
}
