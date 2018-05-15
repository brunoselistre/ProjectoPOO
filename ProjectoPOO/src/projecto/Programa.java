/*
* Projecto SmartHome 1.0
* @author Bruno Cunha Selistre - 170221068
* @author Bruno Luis - 170221066
*/

package projecto;


public class Programa {
    public static void main(String[] args) {
        
        ModuloLuminosidade m1 = new ModuloLuminosidade();
        System.out.println(m1.luz.luzAmbiente);
        m1.medirLuminosidade();
        
        
    }
    
}
