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
public class Divisao {
    
    private TipoDivisao divisao;
    private ModuloLuminosidade luz;
    private ModuloAlarme alarme;
    private ModuloTemperatura temperatura;
    
    public Divisao(ModuloLuminosidade luz ,ModuloAlarme alarme,ModuloTemperatura temperatura, TipoDivisao divisao ){
        luz = new ModuloLuminosidade(luz.luz);
        alarme = new ModuloAlarme();
        temperatura = new ModuloTemperatura(temperatura.sensorTemperatura);
        this.divisao = divisao;
    }   
    
  
}
