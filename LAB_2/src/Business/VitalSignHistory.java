/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author deepakviswanadh
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> vitalSignHistory;
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitalSigns(){
        VitalSigns newEntry = new VitalSigns();
        vitalSignHistory.add(newEntry);
        return newEntry;
    }
    
    public void delete(VitalSigns vh){
        vitalSignHistory.remove(vh);
    }
    
    
}
