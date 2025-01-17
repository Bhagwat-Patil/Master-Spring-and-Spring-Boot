package com.demo.Learn_Spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Sit");
    }

    public void left() {
        System.out.println("Backward");
    }

    public void right() {
        System.out.println("Forward");
    }
}
