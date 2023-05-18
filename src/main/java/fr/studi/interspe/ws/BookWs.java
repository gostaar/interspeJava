package fr.studi.interspe.ws;

import fr.studi.interspe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiRegistration.API_REST
        + ApiRegistration.BOOK)

public class BookWs {

    @Autowired
    private BookService bookService;

    @GetMapping

    @PutMapping

    @PostMapping

    @DeleteMapping

}
