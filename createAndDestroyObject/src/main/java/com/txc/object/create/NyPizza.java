package com.txc.object.create;

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

            this.size = size;
        }
    }

    NyPizza(Builder<?> builder) {
        super(builder);
        this.size = builder.
    }
}
