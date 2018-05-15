/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.time.LocalDateTime;
import java.util.Iterator;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class Tomada implements Atuadores {
    
    private boolean isLigado;
    private int temporizador;
    
    public Tomada(){
        temporizador = LocalDateTime.now().getMinute();
        isLigado = false;    
    }

    @Override
    public void setIsLigado(boolean ligado) {
      this.isLigado = ligado;
    }

    @Override
    public void setValor(double valor) {
         throw new IllegalArgumentException("");
    }
    public void setTemporizador(int hora, TipoTemporizador tipo){       
     
        if(tipo == TipoTemporizador.LIGAR){
            while(LocalDateTime.now().getHour() != hora){
                isLigado = true;
            }
        }else if(tipo == TipoTemporizador.DESLIGAR){
            while(LocalDateTime.now().getHour() != hora){
                isLigado = false;
            }
        }
    }
}
