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
    private ModuloLuminosidade moduloLuz;
    private ModuloAlarme moduloAlarme;
    private ModuloTemperatura moduloTemperatura;
    /**
     * Diferentes contrutores para diferentes divisões da casa
     */
    /**
     * Divisao da casa onde tem todos os módulos.
     * @param moduloLuz
     * @param moduloAlarme
     * @param moduloTemperatura
     * @param divisao 
     */
    public Divisao(ModuloLuminosidade moduloLuz ,ModuloAlarme moduloAlarme,ModuloTemperatura moduloTemperatura, TipoDivisao divisao ){
        moduloLuz = new ModuloLuminosidade(moduloLuz.luz.luzAmbiente);
        this.moduloLuz= moduloLuz;
        moduloAlarme = new ModuloAlarme(moduloAlarme.getPin());
        this.moduloAlarme = moduloAlarme;
        moduloTemperatura = new ModuloTemperatura(moduloTemperatura.sensorTemperatura);
        this.moduloTemperatura = moduloTemperatura;
        this.divisao = divisao;
    }   
    /**
     * Divisão da casa onde apenas tem modulo de Luz e Alarme.
     * @param moduloLuz
     * @param moduloAlarme
     * @param divisao 
     */
    public Divisao(ModuloLuminosidade moduloLuz ,ModuloAlarme moduloAlarme, TipoDivisao divisao ){
        moduloLuz = new ModuloLuminosidade(moduloLuz.luz.luzAmbiente);
        this.moduloLuz= moduloLuz;
       moduloAlarme = new ModuloAlarme(moduloAlarme.getPin());
       this.moduloAlarme = moduloAlarme;
        this.divisao = divisao;
    }   
    /**
     * Divisão da casa onde apenas tem o modulo de Luz e Temperatura.
     * @param moduloLuz
     * @param moduloTemperatura
     * @param divisao 
     */   
    public Divisao(ModuloLuminosidade moduloLuz ,ModuloTemperatura moduloTemperatura, TipoDivisao divisao ){
        moduloLuz = new ModuloLuminosidade(moduloLuz.luz.luzAmbiente);
        this.moduloLuz= moduloLuz;
        moduloTemperatura = new ModuloTemperatura(moduloTemperatura.sensorTemperatura);
        this.moduloTemperatura = moduloTemperatura;
        this.divisao = divisao;
    }   
    /**
     * Divisão da casa onde apenas tem o modulo de luz.
     * @param moduloLuz
     * @param divisao 
     */   
    public Divisao(ModuloLuminosidade moduloLuz , TipoDivisao divisao ){
        moduloLuz = new ModuloLuminosidade(moduloLuz.luz.luzAmbiente);
        this.moduloLuz= moduloLuz;
        this.divisao = divisao;
    } 
    /**
     * Divisao da casa onde apenas tem o modulo de Alarme.
     * @param moduloAlarme
     * @param divisao 
     */  
    public Divisao(ModuloAlarme moduloAlarme, TipoDivisao divisao ){
       moduloAlarme = new ModuloAlarme(moduloAlarme.getPin());
        this.moduloAlarme = moduloAlarme;
        this.divisao = divisao;
    }   
    
    /**
     * Método que devolvo a temperatura da divisão.
     * @return moduloTemperatura.getTemperatura()
     */      
    public int getTemperatura(){
          return moduloTemperatura.getTemperatura();
      }
    /**
     * Método que regula a temperatura de certa divisão implementando os valores que o utilizador quer.
     * @param temp
     * @param variacao 
     */  
    public void medirTemperatura(int temp, int variacao){
          moduloTemperatura.medirTemperatura(temp, variacao);
      }
    /**
     * Método que devolvo o tipo de divisao.
     * @return divisao
     */
    public TipoDivisao getTipo(){
          return divisao;
      }    
    /**
     * Método que devolve o valor de luz ambiente na sala.
     * @return moduloLuz.getLuzAmbiente()
     */    
    public int getLuzAmbiente(){
          return moduloLuz.getLuzAmbiente();
      }
    /**
     * Método que devolve o valor de luz da lampada.
     * @return moduloLuz.getLuzLampada();
     */         
    public double getLuzLampada(){
        return moduloLuz.getLuzLampada();
    }
    /**
     * Método que devolve o estado da Lampada.
     * @return moduloLuz.getStatusLamp();
     */      
    public boolean getStatusLampada(){
        return moduloLuz.getStatusLamp();
    }
    /**
     * Método que mede a luz segundo os valores que o utilizador coloca.
     * @param pouca
     * @param muita 
     */
    public void medirLuz(int muito, int pouco){
          moduloLuz.medirLuminosidade(muito, pouco);
    }
    /**
     * Método para ligar a lampada.
     * 
     */
    public void ligarLamp(){
        moduloLuz.ligarLampada(true);
    }
      /**
     * Método para desligar a lampada.
     * 
     */
    public void desligarLuz(){
        moduloLuz.ligarLampada(false);
    }
    /**
     * Método para ligar a Tomada.
     * @param tomada 
     */
    public void ligarTomada(boolean tomada){
          moduloLuz.ligarTomada(tomada);
    }
    /**
     * Método para controla da potencia da lampada.
     * @param potencia 
     */
    public void intensidadeLuz(int potencia){
          moduloLuz.controleLampada(potencia);
    } 
    //Alarme
    public void ligarAlarme(){
        moduloAlarme.dispararAlarme();
    }
    public void setPinAlarme(String pin){
        moduloAlarme.setPin(pin);
    }
    public void setAlarmeON(String comando, String pin){
        moduloAlarme.setIsActivo(comando, pin);
    }
    public String getAlarmePin(){
        return moduloAlarme.getPin();
    }
    public boolean getAlarmeStatus(){
        return moduloAlarme.getStatusAlarme();
    }
    public boolean getPortStatus(){
        return moduloAlarme.getPortSensor();
    }
    public boolean getMovStatus(){
        return moduloAlarme.getMovSensor();
    }
    public void setAbrirPorta(){
        moduloAlarme.abrirPorta_fechar(true);
    }
    public void setFecharPorta(){
        moduloAlarme.abrirPorta_fechar(false);
    }
}
