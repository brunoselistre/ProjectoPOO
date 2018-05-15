/*
* Projecto SmartHome 1.0
* @author Bruno Cunha Selistre - 170221068
* @author Bruno Luis - 170221066
*/

package projecto;


public class Programa {
    public static void main(String[] args) {
        
              
        Camara foto = new Camara("foto do ladrao");
        
        System.out.println(foto.getFoto());
     
        CamaraDeVideo video = new CamaraDeVideo("video do ladrao");
        
        System.out.println(video.getVideo());
        
    }
    
}
