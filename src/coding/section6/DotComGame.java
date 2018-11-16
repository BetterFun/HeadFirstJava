package coding.section6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/11/13 0013.
 */
public class DotComGame {
    private ArrayList<DotCom> dotComs;
    private int guessNum=0;

    public ArrayList<DotCom> getDotComs() {
        return dotComs;
    }

    public void setDotComs(ArrayList<DotCom> dotComs) {
        this.dotComs = dotComs;
    }

    public void initGame(int dotComNum){
        this.dotComs=new ArrayList<>();
        String[] vtl={"A","B","C","D","E","F","G"};
        Random random=new Random();
        for (int i=0;i<dotComNum;i++){
            DotCom dotCom=new DotCom();
            ArrayList<String> cellLocations=new ArrayList<>();
            if(random.nextBoolean()){
                int aross=random.nextInt(5);
                int vertical=random.nextInt(7);
                for (int j=0;j<3;j++){
                    cellLocations.add(vtl[vertical]+(aross+j));
                }
            }else {
                int aross=random.nextInt(7);
                int vertical=random.nextInt(5);
                for (int j=0;j<3;j++){
                    cellLocations.add(vtl[vertical+j]+aross);
                }
            }
            dotCom.setCellLocations(cellLocations);
            dotCom.setDotComName("dotcom"+i);
            this.dotComs.add(dotCom);
        }
        System.out.println(this.dotComs.get(0).getCellLocations().get(0));
    }

    public boolean checkUserInput(String guess){
        return guess.matches("");
    }

    public void startGame(){
        Scanner scanner=new Scanner(System.in);

        int dotComNum=this.dotComs.size();
        String resule=null;
        while (!"end".equals(resule)){
            System.out.print("enter a guess ");
            String guess=scanner.next();
            this.guessNum++;
            for (DotCom dotCom:this.dotComs){
                resule=dotCom.checkYourself(guess);
                if("hit".equals(resule)){
                    break;
                }else if("kill".equals(resule)){
                    System.out.println(dotCom.getDotComName()+" has been destory!");
                    this.dotComs.remove(dotCom);
                    dotComNum--;
                    if(dotComNum == 0){
                        resule="end";
                        System.out.println("Game Over");
                    }
                    break;
                }
            }
            System.out.println(resule);
        }
        System.out.println("you took "+this.guessNum+"guesses");

    }

    public static void main(String[] args) {
        DotComGame dotComGame=new DotComGame();
        dotComGame.initGame(3);
        dotComGame.startGame();
    }
}
