package com.example.pizzaaplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddOrderDto {
    private List<AddPizzaOrderDto> pizzas;
    private PersonDto person;

    public AddOrderDto() {
    }

    public AddOrderDto(List<AddPizzaOrderDto> pizzas, PersonDto person) {
        this.pizzas = pizzas;
        this.person = person;
    }

    public List<AddPizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<AddPizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
