package com.example.homework251223;

import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class BasketService {

    private final Basket basket;
    //инжектим зависимость от Basket
    public BasketService (Basket basket){
        this.basket = basket;
    }

    public void add(Integer[] items){
            basket.add(Arrays.asList(items));
    }
    public List<Integer> get(){
        return basket.get();
    }

}
