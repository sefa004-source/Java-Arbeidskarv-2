import static java.lang.Character.getType;
//subklasse
public class Ball extends Equipment{

    private String type;
    boolean needsAir;
//konstruktør
    public Ball(int id, String location, boolean needsReplacement,String type,boolean needsAir) {
        super(id, location, needsReplacement,needsAir);
        this.type = type;
        this.needsAir =needsAir;
    }
    public String type() {
        return type;
    }

    public boolean isNeedsAir() {
        return needsAir;
    }
}

