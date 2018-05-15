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
public class Sirene implements Atuadores {

    public static final int VOL_MAX = 10;
    public static final int VOL_MIN = 0;
    private double volume;
    private boolean isLigado;
    
    
    public Sirene(){
       volume = VOL_MIN;
       isLigado = false;
    }
    @Override
    public void setIsLigado(boolean ligado) {
        this.isLigado = ligado;
    }
    public boolean getIsLigado(){
        return isLigado;
    }
    
    @Override
    public void setValor(double volume) {
        if (volume >= VOL_MIN && volume <= VOL_MAX){
            this.volume = volume;
        }else {
           this.volume = VOL_MIN;
           throw new IllegalArgumentException("Valor Incorreto. Volume mínimo");
        }
    }
    
    public void volumeOFF(){
        this.volume = VOL_MIN;
    }


    
    
}
