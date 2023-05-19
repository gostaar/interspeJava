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


public class Adherents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adherent_id;

    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private Boolean caution;

    public Adherents(String nom, String prenom, String telephone, String email, Boolean caution) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.caution = caution;
    }

    public Adherents() {

    }

}
