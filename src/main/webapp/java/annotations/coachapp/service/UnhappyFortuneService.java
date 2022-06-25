package annotations.coachapp.service;

import org.springframework.stereotype.Component;

@Component
public class UnhappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "sorry, today is not your lucky day";
    }
}
