package Model;

public abstract class Artist {
    String name;
    public Genre genre;
    public double performanceFee;
    public TipeArtis tipeArtis;
    PerfomanceSchedule performanceSchedule;
    public double perfomanceFee;

    public Artist(String name, Genre genre, double performanceFee, TipeArtis tipeArtis, PerfomanceSchedule performanceSchedule) {
        this.name = name;
        this.genre = genre;
        this.performanceFee= performanceFee;
        this.tipeArtis = tipeArtis;
        this.performanceSchedule = performanceSchedule;
    }

    public abstract double calculatePayment(TicketType ticketType);



    
    public void getArtistDetails() {
        System.out.println("nama artis: " + name);
        System.out.println("genre: " + genre);
        System.out.println("performance fee: " + performanceFee);
        System.out.println("tipe artis: " + tipeArtis);
    }
}
