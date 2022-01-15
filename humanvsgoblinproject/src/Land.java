import Java.Hashmap;

import java.util.HashMap;

public class Land {
    private String name;
    private int n,s,e,w;
    private Hashmap<String, Integer> navTable;

    public Land(String name, int north, int south, int east, int west) {
        this.name = name;
        this.n = north;
        this.s = south;
        this.e = east;
        this.w = west;

        navTable = new HashMap<>();

    }

    public Land() {
        this.name = "GameProp";
        //maybe something right here?
    }
    public int getN() {
        return n;
    }
    public void setM(int n) {
        this.n = n;
    }
    public int getS() {
        return s;
    }
    public void setS(int s) {
        this.s = s;
    }
    public int getE() {
        return e;
    }
    public void setE(int e) {
        this.e = e;
    }
    public int getW() {
        return w;
    }
    public void setW() {
        this.w = w;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Hashmap<String, Integer> getNavTable() {
        return navTable;
    }

    @Override
    public String toString() {
        return "Land {" +
                "name = '" + name + '\'' +
                ", navigation = " + navTable +
                "}\n";
    }
}
