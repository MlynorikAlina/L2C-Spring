package annotations.coachapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("coachappConfig-annotations.xml")) {
            Coach coach = context.getBean("baseballCoach", Coach.class);
            System.out.println(coach.getTeam());
        }
    }
}
