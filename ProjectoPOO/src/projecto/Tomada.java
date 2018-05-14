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
public class Tomada implements Atuadores {
    
    private boolean isLigado;
    
    public Tomada(){
        isLigado = true;
    }

    @Override
    public void setIsLigado(boolean ligado) {
      this.isLigado = ligado;
    }

    @Override
    public void setValor(double valor) {
         throw new IllegalArgumentException("");
    }
    
}
