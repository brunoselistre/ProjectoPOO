/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

/**
 *
 * @author micol
 */
public class ModuloTemperatura {
    public ArCondicionado arCondicionado;
    public SensorTemperatura sensorTemperatura;
    public int temperatura;
    
    public ModuloTemperatura(){
        arCondicionado = new ArCondicionado();
        sensorTemperatura = new SensorTemperatura();
    }
    
    public int getTemperatura(){
       return temperatura; 
    }
    
    public void definicaoTemperatura(int temp, int variacao){
        if(sensorTemperatura.temperaturaAmbiente > temp + variacao ||sensorTemperatura.temperaturaAmbiente < temp - variacao){ //CORRIGIR!!!
            arCondicionado.setIsLigado(true);
            arCondicionado.setValor(temp);
        }
        
    }
    
}
