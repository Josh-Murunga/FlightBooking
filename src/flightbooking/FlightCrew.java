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
public class FlightCrew extends Person {
    private String crewNumber;
    
    public FlightCrew(String crewName, int crewAge, String _crewNumber) {
        name = crewName;
        age = crewAge;
        crewNumber = _crewNumber;
    }

    public String getCrewNumber() {
        return crewNumber;
    }

    public void setCrewNumber(String crewNumber) {
        this.crewNumber = crewNumber;
    }
    
}
