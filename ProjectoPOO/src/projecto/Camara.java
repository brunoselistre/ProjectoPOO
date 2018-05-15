/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public Camara(String foto){
        this.foto = foto.concat(".jpg");
    }
/**
 * Retorna o valor de foto implementado pelo  utilizador.
 *
 * @return foto
*/
    public String getFoto() {
        return foto;
    }    
    
    
    @Override
    public void setIsLigado(boolean ligado) {
    }

    @Override
    public void setValor(double valor) {
    }
    
}
