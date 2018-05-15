
package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class SensorPortaAberta implements Sensores {
    
    private boolean isAberto;
/**
 * Constructor onde a porta sempre vai iniciar como fechada ou neste caso como "false".
 * 
 */    
    public SensorPortaAberta(){
        isAberto = false;
    }
/**
 * Método onde vai retornar o estado da porta, se está aberto ou fechado
 * @return isAberto
 */
    public boolean getStatus(){
        return isAberto;
    }
/**
 * Método onde vai definir se vai abrir a porta ou não.
 * @param status 
 */
    public void setStatus(boolean status){
        this.isAberto = status;
    }
    
}
