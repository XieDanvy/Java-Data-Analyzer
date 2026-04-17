package fr.pantheonsorbonne.ufr27.miashs.poo;

import java.lang.Double;
import java.lang.String;

public final class Item {
  private String nomDuJoueur;

  private String teamDuJoueur;

  private String posteDuJoueur;

  private Double pourcentage2Point;

  private Double pourcentage3Point;

  public String getNomDuJoueur() {
    return this.nomDuJoueur;
  }

  public void setNomDuJoueur(String nomDuJoueur) {
    this.nomDuJoueur=nomDuJoueur;
  }

  public String getTeamDuJoueur() {
    return this.teamDuJoueur;
  }

  public void setTeamDuJoueur(String teamDuJoueur) {
    this.teamDuJoueur=teamDuJoueur;
  }

  public String getPosteDuJoueur() {
    return this.posteDuJoueur;
  }

  public void setPosteDuJoueur(String posteDuJoueur) {
    this.posteDuJoueur=posteDuJoueur;
  }

  public Double getPourcentage2Point() {
    return this.pourcentage2Point;
  }

  public void setPourcentage2Point(Double pourcentage2Point) {
    this.pourcentage2Point=pourcentage2Point;
  }

  public Double getPourcentage3Point() {
    return this.pourcentage3Point;
  }

  public void setPourcentage3Point(Double pourcentage3Point) {
    this.pourcentage3Point=pourcentage3Point;
  }
}
