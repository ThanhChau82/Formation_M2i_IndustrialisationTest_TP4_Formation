package edu.m2i.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;


@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private float prix;
	
	@NotBlank
	private String description;
	
	@NotBlank
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
