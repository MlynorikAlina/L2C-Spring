package annotations.coachapp;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach extends Coach {

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting field";
    }
}
