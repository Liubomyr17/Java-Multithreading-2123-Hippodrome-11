package com.company;

/*

2113 Hippodrome 11

The Hippodrome class is almost done.
Add a run () call to the end of the main method.
Hint:
run () is a non-static method, so you can only call it on an object.
And where to get the object?
Tip 2:
game.run ();


 */

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("me", 3, 0);
        Horse horse2 = new Horse("myself", 3, 0);
        Horse horse3 = new Horse("i", 3, 0);
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        // hyppodrome 11
        game.run();
        }

        public void move() {
        horses.forEach(Horse::move);
        }

        public void print() {
        for (Horse horse : this.horses) {
            horse.print();
        }
        for (int i=0; i<10; i++) {
            System.out.println();
        }
        }
        
        public void run() {
        for (int i=0; i<100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
}

