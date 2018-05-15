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
    
    public CamaraDeVideo(String video) {
        super(video);
        this.video = video.concat(".mp4");
    }

    public String getVideo() {
        return video;
    }
    
    
    
}
