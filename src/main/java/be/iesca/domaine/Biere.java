package be.iesca.domaine;

import java.util.Objects;

public class Biere {

	String brasserie;
	String couleur;
	String nom;
	String type;
	
	public Biere(String brasserie, String couleur, String nom, String type) {
		this.brasserie = brasserie;
		this.couleur = couleur;
		this.nom = nom; 
		this.type = type;
	}
	
	public Biere(Biere biere) {
		this.brasserie = biere.brasserie;
		this.couleur = biere.couleur;
		this.nom = biere.nom; 
		this.type = biere.type;
	}

	public String getBrasserie() {
		return brasserie;
	}

	public String getCouleur() {
		return couleur;
	}

	public String getNom() {
		return nom;
	}

	public String getType() {
		return type;
	}

	public void setBrasserie(String brasserie) {
		this.brasserie = brasserie;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Biere [brasserie=" + brasserie + ", couleur=" + couleur + ", nom=" + nom + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biere other = (Biere) obj;
		return Objects.equals(brasserie, other.brasserie) && Objects.equals(couleur, other.couleur)
				&& Objects.equals(nom, other.nom) && Objects.equals(type, other.type);
	}
	
	
}
