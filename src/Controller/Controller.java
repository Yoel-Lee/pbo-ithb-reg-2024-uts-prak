package Controller;

import Model.Artist;
import Model.TicketType;

public class Controller {

    public static double calculatePayment(Artist artist, TicketType ticketType) {
        return artist.calculatePayment(ticketType);
    }
    
}
