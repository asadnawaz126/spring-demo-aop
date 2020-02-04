package demo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {



    @Value("${property.coachName}")
    private String coachName;
    @Value("${property.teamName}")
    private String teamName;



    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Inside def constructor tennis coach");
    }

//    @Autowired
//    public void setWhatever(FortuneService fortuneService) {
//        System.out.println("Inside tennis coach set fortune method");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Win the wimbledon";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getCoachName() {
        return coachName;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }
}
