package Exeption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DivideByZeroException extends IllegalArgumentException {

    public DivideByZeroException(String[] args) {
        SpringApplication.run(DivideByZeroException.class, args);
    }

}