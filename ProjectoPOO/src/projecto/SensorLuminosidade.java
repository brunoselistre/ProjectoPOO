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

    public SensorLuminosidade(){
        luzAmbiente = generateNumber();
    }
    
    private int generateNumber() {
        Random randomSequence = new Random();
        return randomSequence.nextInt(MAX_LUMINOSIDADE) + 1;
    }
   
}
