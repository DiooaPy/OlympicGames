
public class Client {
    public static void main(String[] args) throws Exception {
    CompositeTeam Root = new CompositeTeam("Root");
    
        CompositeTeam Olympic = new CompositeTeam("Olympic");
        Root.add(Olympic);

        CompositeTeam Asia = new CompositeTeam("Asia");
            Olympic.add(Asia);

                CompositeTeam China = new CompositeTeam("China");
                Asia.add(China);

                    CompositeTeam Women_ch = new CompositeTeam("China-Women"); 
                    China.add(Women_ch);

                        LeafTeam Taekwondo = new LeafTeam("Taekwondo", 1, 2);
                        LeafTeam Waterpolo = new LeafTeam("Waterpolo", 3,4);
                        LeafTeam Artistic = new LeafTeam("Artistic", 5, 6);
                        Women_ch.add(Taekwondo);
                        Women_ch.add(Waterpolo);
                        Women_ch.add(Artistic);

                    CompositeTeam Men_ch = new CompositeTeam("China-Men");
                    China.add(Men_ch);

                        LeafTeam Shooting = new LeafTeam("Shooting", 7, 8);
                        Men_ch.add(Shooting);

            CompositeTeam Europe = new CompositeTeam("Europe");
            Olympic.add(Europe);

                CompositeTeam Germany = new CompositeTeam("Germany");
                Europe.add(Germany);

                    CompositeTeam Women_ger = new CompositeTeam("Germany-Women"); 
                    Germany.add(Women_ger);

                        LeafTeam Cyling = new LeafTeam("Cyling", 9, 10);
                        Women_ger.add(Cyling);

                        LeafTeam Tennis = new LeafTeam("Tennis", 11, 12);
                        Women_ch.add(Tennis); 

                    CompositeTeam Men_ger = new CompositeTeam("Germany-Men");
                    Germany.add(Men_ger);

                        LeafTeam Table_Tennis = new LeafTeam("Table Tennis", 13, 14);
                        Men_ger.add(Table_Tennis);

                        LeafTeam Footbal_ger = new LeafTeam("Footbal", 15, 16);
                        Men_ger.add(Footbal_ger);  

                CompositeTeam Italy = new CompositeTeam("Italy");
                Europe.add(Italy);

                    CompositeTeam Women_IT = new CompositeTeam("Italy-Women"); 
                    Italy.add(Women_IT);

                        LeafTeam Alpine_Sky = new LeafTeam("Alpine Sky", 17, 18);
                        Women_IT.add(Alpine_Sky); 

                    CompositeTeam Men_IT = new CompositeTeam("Italy-Men");
                    Italy.add(Men_IT);

                        LeafTeam Footbal_IT = new LeafTeam("Footbal", 19, 20);
                        Men_IT.add(Footbal_IT);

                        LeafTeam Swimming = new LeafTeam("Swimming Team", 21, 22);
                        Men_IT.add(Swimming);
       

        
        
        

                        
                        


// 2.4 a)
System.out.println("---------------------2.4 a)--------------------------");
new AthletesPrinter(Men_ger);
System.out.println("----------------------------------------------------");
// 2.4 b)
System.out.println("---------------------2.4 b)--------------------------");
new MedalsPrinter(Germany);
System.out.println("----------------------------------------------------");
// 2.4 c)
System.out.println("---------------------2.4 c)--------------------------");
new MedalsPrinter(Asia);
System.out.println("----------------------------------------------------");
// 2.4 d)
System.out.println("---------------------2.4 d)--------------------------");
new AthletesPrinter(Root);
System.out.println("----------------------------------------------------");







    }
}
