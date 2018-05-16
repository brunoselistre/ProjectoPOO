
package projecto;

/**
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class ModuloLuminosidade {
    
    public Tomada tomada;
    public Lampada lampada;
    public SensorLuminosidade luz;
    
    public ModuloLuminosidade(){
        
    }
    public ModuloLuminosidade(int luzAmbiente){
        luz = new SensorLuminosidade(luzAmbiente);
        tomada = new Tomada();
        lampada = new Lampada();
    }
    
    public boolean ligarLampada(boolean ligado){
        lampada.setIsLigado(ligado);
        return ligado;
    }
    
    public boolean getStatusLamp(){
        return lampada.isIsLigado();
    }
    
    public void controleLampada(double potencia){
        lampada.setValor(potencia);
    }
    
    public int getLuzAmbiente(){
        return luz.getLuzAmbiente();
    }
    
    public double getLuzLampada(){
        return lampada.getLuz();
    }
    public boolean ligarTomada(boolean ligado){
        tomada.equals(ligado);
        return ligado;
    }
    
    public void medirLuminosidade(int pouca, int muita){
        if(luz.luzAmbiente > pouca){
            lampada.setIsLigado(false); //LAMPADA APAGADA
        }else if (luz.luzAmbiente < muita){
            lampada.setIsLigado(true); //LAMPADA ACESA
        }
    }
}
