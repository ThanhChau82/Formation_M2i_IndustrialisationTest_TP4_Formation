package edu.m2i.entities;

public class Formation {
	private Integer id;
	private float prix;
	private String description;
	private String titre;
	
	public Formation() {
		super();
	}
	
	public Formation(float prix, String description, String titre) {
		super();
		this.prix = prix;
		this.description = description;
		this.titre = titre;
	}

	public Formation(Integer id, float prix, String description, String titre) {
		super();
		this.id = id;
		this.prix = prix;
		this.description = description;
		this.titre = titre;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Formation [id=" + id + ", prix=" + prix + ", description=" + description + ", titre=" + titre + "]";
	}
}
