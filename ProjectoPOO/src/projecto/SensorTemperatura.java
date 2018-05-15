/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.util.Random;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class SensorTemperatura implements Sensores {
    public static final int MAX_TEMP = 20;
    public Tomada tomada;
    public boolean isActivo;
    public int temperaturaAmbiente;
    private ModuloTemperatura modulo;
   
    public SensorTemperatura(){
        tomada = new Tomada();
        isActivo = false;
        modulo = new ModuloTemperatura(25);
        temperaturaAmbiente = generateNumber();
    }
    private int generateNumber() {
        Random randomSequence = new Random();
        return randomSequence.nextInt(MAX_TEMP) + 15;
    }
    
    public boolean temEnergia() {
        if(tomada.getIsLigado() == true){
            return true;
        }else{
            return false;
        }
    }

    public void setIsActivo(boolean isActivo) {
        if(temEnergia() == true){
            this.isActivo = isActivo;
        }else{
            this.isActivo = false;
        }
    }
    public boolean getIsActivo() {
        return isActivo;
    }
    
}
