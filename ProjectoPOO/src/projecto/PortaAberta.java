
package projecto;

/**
 *
 * @author bseli
 */
public class PortaAberta implements Sensores {
    
    private boolean isAberto;
    
    
    public PortaAberta(){
        isAberto = false;
    }
    @Override
    public boolean getStatus(){
        return isAberto;
    }
    @Override
    public void setValor(double valor) {
        throw new IllegalArgumentException("");
    }
    
   @Override
    public boolean temEnergia() {
               return false;
    }
}
