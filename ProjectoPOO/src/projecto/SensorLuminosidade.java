package projecto;

import java.util.Random;

/*
* Projecto SmartHome 1.0
* @author Bruno Selistre - 170221068
* @author Bruno Luis - 170221066
*/
public class SensorLuminosidade implements Sensores {
    /**
 * Temos declarado a variável final já pedida no enunciado, e também a variável que o utilizador vai decidir.
 */
    public static final int MAX_LUMINOSIDADE = 100;
    public static final int MIN_LUMINOSIDADE = 0;
    public int luzAmbiente;
    private boolean isActivo;
/**
 * Constructor onde vai receber a luz ambiente na divisão.
 * 
 * @param luzAmbiente
 */
    public SensorLuminosidade(int luzAmbiente){
        this.luzAmbiente = luzAmbiente;
        isActivo = true;
    }
    
    public boolean getStatusSensorLuz(){
        return isActivo;
    }
    
/**
 * Retorna a quantidade de luz colocada.
 *
 * @return luzAmbiente
*/
    public int getLuzAmbiente() {
        return luzAmbiente;
    }
}
