package exercise_47;

import java.util.*;
public class Monster implements ISaveable {
    // write code here
    private String name;
    private int hitPoints;
    private int strength;
    
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHitPoints() {
        return hitPoints;
    }
    
    public int getStrength() {
        return strength;
    }
    
    @Override
    public List<String> write() {
        List<String> val2 = new ArrayList<String>();
        val2.add(0, this.name);
        val2.add(1, "" + this.hitPoints);
        val2.add(2, "" + this.strength);
        return val2;
    }
    
    @Override
    public void read(List<String> savedValues) {
        if ((savedValues != null) && (savedValues.size() > 0)) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
    
    @Override
    public String toString() {
        return "Monster{name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
    
}