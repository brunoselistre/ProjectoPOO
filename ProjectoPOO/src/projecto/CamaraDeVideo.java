/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;

/**
 *
 * @author bseli
 */
public class CamaraDeVideo extends Camara {
    
    private String video;
/**
 * Constructor onde vai receber um video por nome de string e sempre adiciona automaticamente o tipo de ficheiro, que neste caso é sempre .mp4.
 * 
 * @param video 
 */
    public CamaraDeVideo(String video) {
        super(video);
        this.video = video.concat(".mp4");
    }
/**
 * Retorna o valor de video implementado pelo  utilizador.
 *
 * @return video
*/
    public String getVideo() {
        return video;
    }
    
    
    
}
