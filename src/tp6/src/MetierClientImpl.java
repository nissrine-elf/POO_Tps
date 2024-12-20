import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class MetierClientImpl implements IMetier<Client>{
    private List<Client> Lstc;
    private String nom="client.dat";
    public MetierClientImpl() {
        this.Lstc =  getAll();
    }

    public Client add(Client o){
        this.Lstc.add(o);
        return o;
    }
    public  List<Client> getAll(){
        List<Client>cls=new ArrayList<>();
        File f=new File(this.nom);
        if(!f.exists()){  try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
            return cls; }
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(this.nom))){
            cls=(List<Client>)is.readObject();
        }catch (Exception e){e.printStackTrace();}
        return cls;
    }
    public  Client findByNom(String nom){
        Client x=null;
        for(Client c :this.Lstc){
            if(c.getNom().equalsIgnoreCase(nom)){
                x=c; ; break;}
        }
        return x;
    }
    public void delete(String nom){
        Lstc.removeIf(c->c.getNom().equalsIgnoreCase(nom));
        saveAll();
    }
    public void saveAll(){
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.nom))){
            os.writeObject(Lstc);
        }catch (Exception e){
            e.printStackTrace();
        }}
}
