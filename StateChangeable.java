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

public interface StateChangeable<T> {

    abstract void changeState(Status status);
}
