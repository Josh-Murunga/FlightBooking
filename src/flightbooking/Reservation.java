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
public class Reservation {
    private String reservationNumber;
    private String reservationDate;
    private Ticket ticket;
    private Payment payment;

    public Reservation(String reservationNumber, String reservationDate, Ticket ticket, Payment payment) {
        this.reservationNumber = reservationNumber;
        this.reservationDate = reservationDate;
        this.ticket = ticket;
        this.payment = payment;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }
    
    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getReservationDate() {
        return reservationDate;
    }
    
    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Ticket getTicket() {
        return ticket;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    
}
