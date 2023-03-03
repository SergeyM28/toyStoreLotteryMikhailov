package org.example;

public class Main {
    public static void main(String[] args) {
        ToyFactory toyFactory = new ToyFactory();
        toyFactory.createToyTrain(2);
        toyFactory.createTeddyBear(2);
        toyFactory.createXBox(2);

        RandomDropToyBox randomBox = new RandomDropToyBox(toyFactory.getToysList());
        System.out.println("В розыгрыше участвуют: ");
        System.out.println(randomBox.getToyList());

        PrizeToyBox prizeBox = new PrizeToyBox(randomBox.dropRandomToys(3));
        prizeBox.takeToy();
        prizeBox.takeToy();
        prizeBox.takeToy();

        System.out.println("В коробке с игрушками остались: ");
        System.out.println(randomBox.getToyList());
        System.out.println("В коробке с призами остались: ");
        System.out.println(prizeBox.getToyList());
    }
}