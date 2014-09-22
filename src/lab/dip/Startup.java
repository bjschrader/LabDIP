package lab.dip;

/**
 *
 * @author schra_000
 */
public class Startup {
    
    
    
    public static void main(String[] args) {
        TipCalculator calc = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5);
        
        TipHandler hdr = new TipHandler(calc);
        double amt = hdr.getTip();
        System.out.println(amt);
    }
}
