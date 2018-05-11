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
public class Alarme implements Atuadores {

    public static final int VOL_MAX = 10;
    public static final int VOL_MIN = 0;
    private double volume;
    
    public Alarme(){
       volume = VOL_MIN;
    }
    
    public void setVolume(int volume){
        
    }
    public void volumeOFF(){
        volume=VOL_MIN;
    }

    @Override
    public void setIsLigado(boolean ligado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValor(double volume) {
        if (volume >= VOL_MIN && volume <= VOL_MAX){
            this.volume = volume;
        }else {
           this.volume = VOL_MIN;
           throw new IllegalArgumentException("VValor Incorreto. Volume mínimo");
        }
    }
    
}
