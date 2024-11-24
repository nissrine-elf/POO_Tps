package tp2;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetierProduit {
	private List<Produit> listProduits=new ArrayList<>();
	public Produit add(Produit p) {
		listProduits.add(p); 
		return p;}
	public List<Produit> getAll(){
		return this.listProduits;
	}
	public List<Produit> findByNom(String motCle){ 
	List<Produit> res = new ArrayList<>();
	for(Produit p :listProduits) {
		if(p.getNom().contains(motCle)) {res.add(p);}
	}
	return res;
	}	
	public Produit findById(long id) {
		for(Produit p :listProduits) {
			if(p.getId()==id) {return p;}
		}
		return null;	
	}
	public void delete(long id) {
		for(int i=listProduits.size()-1;i>=0;i--) {
			Produit p=listProduits.get(i);
			if(p.getId()==id) {
				listProduits.remove(i);
				break;
			}
		}
	}


		
	}