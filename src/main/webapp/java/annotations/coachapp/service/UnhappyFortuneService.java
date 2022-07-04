package annotations.coachapp.service;

public class UnhappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "sorry, today is not your lucky day";
    }
}
