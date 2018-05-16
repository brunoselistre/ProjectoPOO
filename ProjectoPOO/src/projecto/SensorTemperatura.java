package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class SensorTemperatura implements Sensores {
    
    public Tomada tomada;
    public boolean isActivo;
    public int temperatura;
    
    public SensorTemperatura(int temperatura){
        tomada = new Tomada();
        isActivo = false;
        this.temperatura = temperatura;
    }
        
    public boolean temEnergia() {
        if(tomada.getIsLigado() == true){
            return true;
        }else
            return false;    
    }
    
    public int getTemperatura(){
        return temperatura;
    }
    
    public void setIsActivo(boolean isActivo) {
        if(temEnergia() == true){
            this.isActivo = isActivo;
        }else{
            this.isActivo = false;
        }
    }
    
    public boolean getStatusSensorTemp() {
        return isActivo;
    }
}
