package org.example;

import java.util.List;

public abstract class ToyBox {
    protected List<Toy> tb;

    public List<Toy> getTb() {
        return tb;
    }

    public void setTb(List<Toy> tb) {
        this.tb = tb;
    }

    public ToyBox(List<Toy> tb) {
        this.tb = tb;
    }
    public Toy getById(int id){
        for (Toy elem : tb){
            if (elem.getId() == id){
                return elem;
            }
        }
        return null;
    }
}
