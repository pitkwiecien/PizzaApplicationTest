package com.example.pizzaaplicationtest.remote.rest.dto.response;

import com.example.pizzaaplicationtest.domain.model.OrderStatusType;
import com.example.pizzaaplicationtest.remote.rest.dto.request.PersonDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonDto person;

    public OrderDto() {
    }

    public OrderDto(Integer id, OrderStatusType status, List<PizzaOrderDto> pizzas, PersonDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
