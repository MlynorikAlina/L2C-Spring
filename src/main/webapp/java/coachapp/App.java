package coachapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        Coach coach;
        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("coachappConfig.xml")) {
            coach = applicationContext.getBean("coach", Coach.class);
        }
        System.out.println(coach.getDailyWorkout());
    }
}
