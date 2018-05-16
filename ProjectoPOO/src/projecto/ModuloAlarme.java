package projecto;
import java.util.Scanner;
/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class ModuloAlarme {
    private SensorMovimento sensorMovimento;
    private SensorPortaAberta sensorPortaAberta;
    private String pin;
    private boolean isActivo;
    private Sirene alarme;
    private Scanner reader;
    private Imagens fotos;
    
    public ModuloAlarme(){
        
    }
    public ModuloAlarme(String pin){
        sensorMovimento = new SensorMovimento();
        sensorPortaAberta = new SensorPortaAberta();
        this.pin = validatePin(pin);
        isActivo = false;
        alarme = new Sirene();
        fotos = new Imagens();
    }
    
    private String validatePin(String pin){
        if(pin.length() == 4){
            this.pin = pin;
            return pin;
        }else{
            this.pin = "0000";
            throw new IllegalArgumentException("O pin deve ter 4 algarismos");
        }
    }
    
    public String setPin(String pin){
        return validatePin(pin);
    }
    public String getPin(){
        return pin;
    }

    public boolean getStatusAlarme() {
        return isActivo;
    }
    public boolean getMovSensor(){
        return sensorMovimento.getStatus();
    }
    
    public boolean getPortSensor(){
        return sensorPortaAberta.getStatus();
    }
    
    public void abrirPorta_fechar(boolean status){
         sensorPortaAberta.setStatus(status);
    }
    
    public void setIsActivo(String comando, String pin) {
        if (this.pin.equalsIgnoreCase(pin) && comando.equalsIgnoreCase("Ligar")){
            this.isActivo = true;
        }else if (this.pin.equalsIgnoreCase(pin) && comando.equalsIgnoreCase("Desigar")){
            this.isActivo = false;
        }else{
            throw new IllegalArgumentException("Comando: LIGAR/DESLIGAR. PIN: 4 dígitos \nComando ou PIN inválido. ");
        } 
    }
    
    public void dispararAlarme(){
       if (isActivo == true && sensorPortaAberta.getStatus() == true){
            System.out.println("Insira o pin para desativar o sistema de alarme: ");

            reader = new Scanner(System.in);
            String key = reader.next();
            
            while(!key.equalsIgnoreCase(pin)){
                System.out.println("PIN INVALIDO. TENTE NOVAMENTE");    
                alarme.setIsLigado(true);
                alarme.setValor(10);         
                key = reader.next();
            }
            isActivo = false;
            System.out.println("Alarme desativado");
        }
        else if (isActivo == true && sensorMovimento.getStatus() == true){
            System.out.println("Insira o pin para desativar o Modulo de Segurança: ");

            reader = new Scanner(System.in);
            String key = reader.next();
            
            while(!key.equalsIgnoreCase(pin)){
                fotos.tirarFotos();
                System.out.println("PIN INVALIDO. TENTE NOVAMENTE");    
                key = reader.next();
            }
            isActivo = false;
            System.out.println("Modulo Segurança DESATIVADO");
            System.out.println("Imagem camaras de segurança: \n" + fotos.tirarFotos());
        }
    }
}
