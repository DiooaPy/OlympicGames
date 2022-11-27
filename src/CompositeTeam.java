import java.util.ArrayList;

public class CompositeTeam extends BaseTeam {
    String name;


    ArrayList<BaseTeam> teams = new ArrayList<>();

    public CompositeTeam(String name) {

        this.name = name;


    }


    public void add(BaseTeam team) {

        teams.add(team);
    }

    public void remove(BaseTeam team) {

        teams.remove(team);
    }


    public void accept(Visitor v) {
        v.visit(this);
    }


}
