package org.example;

public class Main {
    public static void main(String[] args) {
        ToyFactory tf = new ToyFactory();
        tf.createToyTrain(10);
        tf.createTeddyBear(10);
        tf.createXBox(10);

        System.out.println(tf.getToysList());
    }
}