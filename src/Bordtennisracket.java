//subklasse
public class Bordtennisracket extends Equipment{
    private final boolean needsNewpad;
//konstuktør
    public Bordtennisracket(int id, String location, boolean needsReplacement, boolean needsNewpad) {
        super(id, location, needsReplacement, needsNewpad);
        this.needsNewpad = needsNewpad;}

    public boolean isNeedsNewpad() {
        return needsNewpad;}
}
