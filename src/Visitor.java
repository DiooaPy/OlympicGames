public interface Visitor {

    void visit(LeafTeam leaf);

    void visit(CompositeTeam compositeTeam);

}
