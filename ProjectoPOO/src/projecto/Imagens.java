/**
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
package projecto;
/**
 * Classe para implementar as imagens da camara de vigilancia
 */
public class Imagens {
    private CamaraDeVideo camaraVideo;
    
    public Imagens(){
        camaraVideo = new CamaraDeVideo();
    }
    
   public String tirarFotos(){
       Camara camara1 = new Camara();
       camara1.tirarFotos("IMG-001-2018");
      
       Camara camara2 = new Camara();
       camara2.tirarFotos("IMG-002-2018");
       
       camaraVideo.tirarFoto("IMG-003-2018");
       camaraVideo.gravar("VID-001-2018");
       
       return camara1.getFoto() +"\n" +camara2.getFoto() +"\n"+ camaraVideo.getFoto() +"\n"+ camaraVideo.getVideo();
   } 
}