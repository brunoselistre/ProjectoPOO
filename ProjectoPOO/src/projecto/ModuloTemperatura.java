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
    public Temperatura sensorTemperatura;
    public int temperatura;
    
    public ModuloTemperatura(){
        arCondicionado = new ArCondicionado();
        sensorTemperatura = new Temperatura();
    }
    
    public int getTemperatura(){
       return temperatura; 
    }
    
    public void medirTemperatura(int temp, int variacao){
        if(temperatura < arCondicionado.getTempMin()){
            arCondicionado.setIsLigado(true);
        } else if(temperatura > arCondicionado.getTempMax()) {
            arCondicionado.setIsLigado(false);
        }else if(temperatura > temp && temperatura < (temp +variacao) ){
            
        }
    }
    
}
