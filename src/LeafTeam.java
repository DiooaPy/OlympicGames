
public class LeafTeam extends BaseTeam {
    String name;
    int athletes;
    int gold_medals;

    public LeafTeam(String name, int athletes, int gold_medals) {
        this.name = name;
        this.athletes = athletes;
        this.gold_medals = gold_medals;
    }


    public void accept(Visitor v) {
        v.visit(this);
    }


}
