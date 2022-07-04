package annotations.coachapp;

import annotations.coachapp.service.FortuneService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class BaseballCoach extends Coach {
    public BaseballCoach(FortuneService fortuneService) {
        super(fortuneService);
    }

    @PostConstruct
    public void doInit(){
        System.out.println("init");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("destroy");
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting field";
    }
}
