package coding.section15;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/11/20 0020.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("D:"+File.separator+"txt"+File.separator+"1.txt");
        System.out.println(file.getParent());

    }
}
