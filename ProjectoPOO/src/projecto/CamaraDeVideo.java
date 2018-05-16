package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class CamaraDeVideo extends Camara {
    
    private String video;
    
    public CamaraDeVideo() {
        super();
    }

    public String getVideo() {
        return video;
    }
    public void gravar(String name){
        this.video = name.concat(".mp4");
    }
    public void tirarFoto(String name){
        super.tirarFotos(name);
    }
}
