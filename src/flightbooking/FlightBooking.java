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
public class FlightBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create passengers
        Passenger passenger1 = new Passenger("John Doe", 30, "ADYY123");
        Passenger passenger2 = new Passenger("Jane Smith", 25, "FZT4360");
        
        // Create flights
        Flight flight1 = new Flight("FL123", "Mombasa", "Nairobi", 200);
        Flight flight2 = new Flight("FL456", "Nairobi", "Kisumu", 150);
        
        // Create seat classes
        SeatClass firstClass = new FirstClass();
        SeatClass economyClass = new EconomyClass();
        SeatClass businessClass = new BusinessClass();
        
         // Display available seats on flights
        flight1.displayAvailableSeats(firstClass);
        flight2.displayAvailableSeats(economyClass);
        
        // Passenger 1 makes a reservation with payment
        Reservation reservation1 = passenger1.makeReservation(flight1, firstClass, "Credit Card", 500.0);

        // Passenger 2 makes a reservation with payment
        Reservation reservation2 = passenger2.makeReservation(flight2, economyClass, "PayPal", 300.0);
        
        flight1.displayAvailableSeats(firstClass);
        flight2.displayAvailableSeats(economyClass);
    }
    
}
