package View;

import Controller.Controller;
import Model.*;

public class Show {

    public static void main(String[] args) {
        
        Organize organize = DummySetter.createDummyOrganize();

        
        DummySetter.displayOrganizeDetails(organize);

        
        TicketType ticketType = organize.ticket.ticketType; 

        double payment = Controller.calculatePayment(organize.artis, ticketType);
        //payment berdasarkan tipe artis dan band
        System.out.println("calculate payment buat artis , PAYMENT : " + payment);
        
        int totalRevenue = 0;



        double payment2 = Controller.calculatePayment(organize.artis, ticketType);
        totalRevenue += payment2;

        System.out.println("Total Revenue : " + totalRevenue);
        
    }
}
