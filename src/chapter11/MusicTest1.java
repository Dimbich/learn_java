package chapter11;
import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequence = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор");
        } catch (MidiUnavailableException e) {
            System.out.println("неудача");
        }

    }
    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
