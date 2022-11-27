public class BaseTeam implements Team {
    String name;
    int athletes;
    int gold_medals;

    public void accept(Visitor v) {

        if (this instanceof CompositeTeam) {
            v.visit((CompositeTeam) this);
        } else {
            v.visit((LeafTeam) this);
        }

    }
}
