package demo_annotations;

import com.sun.org.apache.bcel.internal.generic.FieldOrMethod;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${property.coachName}")
    private String coachName;
    @Value("${property.teamName}")
    private String teamName;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getCoachName() {
        return coachName;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 10 miles";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
