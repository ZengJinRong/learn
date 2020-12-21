package com.company.pattern.builder;

public class KFCPackage {
    private Food food;
    private Drink drink;

    private KFCPackage(Builder builder) {
        this.food = builder.food;
        this.drink = builder.drink;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public static class Builder {
        private final Food food;
        private Drink drink;

        public Builder(Food food) {
            this.food = food;
        }

        public Builder withDrink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public KFCPackage build() {
            return new KFCPackage(this);
        }
    }
}
