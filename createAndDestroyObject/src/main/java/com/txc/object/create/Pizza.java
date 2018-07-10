package com.txc.object.create;

import java.util.EnumSet;
import java.util.Set;

/**
 * @Auther: xiaocan
 * @Date: 2018/7/10 18:27
 * @Description:
 */
public abstract class Pizza {

    public enum Topping{
        HAM,MUSHROOM,ONION,PEPPER,SAUSAGE
    }

    final Set<Topping> toppings;

    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(topping);
            return self();
        }

        protected abstract T self();

        abstract Pizza build();
    }
}
