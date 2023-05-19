package fr.studi.interspe.ws;

import fr.studi.interspe.pojo.*;
import fr.studi.interspe.service.AdherentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiRegistration.API_REST
        + ApiRegistration.ADHERENT)
@RestController // -> je consomme et je renvoi du JSON
// @Controller -> je renvoie du HTML
@CrossOrigin(origins = "*",allowedHeaders = "*")

public class AdherentsWs {

    @Autowired
    private AdherentService adherentService;

    @GetMapping
    public List<Adherents> getAllAdherent(){
        return null;
    }

    @GetMapping("{id}")
    public Adherents getAdherentById(@PathVariable("id") Long id){
        return null;
    }

    @PostMapping
    public void createAdherent(@RequestBody Adherents adherents){
        adherentService.createAdherent(adherents);
    }

    @PutMapping("{id}")
    public void updateAdherentById(@RequestBody Adherents adherents,
                                   @PathVariable Long id){
        adherentService.updateAdherentById(adherents,id);
    }

    @DeleteMapping("{id}")
    public void deleteAdherentById(@PathVariable Long id){
        adherentService.deleteAdherentById(id);

    }

}
