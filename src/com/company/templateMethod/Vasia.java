package com.company.templateMethod;

public class Vasia extends Man {
    @Override
    void differ() {
        System.out.print("Меня зовут Вася. ");
    }

    @Override
    void differ2() {
        System.out.println("Не важно. Пока");
    }
}
