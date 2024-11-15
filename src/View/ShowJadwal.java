package View;

import Controller.Controller;
import Model.*;

public class ShowJadwal {

    public static void main(String[] args) {
        
        Organize organize = DummySetter.createDummyOrganize();

        
        DummySetter.displayOrganizeDetails(organize);

        
        TicketType ticketType = TicketType.VIP; 
        double payment = Controller.calculatePayment(organize.artis, ticketType);

        System.out.println("calculate payment buat artis " + payment);
    }
}
