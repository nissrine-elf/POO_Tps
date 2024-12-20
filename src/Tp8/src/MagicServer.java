import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class MagicServer {
    public static void main(String[] args) {
        Random r=new Random();
        int magNbr=r.nextInt(101);
        System.out.println(magNbr);
        System.out.println("Le serveur a démarré. Le nombre magique a été généré.");
    try{
        ServerSocket s=new ServerSocket(123);
        Socket ss=s.accept();
        System.out.println("Un joueur est connecté.");
        System.out.println("Bienvenue dans le jeu ! Le nombre magique est entre 0 et 100.");
        InputStream is=ss.getInputStream();
        OutputStream os=ss.getOutputStream();
        boolean guessed =false;
        DataOutputStream dataOut = new DataOutputStream(os);
        dataOut.writeInt(magNbr);
        DataInputStream dataIn = new DataInputStream(is);
      while(!guessed){
          int a = dataIn.readInt();
          if (a<magNbr){
              dataOut.writeUTF("Votre tentative est trop basse. Essayez encore !");
          }else if(a>magNbr){
              dataOut.writeUTF("Votre tentative est trop haute. Essayez encore !");
          }
          else {
              dataOut.writeUTF("Félicitations  vous avez trouvé le nombre magique ");
              guessed = true;
          }
      }



    } catch (Exception e) {
        throw new RuntimeException(e);
    }


















}
}
