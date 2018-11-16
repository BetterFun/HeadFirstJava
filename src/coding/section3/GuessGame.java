package coding.section3;

/**
 * Created by Administrator on 2018/11/11 0011.
 */
public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;

    public void startGame(){
        boolean p1Right=false;
        boolean p2Right=false;
        boolean p3Right=false;

        this.p1=new Player();
        this.p2=new Player();
        this.p3=new Player();

        p1.guess();
        System.out.println("p1所猜数字为"+p1.number);
        p2.guess();
        System.out.println("p2所猜数字为"+p2.number);
        p3.guess();
        System.out.println("p3所猜数字为"+p3.number);

        int targetNum= (int) (Math.random()*10);
        System.out.println("游戏数字为"+targetNum);

        if(p1.number == targetNum){
            p1Right=true;
        }
        if(p2.number == targetNum){
            p2Right=true;
        }
        if(p3.number == targetNum){
            p3Right=true;
        }

        if(p1Right || p2Right || p3Right){
            System.out.println("游戏结束");
        }else {
            System.out.println("三位玩家都未猜中，游戏继续");
        }
    }
}

class Player{
    public int number;
    public char c;

    public void guess(){
        this.number= (int)( Math.random()*10);
    }
}

class GameLauncher{

    public static void main(String[] args) {
        GuessGame guessGame=new GuessGame();
        guessGame.startGame();
    }
}
