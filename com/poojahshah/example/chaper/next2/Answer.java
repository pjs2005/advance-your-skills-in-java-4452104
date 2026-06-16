package com.poojahshah.example.chaper.next2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Write your answer here, and then test your code.

class Answer {

    // Change these boolean values to control whether you see
    // the expected answer and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        List<Answer.Item> items = new ArrayList<>();
        items.add(new Answer.Item(1, "shirt", 100));
        items.add(new Answer.Item(2, "shoes", 3800));
        items.add(new Answer.Item(3, "pants", 1500));
        items.add(new Answer.Item(4, "hat", 70));
        items.add(new Answer.Item(5, "jacket", 1250));
        List<Answer.Item> result = Answer.sortList(items);
    }

    // Return the largest number in the 'numbers' array.
    static List<Item> sortList(List<Item> items) {

        List<Item> result = new ArrayList<>(items);
        // Your code goes here. Sort the result list using a lambda expression.

        return result.stream().sorted((o1, o2) -> Float.compare(o1.getPrice(),o2.getPrice())).toList();

//        return result;
    }

    public static class Item {
        int id;
        String name;
        float price;

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
        public Item(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString() {
            return "[" + this.id + ", " + this.name + ", " + this.price + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Item item = (Item) o;
            return id == item.id && Float.compare(price, item.price) == 0 && Objects.equals(name, item.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, price);
        }
    }

}
