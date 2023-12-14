/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightbooking;

/**
 *
 * @author JoshuaMurunga
 */
public class Flight {
    //information hiding through setting our access modifiers to our members as private
    private String flightNumber;
    private String source;
    private String destination;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String source, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
    
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    public String getSource() {
        return source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
    
    //by performing all operations within this class while changing the state within this class, this demonstrates encapsulation
    public void displayAvailableSeats(SeatClass seatClass) {
        int availableSeats = capacity - bookedSeats;
        System.out.println("Available " + seatClass.getSeatType() + " seats on Flight " + flightNumber + ": " + availableSeats);
    }
    
    public void incrementBookedSeats() {
        bookedSeats++;
    }
}
