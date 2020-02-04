package demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        Coach firstCoach = context.getBean("tennisCoach", Coach.class);

        Coach secondCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (firstCoach == secondCoach);

        System.out.println("Result is: " + result);
    }
}
