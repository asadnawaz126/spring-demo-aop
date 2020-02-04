package demo_annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    @Value("${properties.listOfFortunes}")
    private String[] fortunes;

    @Override
    public String getFortune() {

        return fortunes[new Random().nextInt(fortunes.length)];
    }

    @PostConstruct
    public void initMethod(){
        /** I WANT TO INITIALIZE THE ARRAY OVER HERE **/
    }
}
