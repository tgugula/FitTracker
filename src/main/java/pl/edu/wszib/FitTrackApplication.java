package pl.edu.wszib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class FitTrackApplication {
    public static void main(String[] args) {
        SpringApplication.run(FitTrackApplication.class, args);
    }
}
