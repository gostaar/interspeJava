package fr.studi.interspe.service.impl;

import fr.studi.interspe.pojo.*;
import fr.studi.interspe.repository.AdherentRepository;
import fr.studi.interspe.service.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdherentServiceImpl implements AdherentService {

    @Autowired
    private AdherentRepository adherentRepository;

    @Override
    public List<Adherents> getAllAdherent() {
        return adherentRepository.findAllAdherent();
    }

    @Override
    public Adherents getAdherentById(Long id) {
        return adherentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAdherentById(Long id) {
        adherentRepository.deleteById(id);
    }

    @Override
    public void updateAdherentById(Adherents adherents, Long id) {
        // un enregistement est immuable
        // impossible à modifier
        // de ce fait, on doit recuperer l'element, le modifier
        // le remettre
        Adherents oldAdherents = getAdherentById(id);

        if(oldAdherents != null){
            oldAdherents.setNom(adherents.getNom());
            oldAdherents.setPrenom(adherents.getPrenom());
            oldAdherents.setEmail(adherents.getEmail());
            oldAdherents.setCaution(adherents.getCaution());
            adherentRepository.save(oldAdherents);
        }
    }

    @Override
    public void createAdherent(Adherents adherents) {
        adherentRepository.save(adherents);
    }
}