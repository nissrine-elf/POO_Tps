import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class MetierProduitImpl implements IMetier<Produit>{
   private List<Produit>Lstp;
   private String nom="produits.dat";
    public MetierProduitImpl() {
        this.Lstp =  getAll();
    }
    public Produit add(Produit o){
        this.Lstp.add(o);
        return o;
    }
    public  List<Produit> getAll(){
List<Produit>produits=new ArrayList<>();
File f=new File(this.nom);
if(!f.exists()){  try {
    f.createNewFile();
} catch (IOException e) {
    e.printStackTrace();
}
return produits; }
    try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(this.nom))){
       produits=(List<Produit>)is.readObject();
    }catch (Exception e){e.printStackTrace();}
return produits;
    }
    public  Produit findByNom(String nom){
        Produit x=null;
        for(Produit p :this.Lstp){
            if(p.getNom().equalsIgnoreCase(nom)){
              x=p; ; break;
            }
        }
        return x;
    }
    public void delete(String nom){
        Lstp.removeIf(p->p.getNom().equalsIgnoreCase(nom));
saveAll();
    }
    public void saveAll(){
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(this.nom))){
           os.writeObject(Lstp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
