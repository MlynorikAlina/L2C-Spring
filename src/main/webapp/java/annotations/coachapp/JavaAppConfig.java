package annotations.coachapp;

import annotations.coachapp.service.HappyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("coachapp.properties")
@ComponentScan("annotations.coachapp")
public class JavaAppConfig {

}
