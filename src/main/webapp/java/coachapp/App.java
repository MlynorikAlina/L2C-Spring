package coachapp;

public class App {
    public static void main(String[] args) {
        Coach coach = new BaseballCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
