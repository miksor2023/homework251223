package com.example.homework251223;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Integer> items = new ArrayList<>();

    public void add(List<Integer> items){
        this.items.addAll(items);
    }
    public List<Integer> get(){
        return Collections.unmodifiableList(items);
    }
}
