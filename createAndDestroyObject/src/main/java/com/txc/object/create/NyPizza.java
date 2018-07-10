package com.txc.object.create;

import java.util.Objects;

/**
 * @Auther: xiaocan
 * @Date: 2018/7/10 19:52
 * @Description:
 */
public class NyPizza extends Pizza{

    public enum Size{SMALL,MEDIUM,LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }
}
