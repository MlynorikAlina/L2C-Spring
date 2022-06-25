package annotations.coachapp;

import annotations.coachapp.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Coach {
    private FortuneService fortuneService;

    public abstract String getDailyWorkout();
    
    public String getFortuneService(){
        return fortuneService.getFortune();
    }
    @Autowired
    public void injectSomeFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
