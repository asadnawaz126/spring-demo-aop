package demo_annotations;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You suck balls";
    }
}
