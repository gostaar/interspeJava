package fr.studi.interspe.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@Entity

public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emprunt_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exemplaire_id")
    private Exemplaire exemplaire;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adherent_id")
    private Adherents adherents;

    private LocalDate dateEmprunt;
    private LocalDate dateRetour;
    private Status statut;

}
