package com.renault;

import com.renault.computer.Computer;
import com.renault.computer.Keyboard;

public class Application {

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard(50);
        Computer apple = new Computer("apple", 32, keyboard);

        apple.start();


        apple.doSomeStuff();


        apple.stop();
    }

}
