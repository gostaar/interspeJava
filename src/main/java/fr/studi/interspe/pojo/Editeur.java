package fr.studi.interspe.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Editeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editeur_id;
    private String nom;

    public Editeur(String nom) {
        this.nom = nom;
    }

    public Editeur() {
    }
}
