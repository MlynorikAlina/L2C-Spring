package annotations.coachapp;

import annotations.coachapp.service.FortuneService;

public abstract class Coach {
    private FortuneService fortuneService;

    public Coach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public abstract String getDailyWorkout();
    
    public String getFortuneService(){
        return fortuneService.getFortune();
    }
}
