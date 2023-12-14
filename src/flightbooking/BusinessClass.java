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
public class BusinessClass implements SeatClass{
    @Override
    public String getSeatType() {
        return "Business Class";
    }

    @Override
    public String getSeatDescription() {
        return "Comfortable seating with in-flight amenities";
    }
}
