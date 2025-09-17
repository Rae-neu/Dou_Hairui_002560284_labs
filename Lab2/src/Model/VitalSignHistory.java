/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Eve Dou
 */
public class VitalSignHistory {
//alt+enter - import
    ArrayList<VitalSign>history;
    
    public VitalSignHistory(){
        this.history = new ArrayList<>();
    }
// alt+ins
    public ArrayList<VitalSign> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    
    public VitalSign addNewVital(){
        VitalSign a = new VitalSign();
        history.add(a);
        return a;
    }
    public void deleteVitalSign(VitalSign hy){
     history.remove(hy); 
    }

    public void deleteVital(VitalSign selectedVital) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
