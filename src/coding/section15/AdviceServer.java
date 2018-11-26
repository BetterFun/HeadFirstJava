package coding.section15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2018/11/18 0018.
 */
public class AdviceServer {
    public static void main(String[] args) {
        AdviceServer server=new AdviceServer();
        server.go();
    }

    public void go(){
        try {
            ServerSocket serverSocket=new ServerSocket(4242);

            while (true){
                Socket socket=serverSocket.accept();

                OutputStreamWriter ow=new OutputStreamWriter(socket.getOutputStream());

                BufferedWriter writer=new BufferedWriter(ow);
                String advice=getAdvice();
                writer.write(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAdvice() {
        String[] advice={"Love me love my dog ","Take smaller bites ","One word:inappropriate ","You might want to rethink that haircut."};
        return advice[(int) (Math.random()*advice.length)];
    }
}
