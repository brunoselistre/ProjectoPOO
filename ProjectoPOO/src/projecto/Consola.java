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
    private int clienteNumero;
    private HashMap<Divisao, Sensores> sensores;
    private HashMap<Divisao, Atuadores> atuadores;
    
        
    public Consola(){
        clienteNumero = ++aux;
        
    }
}
