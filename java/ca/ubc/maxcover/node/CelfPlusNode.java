package ca.ubc.maxcover.node;

public class CelfPlusNode extends CelfNode {

    public int mg2;
    public int prevBest;

    public CelfPlusNode(int id, int mg, int mg2, int flag, int prevBest) {
        this.id = id;
        this.mg = mg;
        this.mg2 = mg2;
        this.flag = flag;
        this.prevBest = prevBest;
    }
}
