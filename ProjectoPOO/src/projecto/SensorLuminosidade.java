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
public class SensorLuminosidade implements Sensores {
    
    public static final int MAX_LUMINOSIDADE = 100;
    public int luzAmbiente;
/**
 * Constructor onde vai receber a luz ambiente na divisão.
 * 
 * @param luzAmbiente
 */
    public SensorLuminosidade(int luzAmbiente){
        this.luzAmbiente = luzAmbiente;
    }
/**
 * Retorna a quantidade de luz colocada.
 *
 * @return luzAmbiente
*/
    public int getLuzAmbiente() {
        return luzAmbiente;
    }
    
    private int generateNumber() {
        Random randomSequence = new Random();
        return randomSequence.nextInt(MAX_LUMINOSIDADE) + 1;
    }
   
}
