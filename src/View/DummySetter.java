package View;

import java.util.Calendar;
import java.util.Date;

import Model.*;

public class DummySetter {

    
    public static Organize createDummyOrganize() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.DECEMBER, 15, 18, 0);
        Date startDate = calendar.getTime();
        calendar.set(2024, Calendar.DECEMBER, 15, 20, 0);
        Date endTime = calendar.getTime();
        Stage stage=new Stage(startDate, endTime , "Stage Yoel", 5000, "Jalan Dipati Ukur");
        PerfomanceSchedule perfomanceSchedule =new PerfomanceSchedule(startDate, endTime);
        Ticket ticket = new Ticket(TicketType.REGULAR, 100.0, "T12345");
        Artist artis =new Artist("gg gaming", Genre.ROCK, 5000.0, TipeArtis.BAND, perfomanceSchedule) {

            @Override
            public double calculatePayment(TicketType ticketType) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'calculatePayment'");
            }

          
        };

        
        Vendor vendor = new Vendor("Logitech", "A", 1500.0);


        Organize organize = new Organize();
        organize.artis = artis;
        organize.ticket=ticket;
        organize.vendor = vendor;
        organize.stage=stage;

        return organize;
    }

    public static void displayOrganizeDetails(Organize organize) {
        organize.artis.getArtistDetails();
        organize.vendor.getVendorDetails();
        organize.stage.getPerfomnAndStageDetails();
    }
}
