package edu.neu.csye6200;

public class ServiceItem extends Item {
    private int duration; // Duration in months

    public ServiceItem(String csv) {
        super(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
        this.duration = Integer.parseInt(csv.split(",")[3]);
    }

    @Override
    public String toString() {
        return "ServiceItem [ID=" + id + ", Name=" + name + ", Price=" + price + ", Duration=" + duration + " months]";
    }
}
