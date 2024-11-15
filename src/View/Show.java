package View;

import Controller.Controller;
import Model.*;

public class Show {

    public static void main(String[] args) {
        
        Organize organize = DummySetter.createDummyOrganize();

        
        DummySetter.displayOrganizeDetails(organize);

        
        TicketType ticketType = TicketType.VIP; 
        double payment = Controller.calculatePayment(organize.artis, ticketType);
        //payment berdasarkan tipe artis dan band
        System.out.println("calculate payment buat artis , PAYMENT : " + payment);
        

        
    }
}
