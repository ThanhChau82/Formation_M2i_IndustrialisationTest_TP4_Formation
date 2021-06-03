package edu.m2i.entities;

public class Session {
	private Integer id;
	private String date;
	private String formation;
	private int duree;
	
	public Session() {
		super();
	}
	public Session(String date, String formation, int duree) {
		super();
		this.date = date;
		this.formation = formation;
		this.duree = duree;
	}
	
	public Session(Integer id, String date, String formation, int duree) {
		super();
		this.id = id;
		this.date = date;
		this.formation = formation;
		this.duree = duree;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFormation() {
		return formation;
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	@Override
	public String toString() {
		return "Session [id=" + id + ", date=" + date + ", formation=" + formation + ", duree=" + duree + "]";
	}
}
