/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
package projecto;
import java.util.*;

public class Consola {
    private static int aux = 0;
    
    private String nomeUtilizador;
    private String morada;
    private ModuloAlarme alarme;
    private ModuloLuminosidade luz;
    private ModuloTemperatura temperatura;
    private ArrayList<Divisao> divisao;
        
    public Consola(String nomeUtilizador,String morada){
       this.nomeUtilizador = nomeUtilizador;
       this.morada= morada;
       divisao = new ArrayList<Divisao>();
       luz = new ModuloLuminosidade();
       alarme = new ModuloAlarme();
       temperatura = new ModuloTemperatura();
      }
    
    public ModuloTemperatura mudarTemperatura(int temp, int variacao){
        temperatura.medirTemperatura(temp, variacao);
        return temperatura;
    }
    
    public void addDivisao(Divisao division){
       divisao.add(division);
    }
    
    public void removeDivisao(Divisao division){
        if(divisao.equals(division)){
            divisao.remove(division);
        }
    }
    
    public int getNummeroDivisoes(){
        return divisao.size();
    }
    
    public void ligarLamp(){
        luz.ligarLampada(true);
    }
    
    public void desligarLuz(){
        luz.ligarLampada(false);
    }
    
    public void autoLuz(int pouca, int muita){
        luz.medirLuminosidade(pouca, muita);
    }
   
    public  ModuloLuminosidade intensidadeLuz(double potencia){
        luz.controleLampada(potencia);
        return luz;
    }
    
    public String toString(){
        String str = "Temos " + divisao.size() + " divisões nesta casa.";
        return str;
    }
    
}
