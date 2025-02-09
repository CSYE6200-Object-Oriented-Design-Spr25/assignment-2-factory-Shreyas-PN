package edu.neu.csye6200;

public class ElectronicItem extends Item {
    private String warranty;

    public ElectronicItem(String csv) {
        super(Integer.parseInt(csv.split(",")[0]), csv.split(",")[1], Double.parseDouble(csv.split(",")[2]));
        this.warranty = csv.split(",")[3];
    }

    @Override
    public String toString() {
        return "ElectronicItem [ID=" + id + ", Name=" + name + ", Price=" + price + ", Warranty=" + warranty + "]";
    }
}
