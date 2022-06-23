package coachapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext =
                     new ClassPathXmlApplicationContext("coachappConfig-beanLifecycle.xml")) {
            Coach coach = applicationContext.getBean("coach", Coach.class);
            System.out.println(coach.getFortuneService());
        }
    }
}
