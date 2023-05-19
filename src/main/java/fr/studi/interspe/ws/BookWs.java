package fr.studi.interspe.ws;

import fr.studi.interspe.pojo.Status;
import fr.studi.interspe.pojo.Livre;
import fr.studi.interspe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRegistration.API_REST
        + ApiRegistration.BOOK)

public class BookWs {

    @Autowired
    private BookService bookService;

    @GetMapping(ApiRegistration.STATUS + "{bookState}")
    public List<Livre> getAllBookByStatus(@PathVariable Status status){
        return bookService.getAllBooksByState(status);
    }

    @GetMapping
    public List<Livre> getAllLivres(){
        return bookService.getAllLivres();
    }

    @GetMapping("{id}")
    public Livre getLivreById(@PathVariable Long id){
        return bookService.getLivreById(id);
    }

}
