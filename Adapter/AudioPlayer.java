package adapterpattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roydo
 */
public class AudioPlayer implements MediaPlayer{
    
    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType,String fileName){
        //inbuilt support for mp3 music file
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file.Name:"+fileName);
        }
        //mediaAdapter provides support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc")|| audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else
        {
            System.out.println("Invalid media"+audioType+"format not supported");
        }
    }
    
}
