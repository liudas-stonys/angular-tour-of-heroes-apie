package lt.liudasstonys.angulartourofheroesapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicLong;

// https://www.codingame.com/playgrounds/2096/playing-around-with-spring-bean-configuration

@Configuration
public class AppConfig {

    @Bean
    public AtomicLong counterBean() {
        return new AtomicLong();
    }
}
