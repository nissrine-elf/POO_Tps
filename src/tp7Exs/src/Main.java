public class Main {
    public static void main(String[] args) throws InterruptedException {
        int t[] = new int[6];
        for (int i = 1; i <= 6; i++) {
            t[i - 1] = i;
        }
        int nombreThreads = 2;
        int taillePlage = t.length / nombreThreads;
        Sommeur[] sommeurs = new Sommeur[nombreThreads];
        for (int i = 0; i < nombreThreads; i++) {
            int debut = i * taillePlage;
            int fin = (i == nombreThreads - 1) ? t.length : (i + 1) * taillePlage;
            sommeurs[i] = new Sommeur(debut, fin, t);
        }
        Thread th[]=new Thread[nombreThreads];
        for (int i = 0; i < nombreThreads; i++) {
            th[i]=new Thread(sommeurs[i]);
           th[i].start();
        }
        for (int i = 0; i < nombreThreads; i++) {
            th[i].join();
        }
        int sTotal=0;
        for (int i = 0; i < nombreThreads; i++) {
            sTotal+=sommeurs[i].getSomme();
        }
      System.out.println("la somme totale est :"+sTotal);}}