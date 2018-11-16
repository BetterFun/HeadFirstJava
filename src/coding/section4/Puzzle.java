package coding.section4;

/**
 * Created by Administrator on 2018/11/12 0012.
 */
public class Puzzle {
    public static void main(String[] args) {
        Caculator[] caculator=new Caculator[6];
        int x=0;
        int y=1;
        int result=0;
        while (x<6){
            caculator[x]=new Caculator();
            caculator[x].ivar=y;
            y=y*10;
            x=x+1;
        }
        x=6;
        while (x>0){
            x=x-1;
            result=result+caculator[x].doStuff(x);
        }
        System.out.println("result " +result);
    }
}

class Caculator{
    int ivar;
    public int doStuff(int factor){
        if(ivar>100){
            return ivar*factor;
        }else {
            return ivar*(5-factor);
        }
    }
}
