package annotations.coachapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(JavaAppConfig.class)) {
            Coach coach = context.getBean("baseballCoach", Coach.class);
            System.out.println(coach.getFortuneService());
        }
    }
}
