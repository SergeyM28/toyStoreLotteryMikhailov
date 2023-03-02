package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDropToyBox extends ToyBox implements Randomizer{

    public RandomDropToyBox(List<Toy> tb) {
        super(tb);
    }

    public List<Toy> dropRandomToys(int number){
        List<Toy>resultList = new ArrayList<>();
        for (int i = 0; i < number; i++){
            int id = pickRandom();
            System.out.printf("Выпадает %s\n", getById(id).getName());
            resultList.add(getById(id));
            tb.remove(getById(id));
        }
        return resultList;

    }

    @Override
    public int pickRandom() {
        List<Integer>tempList = new ArrayList<>();
            for (Toy elem : super.tb){
                for (int i = 0; i < elem.getDropRate(); i++){
                tempList.add(elem.getId());
            }
        }
        Random rd = new Random();
        return tempList.remove(rd.nextInt(0, tempList.size()));
    }
}
