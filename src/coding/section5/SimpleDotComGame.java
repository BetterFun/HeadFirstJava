package coding.section5;


import java.util.Scanner;

/**
 * Created by Administrator on 2018/11/12 0012.
 */
public class SimpleDotComGame {

    public static void main(String[] args) {
        SimpleDotCom simpleDotCom=new SimpleDotCom();

        int randomNum= (int) (Math.random()*5);

        int[] dotComLocation={randomNum,randomNum+1,randomNum+2};
        simpleDotCom.setLocations(dotComLocation);

        String result=null;
        Scanner scanner=new Scanner(System.in);
        int guessNum=0;
        while (!"kill".equals(result)){
            System.out.println("enter a number");
            int guess=scanner.nextInt();
            if(guess >=0 && guess <7){
                result=simpleDotCom.checkYourself(guess);
                guessNum++;
                System.out.println(result);
            }else {
                System.out.println("enter error!");
                continue;
            }
        }
        System.out.println("you took "+guessNum+"guesses");
    }
}
