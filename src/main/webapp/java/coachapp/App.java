package coachapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        Coach coach, alphaCoach;
        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("coachappConfig-beanScope.xml")) {
            coach = applicationContext.getBean("coach", Coach.class);
            alphaCoach = applicationContext.getBean("coach", Coach.class);
        }
        boolean equals = (coach == alphaCoach);
        System.out.println("Links are the same: " + equals);
        System.out.println("coach: " + coach);
        System.out.println("alphaCoach: " + alphaCoach);

    }
}
