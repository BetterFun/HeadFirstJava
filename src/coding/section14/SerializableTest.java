package coding.section14;

import java.io.*;

/**
 * Created by Administrator on 2018/11/16 0016.
 */
public class SerializableTest {
    public static void main(String[] args) {
        GameCharactor player1=new GameCharactor(50,"elf",new String[]{"bow","sword","dust"});
        GameCharactor player2=new GameCharactor(200,"troll",new String[]{"bare hans","sword"});
        GameCharactor player3=new GameCharactor(150,"magic",new String[]{"spells"});
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Game.ser "));
            out.writeObject(player1);
            out.writeObject(player2);
            out.writeObject(player3);

            ObjectInputStream in=new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharactor one= (GameCharactor) in.readObject();
            GameCharactor two=(GameCharactor) in.readObject();
            GameCharactor three=(GameCharactor) in.readObject();

            System.out.println(one.getPower());
            System.out.println(two.getPower());
            System.out.println(three.getPower());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class GameCharactor implements Serializable{
    public int power;
    public String type;
    public String[] weapons;

    public GameCharactor(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getWeapons() {
        return weapons;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }
}
