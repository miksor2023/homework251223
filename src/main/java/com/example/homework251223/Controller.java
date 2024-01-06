package com.example.homework251223;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController

public class Controller {
    private final BasketService basketService;

    public Controller(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/order/add")
    public void add (@RequestParam Integer... items){
        basketService.add(items);
    }
    @GetMapping("/order/get")
    public List<Integer> get(){
        return basketService.get();
    }
}
