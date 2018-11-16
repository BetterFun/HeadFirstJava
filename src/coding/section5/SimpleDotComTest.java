package coding.section5;

/**
 * Created by Administrator on 2018/11/12 0012.
 */
public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom=new SimpleDotCom();

        int[] location={4,5,6};

        simpleDotCom.setLocations(location);

        int guess=1;

        String result=simpleDotCom.checkYourself(guess);
        System.out.println(result);
    }
}
