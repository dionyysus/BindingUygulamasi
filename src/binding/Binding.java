package binding;

public class Binding {

    
    public static void main(String[] args) {
        Canli canli = new Canli();
        canli.adinisoyle();
        
        Canli kartal = new Kartal();
        kartal.adinisoyle();
        ((Kartal)kartal).uc();
        
        Canli panda = new Panda();
        panda.adinisoyle();
        ((Panda)panda).oyna();

                
    }
    
}
