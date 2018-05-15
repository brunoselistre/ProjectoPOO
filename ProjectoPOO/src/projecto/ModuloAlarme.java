/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

/**
 *
 * @author micol
 */
public class ModuloAlarme {
    private SensorMovimento sensorMovimento;
    private SensorPortaAberta sensorPortaAberta;
    private Camara camara;
    private String pin;
    private boolean isActivo;
    private Sirene alarme;
    
    public ModuloAlarme(){
        sensorMovimento = new SensorMovimento();
        sensorPortaAberta = new SensorPortaAberta();
        camara = new Camara("xxx");
        pin = "0000";
        isActivo = false;
        alarme = new Sirene();
        
    }
    
    public void setPin(String pin){
        if(pin.length() == 4){
            this.pin = pin;
        }
        else{
            this.pin = "0000";
            throw new IllegalArgumentException("O pin deve ter 4 algarismos");
        }
    }
    public String getPin(){
        return pin;
    }

    public boolean isIsActivo() {
        return isActivo;
    }

    public void setIsActivo(boolean isActivo) {
        this.isActivo = isActivo;
        if(this.isActivo == true){
            acionarSensores();
        }
    }
    
    public void acionarSensores(){
    } 
    
}
