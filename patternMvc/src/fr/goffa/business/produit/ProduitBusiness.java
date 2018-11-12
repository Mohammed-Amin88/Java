package fr.goffa.business.produit;

import java.util.ArrayList;

import fr.goffa.bean.Produit;

public class ProduitBusiness {

	public ArrayList<Produit> getProduits() {

		Produit Eau = new Produit("Evian", 3.75,
				"https://i2.cdscdn.com/pdt2/6/2/9/1/700x700/evi2009839417629/rw/evian-premium-natural-mineral-water-eau-6-x-1-25l.jpg");
		Produit Cafe = new Produit("Grand'Mere", 4.25,
				"https://images-na.ssl-images-amazon.com/images/I/51XgQx0ElwL._SY445_.jpg");
		Produit Jus = new Produit("Jus d'orange", 3.66,
				"https://static.greenweez.com/images/products/19000/600/vitamont-jus-de-carottes-bio-75cl.jpg");
		Produit Fromage = new Produit("President Rondelé", 2.53,
				"https://mymarket.ma/1749-home_default/rondele-fromage-a-tartiner-a-l-ail-et-aux-fines-herbes-president-125-g.jpg");
		Produit Beurre = new Produit("BEURRE BALADE", 4.25,
				"https://www.balade.be/userfiles/product/beurre-solight-doux-fr.png");

		ArrayList<Produit> ProduitsAlimentaires = new ArrayList<Produit>();

		ProduitsAlimentaires.add(Eau);
		ProduitsAlimentaires.add(Cafe);
		ProduitsAlimentaires.add(Jus);
		ProduitsAlimentaires.add(Fromage);
		ProduitsAlimentaires.add(Beurre);

		return ProduitsAlimentaires;

	}
}
