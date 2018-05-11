/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

/**
 *
 * @author bseli
 */
public class Lampada implements Atuadores{
    public static final int LAMPADA_MAX = 20;
    public static final int LAMPADA_MIN = 0;
    private double luz;
    private boolean isLigado;
    
    public Lampada(){
        luz = LAMPADA_MIN;
    }

    @Override
    public void setIsLigado(boolean ligado) {
        this.isLigado = ligado;
    }

    @Override
    public void setValor(double luz) {
      if(luz > LAMPADA_MIN && luz <= LAMPADA_MAX){
         this.luz = luz;   
      }else {
          this.luz = 0.0;
          throw new IllegalArgumentException("A Lampada foi colocada com o valor pré-definido de 0, devido a valor incorrecto.");
      }      
    }
}
