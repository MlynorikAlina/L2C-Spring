package annotations.coachapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(JavaAppConfig.class)) {
            BaseballCoach coach = context.getBean("baseballCoach", BaseballCoach.class);
            System.out.println(coach.getTeam());
        }
    }
}
