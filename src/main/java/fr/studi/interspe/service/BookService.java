package fr.studi.interspe.service;

import fr.studi.interspe.pojo.Livre;
import fr.studi.interspe.pojo.Status;

import java.util.List;

public interface BookService {


    List<Livre> getAllBooksByState(Status status);

    Livre getLivreById(Long id);

    List<Livre> getAllLivres();
}