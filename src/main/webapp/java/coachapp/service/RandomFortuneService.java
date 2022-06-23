package coachapp.service;

import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private List<String> fortune = List.of("it is your lucky day!","today is a usual day","sorry, but today isn't a lucky day for you");
    private Random rand = new Random();
    @Override
    public String getFortune() {
        return fortune.get(rand.nextInt(3));
    }
}
