
package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
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
    }
    
   @Override
    public boolean temEnergia() {
               return false;
    }
}
