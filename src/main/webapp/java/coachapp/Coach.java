package coachapp;

import coachapp.service.FortuneService;

public abstract class Coach {
    private FortuneService fortuneService;
    private String team;

    public Coach() {
    }

    public Coach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public abstract String getDailyWorkout();

    public String getFortuneService(){
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
