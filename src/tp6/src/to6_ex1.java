import java.io.File;
import java.util.Scanner;
public class to6_ex1 {
    public static void main(String[] args) {
        System.out.print("Entrez le chemin du répertoire : ");
       Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File repertoire = new File(path);
        if (repertoire.exists() && repertoire.isDirectory()) {
            lister(repertoire);
        } else {
            System.out.println("Le répertoire spécifié n'existe pas.");
        }
    }
    public static void lister(File rep) {
        File[] fichiers = rep.listFiles();
        if (fichiers != null) {
            for (File fichier : fichiers) {
                String type = fichier.isDirectory() ? "<DIR>" : "<FICH>";
                String permissions = obtenirPermissions(fichier);
                System.out.println(fichier.getPath() + " " + type + " " + permissions);
                if (fichier.isDirectory()) {
                    lister(fichier);
                }
            }
        }
    }
    public static String obtenirPermissions(File fichier) {
        String permissions = "";
        permissions += (fichier.canRead()) ? "r" : "-";
        permissions += (fichier.canWrite()) ? "w" : "-";
        permissions += (fichier.getName().startsWith(".")) ? "h" : "-";
        return permissions;
    }
}




