package annotations.coachapp;

import annotations.coachapp.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public abstract class Coach {
    @Autowired
    @Qualifier("foo")
    private FortuneService fortuneService;

    public abstract String getDailyWorkout();
    
    public String getFortuneService(){
        return fortuneService.getFortune();
    }

}
