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
public class ModuloLuminosidade {
    
    public Tomada tomada;
    public SensorLuminosidade luz;
    
    public ModuloLuminosidade(){
        luz = new SensorLuminosidade();
        tomada = new Tomada();
    }
    
    public boolean ligarLuz(boolean ligado){
        luz.equals(ligado);
        return ligado;
    }
    
    public boolean ligarTomada(boolean ligado){
        tomada.equals(ligado);
        return ligado;
    }
    
    public void medirLuminosidade(){
        
    }
}
