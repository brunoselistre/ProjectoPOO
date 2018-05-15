
package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class SensorPortaAberta implements Sensores {
    
    private boolean isAberto;
    private ModuloAlarme modulo;
    
    public SensorPortaAberta(){
        isAberto = false;
    }
    @Override
    public boolean getStatus(){
        return isAberto;
    }
    public void setStatus(boolean status){
        this.isAberto = status;
    }
    @Override
    public void setValor(double valor) {}
   
}
