package pl.edu.wszib.demo2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ObslugaBledow {

    @ExceptionHandler
    public ResponseEntity handle(Exception e) {
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                .body("Hej korzysztam z body");
    }

    @ExceptionHandler
    public String handle(ArithmeticException e) {
        return "Nie dziel przez zero";
    }
}
