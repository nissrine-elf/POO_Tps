import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class DossierContact {
    List<String> nom;
    List<String> numero;
    public DossierContact(){
this.nom= new ArrayList<>();this.numero= new ArrayList<>();
chargeDos();
    }
    void chargeDos()  {
        File dossier=new File("contacts");
if(dossier.exists() && dossier.isDirectory()){
  File [] fs=dossier.listFiles();
  for(File f : fs){
      if(f.isFile()){
        try{ BufferedReader br =new BufferedReader(new FileReader(f));
          nom.add(f.getName());
          numero.add(br.readLine());
        br.close();}
        catch (Exception e){e.printStackTrace();}
      }
  }
}else{
    dossier.mkdir();
}}
    String RechercherCont(String nom){
      int ind=this.nom.indexOf(nom);
      if(ind!=-1){return numero.get(ind);}
       return null;
    }
void ajouterCont(String n,String  num){
    this.nom.add(n);
    this.numero.add(num);
    File fichier = new File("contacts/" + n);
    try{
        BufferedWriter wr=new BufferedWriter(new FileWriter(fichier));
        wr.write(num);
        wr.close();
    }catch (Exception e){
       e.printStackTrace();
    }
    }
void supprimerCont(String n){
     int index=nom.indexOf(n);
     if(index!=-1){
         nom.remove(index);
         numero.remove(index);
         File fs=new File("contacts/" + n);
         if(fs.exists()){fs.delete();}
     }
}
    void changerNum(String n,String  num){
        int index=nom.indexOf(n);
if(index!=-1){
    this.numero.set(index,num);
    File fichier = new File("contacts/"+ n);
try{
    BufferedWriter wr =new BufferedWriter(new FileWriter(fichier));
    wr.write(num);
    wr.close();
}catch(Exception e){e.printStackTrace();}
}}
void enrgisterCont(){
   for (int i=0;i<nom.size();i++){
       if (nom.get(i) != null && numero.get(i) != null) { File f=new File("contacts/"+ nom.get(i));
       try {
           BufferedWriter writer = new BufferedWriter(new FileWriter(f));
           writer.write(numero.get(i));
           writer.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}}
}
