package edu.m2i.entities;

public class Formation {
	private int Id;
	private String prix;
	private String description;
	private String titre;
	
	public Formation() {
		super();
	}
	public Formation(String prix, String description, String titre) {
		super();
		this.prix = prix;
		this.description = description;
		this.titre = titre;
	}
	public Formation(int id, String prix, String description, String titre) {
		super();
		Id = id;
		this.prix = prix;
		this.description = description;
		this.titre = titre;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
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
		return "Formation [Id=" + Id + ", prix=" + prix + ", description=" + description + ", titre=" + titre + "]";
	}
	
}
