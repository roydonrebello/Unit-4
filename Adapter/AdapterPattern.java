/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterpattern;

/**
 *
 * @author roydo
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        
        audioPlayer.play("mp3","Badshah.mp3");
        audioPlayer.play("mp4","honey.mp4");
        audioPlayer.play("vlc","vlc.com");
        audioPlayer.play("avi","avi.com");
    }
    
}
