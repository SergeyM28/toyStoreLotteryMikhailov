package org.example;

public class IDcreator {
    private int id;

    public IDcreator(int id) {
        this.id = id - 1;
    }

    public int generateId (){
        this.id = id + 1;
        return id;
    }
}
