package com.example.pizzaaplicationtest.remote.rest.dto.response;

import java.util.List;

public class PizzaCollectionDto {
    private List<PizzaDto> pizzas;

    public PizzaCollectionDto() {
    }

    public PizzaCollectionDto(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PizzaDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaDto> pizzas) {
        this.pizzas = pizzas;
    }
}
