package app.config;

import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {


    @Bean(name="timerBean")
    public Timer getTimer() {
        return new Timer();
    }

//    @Bean
//    public AnimalsCage animalsCage() {
//        return new AnimalsCage(getTimer());
//    }


}
