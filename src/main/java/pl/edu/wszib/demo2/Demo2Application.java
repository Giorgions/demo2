package pl.edu.wszib.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.time.Instant;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		Instant teraz = Instant.now();
		Duration piecMinut = Duration.ofMinutes(5);
		teraz.plus(piecMinut);
		SpringApplication.run(Demo2Application.class, args);
	}

}
