/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
package projecto;
import java.util.*;

public class Consola {
    
    private String nomeUtilizador;
    private String morada;
    private ArrayList<Divisao> divisao;
        
    public Consola(String nomeUtilizador,String morada){
       this.nomeUtilizador = nomeUtilizador;
       this.morada= morada;
       divisao = new ArrayList<Divisao>();
       }
    
    public void addDivisao(Divisao division){
       divisao.add(division);
    }
    
    public void removeDivisao(Divisao division){
        if(divisao.equals(division)){
            divisao.remove(division);
        }
    }
    
    public String toString(){
        String str = "Temos " + divisao.size()+ " divisões nesta casa.";
        return str;
    }
    
}
