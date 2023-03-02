package org.example;

public class Main {
    public static void main(String[] args) {
        ToyFactory tf = new ToyFactory();
        tf.createToyTrain(3);
        tf.createTeddyBear(3);
        tf.createXBox(3);

        System.out.println(tf.getToysList());

        RandomDropToyBox rdtb = new RandomDropToyBox(tf.getToysList());
        System.out.println(rdtb.dropRandomToys(3));
        System.out.println("В коробке остались: ");
        System.out.println(rdtb.getTb());
    }
}