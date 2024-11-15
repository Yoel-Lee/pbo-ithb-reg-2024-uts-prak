package Model;

public class SoloArtist extends Artist {

    public SoloArtist(String name, Genre genre, double performanceFee, PerfomanceSchedule performanceSchedule) {
        super(name, genre, performanceFee, TipeArtis.SOLOARTIST, performanceSchedule);
    }

    
    @Override
    public double calculatePayment(TicketType ticketType) {
        switch (ticketType) {
            case REGULAR:
                return 10000;
            case VIP:
                return 20000;
            case INVITATION:
                return 0; 
            default:
                return 0;
        }
    }
}
