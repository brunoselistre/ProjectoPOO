/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

import java.time.LocalDateTime;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class Tomada {
    
    private boolean isLigado;
    
    public Tomada(){
        isLigado = false;    
    }

    public void setIsLigado(boolean ligado) {
      this.isLigado = ligado;
    }

    public boolean getIsLigado() {
        return isLigado;
    }

    public void setValor(double valor) {}
    
    public void setTimer(int hora, TipoTemporizador tipo){       
        long var = hora;
        LocalDateTime aux = LocalDateTime.now().plusMinutes(var);
        
        if(tipo == TipoTemporizador.LIGAR){
            while(LocalDateTime.now().isBefore(aux)){
                isLigado = true;
            }
        }else if(tipo == TipoTemporizador.DESLIGAR){
            while(LocalDateTime.now().isBefore(aux)){
                isLigado = false;
            }
        }
    }
}