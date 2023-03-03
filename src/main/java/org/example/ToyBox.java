package org.example;

import java.util.List;

public abstract class ToyBox {
    protected List<Toy> toyList;

    public List<Toy> getToyList() {
        return toyList;
    }

    public void setToyList(List<Toy> tb) {
        this.toyList = tb;
    }

    public ToyBox(List<Toy> tb) {
        this.toyList = tb;
    }
    public Toy getById(int id){
        for (Toy elem : toyList){
            if (elem.getId() == id){
                return elem;
            }
        }
        return null;
    }
}
