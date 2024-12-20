import java.io.*;
import java.net.*;
public class FileClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             InputStream in = socket.getInputStream()) {
            // Demander à l'utilisateur de saisir le nom du fichier
            System.out.print("Entrez le nom du fichier à demander: ");
            String fileName = userInput.readLine();
            // Envoyer le nom du fichier au serveur
            out.println(fileName);
            // Lire la réponse du serveur (contenu du fichier ou message d'erreur)
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);  // Afficher le contenu du fichier ou erreur
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
