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
//inheritance
public class Passenger extends Person {
    private String passport;

    public Passenger(String passengerName, int passengerAge, String passengerPassport) {
        name = passengerName;
        age = passengerAge;
        passport  = passengerPassport;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
   
    public Reservation makeReservation(Flight flight, SeatClass seatClass, String paymentMethod, double amountPaid) {
        Ticket ticket = new Ticket(flight.getFlightNumber() + "-" + name, "A1", seatClass, flight.getFlightNumber());
        Payment payment = new Payment(paymentMethod, amountPaid);
        Reservation reservation = new Reservation(name + "-" + flight.getFlightNumber(), "2023-10-30", ticket, payment);
        flight.incrementBookedSeats();
        displayReservationDetails(reservation);
        return reservation;
    }
    
    private void displayReservationDetails(Reservation reservation) {
        System.out.println("");
        System.out.println("Reservation Details:");
        System.out.println("Reservation Number: " + reservation.getReservationNumber());
        System.out.println("Passenger Name: " + name);
        System.out.println("Passport Number: " + passport);
        System.out.println("Flight Number: " + reservation.getTicket().getFlightNumber());
        System.out.println("Seat Class: " + reservation.getTicket().getSeatClass().getSeatType());
        System.out.println("Description: " + reservation.getTicket().getSeatClass().getSeatDescription());
        System.out.println("Seat Number: " + reservation.getTicket().getSeatNumber());
        System.out.println("Payment Method: " + reservation.getPayment().getPaymentMethod());
        System.out.println("Amount Paid: $" + reservation.getPayment().getAmountPaid());
        System.out.println("-------------------------");
    }
}
    