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
    
    public ModuloTemperatura(int temperatura){
        arCondicionado = new ArCondicionado();
        sensorTemperatura = new Temperatura();
        this.temperatura = temperatura;
    }
    
    public int getTemperatura(){
       return temperatura; 
    }
    
    public void medirTemperatura(int temp, int variacao){
       while (temperatura != temp){
        if(temperatura < arCondicionado.getTempMin()){
            arCondicionado.setIsLigado(true);
        } else if(temperatura > arCondicionado.getTempMax()) {
            arCondicionado.setIsLigado(false);
        }else if(temperatura > (temp-variacao) || temperatura < (temp +variacao) ){
            arCondicionado.setIsLigado(true);
        }else if(temperatura == temp){
            arCondicionado.setIsLigado(false);
        }
    }
    }
}
