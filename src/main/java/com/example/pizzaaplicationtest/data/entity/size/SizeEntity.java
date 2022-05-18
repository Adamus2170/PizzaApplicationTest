package com.example.pizzaaplicationtest.data.entity.size;

import com.example.pizzaaplicationtest.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;


@Entity
@Table(name = "sizes")

public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private String sizeType;

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

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

    public BigDecimal getPriceBase() {
        return priceBase;
    }

    public void setPriceBase(BigDecimal priceBase) {
        this.priceBase = priceBase;
    }
}
