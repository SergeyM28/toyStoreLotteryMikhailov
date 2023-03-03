package org.example;

import java.util.List;

public class PrizeToyBox extends ToyBox implements ToyTaker {

    private ToyProtocolist tp;

    public PrizeToyBox(List<Toy> tb) {
        super(tb);
        this.tp = new ToyProtocolist();
    }

    public PrizeToyBox(List<Toy> tb, ToyProtocolist tp) {
        super(tb);
        this.tp = tp;
    }

    @Override
    public void takeToy() {
        System.out.printf("Победитель получает %s \n", toyList.get(0).getName());
        tp.protocolToy(toyList.remove(0));
    }
}
