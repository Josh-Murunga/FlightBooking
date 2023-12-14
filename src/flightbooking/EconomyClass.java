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
public class EconomyClass implements SeatClass{
    @Override
    public String getSeatType() {
        return "Economy Class";
    }

    @Override
    public String getSeatDescription() {
        return "Standard seating for budget-conscious travelers";
    }
}
