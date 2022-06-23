package coachapp;

import coachapp.service.FortuneService;

public class TrackCoach extends Coach{
    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        super(fortuneService);
    }
    @Override
    public String getDailyWorkout() {
        return "run 10 km ";
    }

    private void init(){
        System.out.println("TrackCoach: in init method");
    }

    private void destroy(){
        System.out.println("TrackCoach: in destroy method");
    }
}
