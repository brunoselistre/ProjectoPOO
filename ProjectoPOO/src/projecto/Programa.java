/*
* Projecto SmartHome 1.0
* @author Bruno Cunha Selistre - 170221068
* @author Bruno Luis - 170221066
*/

package projecto;


public class Programa {
    public static void main(String[] args) {
        Consola consola = new Consola("Bruno Luis", "Rua do Selistre");
        Lampada lampada = new Lampada();
        ArCondicionado ar = new ArCondicionado();
        
        SensorLuminosidade sensorluz1 = new SensorLuminosidade(98);
        SensorLuminosidade sensorluz2 = new SensorLuminosidade(50);
        SensorLuminosidade sensorluz3 = new SensorLuminosidade(10);
        
        SensorTemperatura sensortemp1 = new SensorTemperatura(16);
        SensorTemperatura sensortemp2 = new SensorTemperatura(18);
        SensorTemperatura sensortemp3 = new SensorTemperatura(20);
        sensortemp1.setIsActivo(true);
        sensortemp2.setIsActivo(true);
        sensortemp3.setIsActivo(true);
        
        ModuloLuminosidade luminosidade1 = new ModuloLuminosidade(sensorluz1.luzAmbiente);
        ModuloLuminosidade luminosidade2 = new ModuloLuminosidade(sensorluz2.luzAmbiente);
        ModuloLuminosidade luminosidade3 = new ModuloLuminosidade(sensorluz3.luzAmbiente);
        
        ModuloTemperatura temperatura1 = new ModuloTemperatura(sensortemp1);
        ModuloTemperatura temperatura2 = new ModuloTemperatura(sensortemp2);
        ModuloTemperatura temperatura3 = new ModuloTemperatura(sensortemp3);
        
        ModuloAlarme alarme1 = new ModuloAlarme("1234");
        ModuloAlarme alarme2 = new ModuloAlarme("0000");
        ModuloAlarme alarme3 = new ModuloAlarme("2546");
        alarme1.setIsActivo("Ligar", "1234");
        alarme2.setIsActivo("Ligar", "0000");
        alarme3.setIsActivo("Ligar", "2546");
        
        Divisao divisao1 = new Divisao(luminosidade1, TipoDivisao.CASA_DE_BANHO);
        Divisao divisao2 = new Divisao(luminosidade2,alarme1,temperatura3,TipoDivisao.SALA);
        Divisao divisao3 = new Divisao(luminosidade3,alarme3,temperatura2,TipoDivisao.QUARTO);
        Divisao divisao4 = new Divisao(luminosidade1,alarme2,TipoDivisao.COZINHA);
      
        consola.addDivisao(divisao1);
        consola.addDivisao(divisao2);
        consola.addDivisao(divisao3);
        consola.addDivisao(divisao4);
        
        divisao2.ligarAlarme();
        divisao3.ligarAlarme();
        
        divisao2.ligarLampada(true);
        divisao1.ligarLampada(true);
        
        System.out.println("A casa tem : " + consola.getNummeroDivisoes() + " divisões.");
                
        System.out.println("O estado do alarme é: " +divisao4.getAlarmeStatus());
        System.out.println("O estado do alarme é: " +divisao2.getStatusLampada());
        
        consola.autoLuz(70, 90);
        System.out.println("O estado da lampada é: " +divisao2.getStatusLampada());
        System.out.println("O estado da lampada é: " +divisao3.getStatusLampada());
        
        
        System.out.println("O sensor de movimento está: " +divisao3.getMovStatus());
        
        
        
       
    }
    
}
