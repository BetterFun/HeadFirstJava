package coding.section10;

/**
 * Created by Administrator on 2018/11/15 0015.
 */
public class Test01 {
    public int i;
    public Integer j;

    public static void main(String[] args) {
        int m=121;
        Integer n=121;
        System.out.println(m==n);
        /*Test01 t=new Test01();
        t.go();*/
    }

    public void go(){
        i=j;
        System.out.println(j);
        System.out.println(i);
    }
}
