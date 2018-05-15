/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
package projecto;

import java.util.Random;


public class SensorMovimento implements Sensores {

    public boolean isActivo;
    
    public SensorMovimento(){
        isActivo = generateStatus();
    }
    
    public boolean getStatus() {
        return isActivo;
    }
    
    private boolean generateStatus() {
        Random randomSequence = new Random();
        return randomSequence.nextBoolean();
    }
}
