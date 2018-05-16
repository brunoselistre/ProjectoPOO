package projecto;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class Sirene implements Atuadores {
/**
 * Variáveis fixas dadas pelo enunciado e as variáveis para serem alteradas pelo utilizador.
 */
    public static final int VOL_MAX = 10;
    public static final int VOL_MIN = 0;
    private double volume;
    private boolean isLigado;
    
/**
 * Constructor da sirene que vai começar com o volume no min ou desligado e começa por defeito mesmo desligado.
 */
    public Sirene(){
       volume = VOL_MIN;
       isLigado = false;
    }   
 /**
  * Método que vai ligar o volume da sirene.
  * @param ligado 
  */
    @Override
    public void setIsLigado(boolean ligado) {
        this.isLigado = ligado;
    }  
/**
 * Método que retorna se o volume do alarme está ligado ou não.
 * @return isLidago
 */
    public boolean getIsLigado(){
        return isLigado;
    }
/**
 * Método que vai definir o volume da sirene dado pelo utilizador
 * @param volume 
 */    
    @Override
    public void setValor(double volume) {
        if (volume >= VOL_MIN && volume <= VOL_MAX){
            this.volume = volume;
        }else {
           this.volume = VOL_MIN;
           throw new IllegalArgumentException("Valor Incorreto. Volume mínimo");
        }
    }
/**
 * Desliga o volume da sirene
 *
*/
    public void volumeOFF(){
        this.volume = VOL_MIN;
    }    
}
