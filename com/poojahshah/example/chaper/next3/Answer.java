package com.poojahshah.example.chaper.next3;

// Java code below
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

// Write your answer here, and then test your code.
// Your job is to implement the getCartTotal() method.

class Answer {

    // Change these boolean values to control whether you see
    // the expected answer and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        List<Answer.Item> items = new ArrayList<>();
        items.add(new Answer.Item(1, "shirt", 100, 2));
        items.add(new Answer.Item(2, "shoes", 3800, 1));
        items.add(new Answer.Item(3, "pants", 1500, 3));
        items.add(new Answer.Item(4, "hat", 70, 5));
        items.add(new Answer.Item(5, "jacket", 1250, 1));
        float result = Answer.getCartTotal(items);

        System.out.println(result);
    }

    // Return the total value of the shopping cart in the items array.
    static float getCartTotal(List<Item> items) {
        // Your code goes here. Use an internal iterator (Java's forEach() method)
        // to add each item's value to the cart.

        AtomicReference<Float> total = new AtomicReference<>(0.0f);
        items.forEach(item -> {
            float current = total.get();
            float newitem = item.getPrice() * item.getQuantity();
            total.getAndSet(current + newitem);
        });
        return total.get();
    }

    // A model class holding each item's values
    public static class Item {
        private int id;
        private String name;
        private float price;
        private int quantity;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Item(int id, String name, float price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "[" + this.id + ", " + this.name + ", " + this.price + "]";
        }
    }

}

