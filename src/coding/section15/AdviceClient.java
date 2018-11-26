package coding.section15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Administrator on 2018/11/18 0018.
 */
public class AdviceClient {

    public static void main(String[] args) {
        AdviceClient adviceClient=new AdviceClient();
        adviceClient.go();
    }

    public void go(){
        try {
            Socket socket=new Socket("127.0.0.1",4242);

            InputStreamReader is=new InputStreamReader(socket.getInputStream());
            BufferedReader reader=new BufferedReader(is);

            String advice=reader.readLine();
            System.out.println("advice is :"+advice);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
