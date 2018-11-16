package coding.section12.miniMusic;

import javax.sound.midi.*;

/**
 * Created by Administrator on 2018/11/16 0016.
 */
public class MiniMusicPlayer1 {
    public static void main(String[] args) {
        try {
            Sequencer player= MidiSystem.getSequencer();
            player.open();

            Sequence sequence=new Sequence(Sequence.PPQ,4);
            Track track=sequence.createTrack();

            for(int i=5;i<80;i++){
                track.add(MiniMusicPlayer1.makeEvent(144,1,i,100,i));
                track.add(MiniMusicPlayer1.makeEvent(128,1,i,100,i+2));
            }

            player.setSequence(sequence);
            player.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int trick) {
        MidiEvent event=null;
        ShortMessage message=new ShortMessage();
        try {
            message.setMessage(comd,chan,one,two);
            event=new MidiEvent(message,trick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }
}
