import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        //port number eka wenas wenne nethi nisa final dala thyenne
        //meka kelinma new ServerSocket(8000) kyla daanna plwn
        //methana mehema dala thyenne output ekak ganna ona nisa
        final int port = 8000;

        //Meken karanne ara listen karan inna server socket eka hadaganna eka.. ekata api port number ekakuth dila thyenw
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("Server is running in port " + port);

        //client kenek request karoth accept karanna
        //eka thmai local socket eka
        Socket localsocket = serverSocket.accept();

        //meken wenne local socket ekata connect wela inna remote socket eke port number eka ganna eka
        System.out.println("port " + localsocket.getPort());

        //local socket ekata connect wela inna remote socket eke IP address eka ganna eka
        System.out.println("IP " + localsocket.getInetAddress());

        //input stream eke mokakhri enawa nm eka read karagannwa
        InputStreamReader inputStreamReader = new InputStreamReader(localsocket.getInputStream());

        //input stream eke enne byte widiyata.. eka String ekakata convert karagnnwa buffer reader eken
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //ara hadagththu string eka read karanwa.. readline eken karanne eka line ekak read karana eka
        String clientmsg = bufferedReader.readLine();

        System.out.println("clinet says " + clientmsg);

    }
}