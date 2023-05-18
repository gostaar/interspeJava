package fr.studi.interspe.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auteur_id;
    private String prenom;
    private String nom;

    public Auteur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Auteur() {
    }
}
