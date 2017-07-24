package passagensaereas;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Som {
    
    public static void music() {  
        AudioPlayer MGP = AudioPlayer.player;  
        AudioStream BGM=null;  
        try {  
            BGM = new AudioStream(new FileInputStream("chimes.wav"));  
        } catch(IOException error) {  
            System.out.println("Error ao tocar musica!!!");  
        }  

        MGP.start(BGM);   

    }
    
    public static void erro() {  
        AudioPlayer MGP = AudioPlayer.player;  
        AudioStream BGM=null;  
        try {  
            BGM = new AudioStream(new FileInputStream("CallResume.wav"));  
        } catch(IOException error) {  
            System.out.println("Error ao tocar musica!!!");  
        }  

        MGP.start(BGM);   

    }

class mus extends Thread{
    public void run(){
        try {  
               AudioClip ac = Applet.newAudioClip(new File("irc.wav").toURL());
               ac.loop();
            } catch(IOException e){  
                System.out.println("Erro na thread!!!");  
            }  
        }  
    }
}

