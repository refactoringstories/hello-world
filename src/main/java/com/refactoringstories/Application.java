package com.refactoringstories;

public class Application {
    
    public static void main(String[] args) {
        System.out.println(new Application().sayHello());
    }

    public String sayHello() {
        return "Hello world!";
    }
}