
package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class Lampada implements Atuadores{
/**
 * Temos declaradas variáveis finais já pedidas no enunciado, e também as variáveis que o utilizador vai decidir.
 */
    public static final int LAMPADA_MAX = 20;
    public static final int LAMPADA_MIN = 0;
    private double luz;
    private boolean isLigado;
/**
 * Constructor onde a luz sempre vai começar como desligada ou no valor minimo.
 */    
    public Lampada(){
        luz = LAMPADA_MIN;
    }
/**
 * Método para ligar a lâmpada.
 * @param ligado 
 */
    @Override
    public void setIsLigado(boolean ligado) {
        this.isLigado = ligado;
    }
/**
 * Método que retorna se a lâmpada está desligada ou ligada.
 * @return isLigado
 */
    public boolean isIsLigado() {
        return isLigado;
    }
/**
 * Método onde vai definir o valor de luminosidade da lâmpada.
 * @param luz 
 */
    @Override
    public void setValor(double luz) {
      if(luz >= LAMPADA_MIN && luz <= LAMPADA_MAX){
         this.luz = luz;   
      }else {
          this.luz = 0.0;
          throw new IllegalArgumentException("A Lampada foi colocada com o valor pré-definido de 0, devido a valor incorrecto.");
      }      
    }
}
