package annotations.coachapp;

import annotations.coachapp.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Coach {
    @Autowired
    private FortuneService fortuneService;

    public abstract String getDailyWorkout();
    
    public String getFortuneService(){
        return fortuneService.getFortune();
    }

}
