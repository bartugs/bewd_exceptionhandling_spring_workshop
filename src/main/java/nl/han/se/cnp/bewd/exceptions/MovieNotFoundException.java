package nl.han.se.cnp.bewd.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieNotFoundException extends RuntimeException {

    public MovieNotFoundException(String message) {
        super(message);  // Roep de superconstructor aan met de boodschap
    }
}

