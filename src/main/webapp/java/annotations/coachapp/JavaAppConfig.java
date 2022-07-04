package annotations.coachapp;

import annotations.coachapp.service.HappyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("annotations.coachapp")
public class JavaAppConfig {
    @Bean
    public HappyFortuneService happyFortuneService(){
        return new HappyFortuneService();
    }
    @Bean
    public BaseballCoach baseballCoach(){
        return new BaseballCoach(happyFortuneService());
    }
}
