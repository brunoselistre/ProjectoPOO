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
public class Movimento implements Sensores {

    public boolean movimento;
    
    public Movimento(){
        movimento = false;
    }
    @Override
    public void setValor(double valor) {
       throw new IllegalArgumentException("");
    }

     @Override
    public boolean temEnergia() {
               return false;
    }

    @Override
    public boolean getStatus() {
        return movimento;
    }
    
}
