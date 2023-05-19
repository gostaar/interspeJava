package fr.studi.interspe.service;

import fr.studi.interspe.pojo.*;

import java.util.List;

public interface AdherentService {
    List<Adherents> getAllAdherent();

    Adherents getAdherentById(Long id);

    void deleteAdherentById(Long id);

    void updateAdherentById(Adherents adherents, Long id);

    void createAdherent(Adherents adherents);
}