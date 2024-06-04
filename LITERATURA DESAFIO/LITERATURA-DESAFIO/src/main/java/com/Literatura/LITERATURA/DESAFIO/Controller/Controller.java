package com.Literatura.LITERATURA.DESAFIO.Controller;

import com.Literatura.LITERATURA.DESAFIO.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Controller {
    private AutorRepository autorRepository;
    private LibroRepository libroRepository;
    private LibroService = service;
    private AutorService = autorService;
    @Autowired
    public Controller (AutorRepository  autorrepository, LibroRepository libroRepository, LibroService, AutorService autorService){

    }
     this.autorRepository = autorRepository;
        this.libroRepository = libroRepository;
        this.libroService = service;
        this.autorService = autorService;
}
public Libro getDataBooks(String tituloDeLibro) {
    Optional<Libro> libro = libroService.recoverBook(tituloDeLibro);
    return libro.get();
}
public List<Libro> listBooksRegistred() {
    return libroRepository.findAll();
}
public List<Autor> listAuthorsRegistred() {
    return autorRepository.findAll();
}
public List<Autor>  listAuthorsAliveInYear(int año) {
    return autorService.getAuthorsAliveInYear(año);
}
public List<Libro> listBooksByLanguage(String idioma) {
    return libroService.getBooksByLanguage(idioma);
}

}

    }

}
