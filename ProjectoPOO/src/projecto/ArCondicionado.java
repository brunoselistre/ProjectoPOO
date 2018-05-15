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
public class ArCondicionado extends Consola implements Atuadores {
    
    public static final int TEMPERATURA_MAX = 28;
    public static final int TEMPERATURA_MIN = 16;
    private double temperatura;
    private boolean isLigado;
    
    public ArCondicionado(){
        super();
        temperatura = TEMPERATURA_MIN;
        isLigado = false;
    }
    public int getTempMin(){
        return TEMPERATURA_MIN;
    }
    public int getTempMax(){
        return TEMPERATURA_MAX;
    }
    @Override
    public void setValor(double temperatura){
        if (temperatura >= TEMPERATURA_MIN && temperatura <= TEMPERATURA_MAX){
            this.temperatura = temperatura;
        }else{
            throw new IllegalArgumentException(" A temperatura deve estar entre 16°c e 28°c ");
        }
    }
    @Override
    public void setIsLigado(boolean ligado){
            this.isLigado = ligado;
        
    }
}