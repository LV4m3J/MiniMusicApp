import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {


    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException ex) {
            ex.printStackTrace();
        }
        System.out.println("Мы получили синтезатор");
    }
    public static void main(String[] args) {
        MusicTest1 mt1 = new MusicTest1();
        mt1.play();
    }
}
