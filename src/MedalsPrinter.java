public class MedalsPrinter implements Visitor {


    public MedalsPrinter(Team root){
        root.accept(this);
    }


    public void visit(CompositeTeam compositeTeam) {

        System.out.println(compositeTeam.name);

        for (Team team : compositeTeam.teams) {


            team.accept(this);
           
        }
    }

    public void visit(LeafTeam leaf) {

        System.out.println("        Team: " + leaf.name + ", Number of Gold Medals: " + leaf.gold_medals);
    }

}
