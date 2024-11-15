package View;

import Controller.Controller;
import Model.Organize;
import Model.TicketType;

public class generateRevRep {

    public static void main(String[] args) {
        int totalRevenue = 0;
    
        Organize organize = DummySetter.createDummyOrganize();

        TicketType ticketType = organize.ticket.ticketType; 

        double payment = Controller.calculatePayment(organize.artis, ticketType);
        totalRevenue += payment;

        System.out.println("Total Revenue : " + totalRevenue);
    }
}
