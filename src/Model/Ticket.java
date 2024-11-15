package Model;

public class Ticket {
    TicketType ticketType;
    double ticketPrice;
    String ticketNumber;

    public Ticket(TicketType ticketType, double ticketPrice, String ticketNumber) {
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.ticketNumber = ticketNumber;
    }

    public void getTicketDetails(){
        System.out.println("ticket type : "+ticketType);
        System.out.println("ticket price "+ ticketPrice);
        System.out.println("ticket number "+ticketNumber);
    }

 
}
