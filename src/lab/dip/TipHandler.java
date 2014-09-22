/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.dip;

/**
 *
 * @author schra_000
 */
public class TipHandler {
    
    private TipCalculator tipCalculator;

    public TipHandler(TipCalculator tip) {
        this.tipCalculator = tipCalculator;
    }

    public double getTip (){
       return tipCalculator.getCalculatedTip();
    }
    
    public void setTip(TipCalculator tip) {
        this.tipCalculator = tipCalculator;
    }
    
    
    
}
