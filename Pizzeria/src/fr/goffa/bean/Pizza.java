package fr.goffa.bean;

public class Pizza {

	private Integer id;
	private String libelle;
	private String ref;
	private Double prix;
	private String url;

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(Integer id, String libelle, String ref, Double prix, String url) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.ref = ref;
		this.prix = prix;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
