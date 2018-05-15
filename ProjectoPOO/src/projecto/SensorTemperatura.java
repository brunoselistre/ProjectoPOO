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
public class SensorTemperatura implements Sensores {
    public Tomada tomada;
    public boolean status;
   
    public SensorTemperatura(){
        tomada = new Tomada();
        status = false;
      
        
    }
    @Override
    public void setValor(double valor) {}

    public boolean temEnergia() {
        if(tomada.getIsLigado() == true){
            return true;
        }else{
            return false;
        }
    }

    public void setStatus(boolean isActivo) {
        if(temEnergia() == true){
            this.status = isActivo;
        }else{
            this.status = false;
        }
    }

    @Override
    public boolean getStatus() {
        return status;
    }
    
    
}
