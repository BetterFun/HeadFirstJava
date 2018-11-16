package coding.section12.miniMusic.miniMusicPlayer;

import coding.section12.miniMusic.MiniMusicPlayer2;

import javax.sound.midi.*;
import javax.swing.*;

/**
 * Created by Administrator on 2018/11/16 0016.
 */
public class MiniMusicPlayer3 implements ControllerEventListener{
    public MiniMusicGUI gui;

    public static void main(String[] args) {
        MiniMusicPlayer3 player=new MiniMusicPlayer3();
        player.createGUI();
        player.start();
    }

    public void createGUI(){
        gui=new MiniMusicGUI();
        gui.create();
    }

    public void start(){
        try {
            Sequencer player= MidiSystem.getSequencer();
            player.open();

            Sequence sequence=new Sequence(Sequence.PPQ,4);
            Track track=sequence.createTrack();
            int[] eventTWants={127};
            player.addControllerEventListener(this,eventTWants);

            for(int i=5;i<80;i++){
                track.add(MiniMusicPlayer3.makeEvent(144,1, (int) ((Math.random()*50)+1),100,i));
                track.add(MiniMusicPlayer3.makeEvent(176,1,127,0,i));
                track.add(MiniMusicPlayer3.makeEvent(128,1,(int) ((Math.random()*50)+1),100,i+2));
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

    @Override
    public void controlChange(ShortMessage event) {
        gui.frame.repaint();
        System.out.println("change");
    }
}
