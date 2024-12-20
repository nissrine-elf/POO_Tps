import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MagicClient {
    public static void main(String[] args) {
        int a;
        Scanner ss=new Scanner(System.in);
       try{
           Socket s=new Socket("localhost",123);
           InputStream is=s.getInputStream();
           OutputStream os=s.getOutputStream();
           DataInputStream dataIn = new DataInputStream(is);
           DataOutputStream dataOut = new DataOutputStream(os);
           int b = dataIn.readInt();
           System.out.println("Le serveur a envoyé le nombre magique.");
           do{
               System.out.println("entrer le nombre ");
               a=ss.nextInt();
               dataOut.writeInt(a);
               String rep=dataIn.readUTF();
               System.out.println(rep);
               if (rep.equals("Félicitations  vous avez trouvé le nombre magique ")){
                   a=b;
               }
           }while (a!=b);



       } catch (Exception e) {
           throw new RuntimeException(e);
       }



    }

}
