package Model;

public class Vendor {
    String name;
    String serviceType;
    double vendorFee;

    public Vendor(String name, String serviceType, double vendorFee) {
        this.name = name;
        this.serviceType = serviceType;
        this.vendorFee = vendorFee;
    }

    public void getVendorDetails(){
        System.out.println("nama vendor : "+name);
        System.out.println("service type : "+serviceType);
        System.out.println("vendor fee : "+vendorFee);


    }

}
