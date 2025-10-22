package com.directi.training.lsp.exercise_refactored;

public class Duck implements IQuackable, ISwimmable
{
    @Override
    public void quack()
    {
        System.out.println("Quack...");
    }

    @Override
    public void swim()
    {
        System.out.println("Swim...");
    }
}