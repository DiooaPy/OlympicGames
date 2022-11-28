import java.util.ArrayList;

public class CompositeTeam implements Team {
    String name;
    int athletes;
    int gold_medals;


    ArrayList<Team> teams = new ArrayList<Team>();

    public CompositeTeam(String name) {

        this.name = name;


    }


    public void add(Team team) {

        teams.add(team);
    }

    public void remove(Team team) {

        teams.remove(team);
    }


    public void accept(Visitor v) {
        v.visit(this);
    }


}
