package com.gmail.deneesr.pizza;

import com.gmail.deneesr.pizza.builder.HawaiianPizzaBuilder;
import com.gmail.deneesr.pizza.builder.PizzaBuilder;
import com.gmail.deneesr.pizza.director.Waiter;
import com.gmail.deneesr.pizza.product.Pizza;

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
