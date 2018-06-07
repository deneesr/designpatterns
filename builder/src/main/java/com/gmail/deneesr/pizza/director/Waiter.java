package com.gmail.deneesr.pizza.director;

import com.gmail.deneesr.pizza.builder.PizzaBuilder;
import com.gmail.deneesr.pizza.product.Pizza;

/**
 * Director
 */
public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

}
