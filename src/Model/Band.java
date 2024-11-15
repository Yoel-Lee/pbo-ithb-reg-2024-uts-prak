package Model;

public class Band extends Artist {

    public Band(String name, Genre genre, double performanceFee, PerfomanceSchedule performanceSchedule) {
        super(name, genre, performanceFee, TipeArtis.BAND, performanceSchedule);
    }

    @Override
    public double calculatePayment(TicketType ticketType) {
        switch (ticketType) {
            case REGULAR:
                return 15000;
            case VIP:
                return 30000;
            case INVITATION:
                return 0; // 
            default:
                return 0;
        }
    }
}
