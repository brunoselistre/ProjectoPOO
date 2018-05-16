package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class Camara implements Atuadores  {

    private String foto;
/**
 * Constructor onde vai receber uma foto por nome de string e sempre adiciona automaticamente o tipo de ficheiro, que neste caso é sempre .jpg.
 * 
 * @param foto 
 */
    public Camara(){
        this.foto = "XXXX";
    }
/**
 * Retorna o valor de foto implementado pelo  utilizador.
 * @return foto
*/
    public String getFoto() {
        return foto;
    }
   
    public void tirarFotos(String name){
      this.foto = name.concat(".jpg");
    }
   
    @Override
    public void setIsLigado(boolean ligado) {
    }

    @Override
    public void setValor(double valor) {
    }
    
}