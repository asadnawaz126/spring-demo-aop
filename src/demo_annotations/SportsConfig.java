package demo_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("demo_annotations")
@PropertySource(value = { "classpath:sports.properties" }, ignoreResourceNotFound = true)

public class SportsConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return  new SadFortuneService();
    }

    @Bean
    public SwimCoach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
