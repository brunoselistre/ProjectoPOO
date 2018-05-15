/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class ModuloTemperatura {
    public ArCondicionado arCondicionado;
    public SensorTemperatura sensorTemperatura;
    
    public ModuloTemperatura(SensorTemperatura temperatura){
        arCondicionado = new ArCondicionado();
        sensorTemperatura = new SensorTemperatura(sensorTemperatura.temperatura);
    }
    
    public int getTemperatura(){
       return sensorTemperatura.temperatura; 
    }
    
    public void medirTemperatura(int temp, int variacao){
        while (sensorTemperatura.temperatura != temp)
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
