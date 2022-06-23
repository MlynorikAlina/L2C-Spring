package coachapp;

import coachapp.service.FortuneService;

public class BaseballCoach extends Coach {

    public BaseballCoach(FortuneService fortuneService) {
        super(fortuneService);
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting field";
    }
}
