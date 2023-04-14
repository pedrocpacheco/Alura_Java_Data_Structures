package Files.HardCoded;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
// import java.net.Socket;

public class WriteRead {
    public static void main(String[] args) throws Exception{
        // Socket socket = new Socket();
        // socket.getInputStream();
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();

        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        while(line != null && !line.isEmpty()){
            bw.write(line);
            bw.newLine();
            bw.flush();
            System.out.println();
            line = br.readLine();
        }
        br.close();
        bw.close();
    }
}
