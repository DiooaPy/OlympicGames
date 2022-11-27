public class TeamVisitor implements Visitor {
    
    public void visit(CompositeTeam compositeTeam){
        System.out.println(compositeTeam.name);
        for(BaseTeam team: compositeTeam.teams){
            if(team instanceof LeafTeam){
                ((LeafTeam) team).accept(this);
            }else{
                CompositeTeam temp = ((CompositeTeam) team);
                
                
                temp.accept(this);
            }
        }
    }

    public void visit(LeafTeam leaf){
        
        System.out.println("        Team: "+leaf.name+" Number of Athletes: "+leaf.athletes+", Number of Gold Medals: "+leaf.gold_medals);
    }

}
