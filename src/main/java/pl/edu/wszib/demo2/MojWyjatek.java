package pl.edu.wszib.demo2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PROCESSING)
public class MojWyjatek extends RuntimeException{
}
