package com.example.pizzaaplicationtest.data.entity.size;

import com.example.pizzaaplicationtest.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "sizes")
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private String sizeType;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;

    //To przy potencjalnym przyszłym dodaniu OrderSizeEntity
    /*
    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSizes;
    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSizeType() {
        return sizeType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

    /*
    public Set<OrderSizeEntity> getOrderSizes() {
        return orderSizes;
    }

    public void setOrderSizes(Set<OrderSizeEntity> orderSizes) {
        this.orderSizes = orderSizes;
    }
    */

    public PizzaEntity getPizza() {
        return pizza;
    }

    public void setPizza(PizzaEntity pizza) {
        this.pizza = pizza;
    }
}
