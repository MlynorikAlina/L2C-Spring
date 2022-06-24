package annotations.coachapp;

import annotations.coachapp.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach extends Coach {

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting field";
    }
}
