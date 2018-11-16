package coding.section11;

import javax.sound.midi.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/11/15 0015.
 */
public class MiniMusicCmdLine {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the instrument:");
        int instrument=scanner.nextInt();
        System.out.println("enter the note:");
        int note=scanner.nextInt();
        //System.out.println("over");

        MiniMusicCmdLine mini=new MiniMusicCmdLine();
        mini.play(instrument,note);
    }

    public void play(int instrument,int note){
        try {
            Sequencer player= MidiSystem.getSequencer();
            player.open();

            Sequence sequence=new Sequence(Sequence.PPQ,4);
            Track track=sequence.createTrack();

            MidiEvent midiEvent=null;

            ShortMessage first=new ShortMessage();
            first.setMessage(192,1,instrument,0);
            MidiEvent changeInstrument=new MidiEvent(first,1);
            track.add(changeInstrument);

            ShortMessage a=new ShortMessage();
            a.setMessage(144,1,note,100);
            MidiEvent noteOn=new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b=new ShortMessage();
            b.setMessage(128,1,note,100);
            MidiEvent noteOff=new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(sequence);
            player.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
