public class Sommeur  implements Runnable{
    private int debut;
    private int fin;
    private int somme;
private int t[];
    Sommeur( int debut ,int fin ,int t[]){
        this.debut=debut;this.fin=fin;
this.t=t;
this.somme=0;
    }
    @Override
    public void run() {
       for(int i=this.debut;i<this.fin;i++){
           somme=somme+t[i];
       }
    }
    int getSomme(){
        return somme;
    }
}
