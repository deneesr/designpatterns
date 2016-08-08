package com.gmail.deneesr;

import com.gmail.deneesr.builder.HawaiianPizzaBuilder;
import com.gmail.deneesr.builder.PizzaBuilder;
import com.gmail.deneesr.director.Waiter;
import com.gmail.deneesr.product.Pizza;

/**
 * A customer ordering a pizza.
 */
public class BuilderExample {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }

}
