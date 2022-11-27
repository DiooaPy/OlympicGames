
public class Client {
    public static void main(String[] args) throws Exception {
        CompositeTeam Olympic = new CompositeTeam("Olympic");
            CompositeTeam Asia = new CompositeTeam("Asia");
            Olympic.add(Asia);

                CompositeTeam China = new CompositeTeam("China");
                Asia.add(China);

                    CompositeTeam Women_ch = new CompositeTeam("Womens's Team"); 
                    China.add(Women_ch);

                        LeafTeam Taekwondo = new LeafTeam("Taekwondo", 4, 1);
                        LeafTeam Waterpolo = new LeafTeam("Waterpolo", 9,2);
                        LeafTeam Artistic = new LeafTeam("Artistic", 6, 0);
                        Women_ch.add(Taekwondo);
                        Women_ch.add(Waterpolo);
                        Women_ch.add(Artistic);

                    CompositeTeam Men_ch = new CompositeTeam("Mens's Team");
                    China.add(Men_ch);

                        LeafTeam Shooting = new LeafTeam("Shooting", 8, 2);
                        Men_ch.add(Shooting);

            CompositeTeam Europe = new CompositeTeam("Europe");
            Olympic.add(Europe);

                CompositeTeam Germany = new CompositeTeam("Germany");
                Europe.add(Germany);

                    CompositeTeam Women_ger = new CompositeTeam("Women_ger"); 
                    Germany.add(Women_ger);

                        LeafTeam Cyling = new LeafTeam("Cyling", 8, 2);
                        Women_ger.add(Cyling);

                        LeafTeam Tennis = new LeafTeam("Tennis", 8, 2);
                        Women_ch.add(Tennis); 

                    CompositeTeam Men_ger = new CompositeTeam("Men_ger");
                    Germany.add(Men_ger);

                        LeafTeam Table_Tennis = new LeafTeam("Table Tennis", 4, 32);
                        Men_ger.add(Table_Tennis);

                        LeafTeam Footbal_ger = new LeafTeam("Footbal", 4, 32);
                        Men_ger.add(Footbal_ger);  

                CompositeTeam Italy = new CompositeTeam("Italy");
                Europe.add(Italy);

                    CompositeTeam Women_IT = new CompositeTeam("Women_IT"); 
                    Italy.add(Women_IT);

                        LeafTeam Alpine_Sky = new LeafTeam("Alpine Sky", 8, 2);
                        Women_IT.add(Alpine_Sky); 

                    CompositeTeam Men_IT = new CompositeTeam("Men_IT");
                    Italy.add(Men_IT);

                        LeafTeam Footbal_IT = new LeafTeam("Footbal", 4, 32);
                        Men_IT.add(Footbal_IT);

                        LeafTeam Swimming = new LeafTeam("Swimming Team", 4, 32);
                        Men_IT.add(Swimming);
       

        
        
        
        
TeamVisitor v = new TeamVisitor();
        
v.visit(Olympic);

    }
}
