/*
 * Francis Bui
 * CMIS 242
 * Dr. Schmeelk
 * Project 3 - Real Estate Database
 * August 3, 2020
 * The purpose of this program design a real estate database. The program will store and edit real estate properties
 * as a Property object and implemented through a TreeMap. The Status enum will determine the status of the property
 * sale process state. Additionally the user can insert, delete, and find properties within the database. Should the
 * data being entered or retrieved is incomplete or invalid, the application will pop-up an exception message to the
 * user of the error. Likewise, a message will appear informing the user of successful queries.
 *
 */

public class Property implements StateChangeable {

    private String address;
    private int bedrooms;
    private int footage;
    private int price;
    private Status status = Status.FOR_SALE;

    public Property(String address, int bedrooms, int footage, int price, Status status) {
        this.address = address;
        this.bedrooms = bedrooms;
        this.footage = footage;
        this.price = price;
        this.status = status;
    }

    @Override
    public void changeState(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Address: " + address + "\nBedrooms: " + bedrooms + "\nSquare Footage: " + footage + "\nPrice: " + price + "\nStatus: " + status;
    }
}
