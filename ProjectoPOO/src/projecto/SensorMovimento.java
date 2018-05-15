/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
package projecto;


public class SensorMovimento implements Sensores {

    public boolean isActivo;
    
    public SensorMovimento(){
        isActivo = false;
    }
    
    public boolean getStatus() {
        return isActivo;
    }
    
    public void setStatus(boolean status){
        this.isActivo = status;
    }
    
}
