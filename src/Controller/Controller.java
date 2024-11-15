package Controller;

import Model.Artist;
import Model.TicketType;
import Model.TipeArtis;

public class Controller {
    public static double calculatePayment(Artist artist, TicketType ticketType) {
        double totalPayment = 0;

        
        if (artist.tipeArtis == TipeArtis.BAND) {
            
            totalPayment = artist.perfomanceFee;
        } else if (artist.tipeArtis == TipeArtis.SOLOARTIST) {
            totalPayment = artist.perfomanceFee * 1.5; 
        }


        if (ticketType == TicketType.REGULAR) {
            totalPayment += 1000;  
        } else if (ticketType == TicketType.VIP) {
            totalPayment += 2000;  
        } else if (ticketType == TicketType.INVITATION) {
            totalPayment += 0;
        }

        return totalPayment;
    }
}
