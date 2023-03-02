package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToyFactory {
    private List<Toy> toysList;
    private IDcreator idCreator;

    public ToyFactory(List<Toy> toysList, IDcreator idCreator) {
        this.toysList = toysList;
        this.idCreator = idCreator;
    }
    public ToyFactory() {
        this.toysList = new ArrayList<>();
        this.idCreator = new IDcreator(1);
    }

    public List<Toy> getToysList() {
        return toysList;
    }

    public void setToysList(List<Toy> toysList) {
        this.toysList = toysList;
    }

    public void createTeddyBear (int value) {
        for (int i = 0; i < value; i++){
            toysList.add(new Toy(idCreator.generateId(), "Teddy Bear", 10));
        }
    }
    public void createToyTrain (int value) {
        for (int i = 0; i < value; i++){
            toysList.add(new Toy(idCreator.generateId(), "Toy Train", 5));
        }
    }
    public void createXBox (int value) {
        for (int i = 0; i < value; i++){
            toysList.add(new Toy(idCreator.generateId(), "XBox", 1));
        }
    }
}
