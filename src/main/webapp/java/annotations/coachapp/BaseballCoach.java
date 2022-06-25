package annotations.coachapp;

import annotations.coachapp.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BaseballCoach extends Coach {

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting field";
    }
}
