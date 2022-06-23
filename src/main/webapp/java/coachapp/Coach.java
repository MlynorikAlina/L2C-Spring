package coachapp;

import coachapp.service.FortuneService;

public abstract class Coach {
    private FortuneService fortuneService;

    public Coach() {
    }

    public Coach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public abstract String getDailyWorkout();

    public String getFortuneService(){
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
