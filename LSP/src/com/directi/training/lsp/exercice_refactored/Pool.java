package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn(); 
        
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(IQuackable... quackables)
    {
        for (IQuackable quackable : quackables) {
            quackable.quack();
        }
    }

    private void swim(ISwimmable... swimmables)
    {
        for (ISwimmable swimmable : swimmables) {
            swimmable.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}