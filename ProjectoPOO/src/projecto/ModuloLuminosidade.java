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
    
    public static final int POUCA_LUZ = 25;
    public static final int MUITA_LUZ = 80;
    public Tomada tomada;
    public Lampada lampada;
    public SensorLuminosidade luz;
    
    public ModuloLuminosidade(){
        luz = new SensorLuminosidade();
        tomada = new Tomada();
        lampada = new Lampada();
    }
    
    public boolean ligarLuz(boolean ligado){
        lampada.setIsLigado(ligado);
        return ligado;
    }
    public void controleLampada(int potencia){
        lampada.setValor(potencia);
    }
    
    public boolean ligarTomada(boolean ligado){
        tomada.equals(ligado);
        return ligado;
    }
    
    public void medirLuminosidade(){
        if(luz.luzAmbiente > MUITA_LUZ){
            lampada.setIsLigado(false); //LAMPADA APAGADA
        }else if (luz.luzAmbiente < POUCA_LUZ){
            lampada.setIsLigado(true); //LAMPADA ACESA
        }
    }
}
