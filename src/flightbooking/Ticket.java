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
//this class demonstrates single responsibility principle as its main and only responsibility is to display the information about the ticket
public class Ticket {
    private String ticketNumber;
    private String seatNumber;
    private SeatClass seatClass;
    private String flightNumber;

    public Ticket(String ticketNumber, String seatNumber, SeatClass seatClass, String flightNumber) {
        this.ticketNumber = ticketNumber;
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.flightNumber = flightNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }
    
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
    
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(SeatClass seatClass) {
        this.seatClass = seatClass;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    
}
