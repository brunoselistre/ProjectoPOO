package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class ModuloTemperatura {
    public ArCondicionado arCondicionado;
    public SensorTemperatura sensorTemperatura;
    
    public ModuloTemperatura(){
        
    }
    public ModuloTemperatura(SensorTemperatura temperatura){
        arCondicionado = new ArCondicionado();
        sensorTemperatura = new SensorTemperatura(temperatura.temperatura);
    }
    
    public void setSensorTempON(boolean onOFF){
        sensorTemperatura.setIsActivo(onOFF);
    }
    
    public int getTemperatura(){
       return sensorTemperatura.temperatura;
    }
    
    public boolean getStatusSensor(){
        return sensorTemperatura.getStatusSensorTemp();
    }
    
    public boolean getStatusArCondicionado(){
        return arCondicionado.getStatus();
    }
    
    public void medirTemperatura(int temp, int variacao){
        if(sensorTemperatura.temperatura < arCondicionado.getTempMin()){
            arCondicionado.setIsLigado(true);
        } else if(sensorTemperatura.temperatura > arCondicionado.getTempMax()) {
            arCondicionado.setIsLigado(false);
        }else if(sensorTemperatura.temperatura > (temp+variacao) || sensorTemperatura.temperatura < (temp +variacao) ){
            arCondicionado.setIsLigado(false);
        }else if (sensorTemperatura.temperatura < (temp+variacao) || sensorTemperatura.temperatura > (temp -variacao)){
            arCondicionado.setIsLigado(true);  
        }
    }
}
