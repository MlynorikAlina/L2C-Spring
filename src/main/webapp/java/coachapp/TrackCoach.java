package coachapp;

import coachapp.service.FortuneService;

public class TrackCoach extends Coach{

    public TrackCoach(FortuneService fortuneService) {
        super(fortuneService);
    }
    @Override
    public String getDailyWorkout() {
        return "run 10 km ";
    }

}
