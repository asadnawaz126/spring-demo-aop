package demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demoAnnotationMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getCoachName());
        System.out.println(coach.getTeamName());
        context.close();
    }

}
