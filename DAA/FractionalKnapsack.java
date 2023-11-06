package DAA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class FractionalKnapsack {
    public static double getMaxValue(int capacity, List<Item> items) {
        // Sort items by value-to-weight ratio in descending order (greedy choice)
        Collections.sort(items, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());

        double totalValue = 0.0;
        int remainingCapacity = capacity;

        for (Item item : items) {
            if (remainingCapacity == 0) {
                break; // Knapsack is full
            }

            int currentWeight = Math.min(remainingCapacity, item.weight);
            totalValue += (double) currentWeight * item.value / item.weight;
            remainingCapacity -= currentWeight;
        }

        return totalValue;
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(10, 2000));
        items.add(new Item(20, 100));
        items.add(new Item(30, 100));

        int knapsackCapacity = 50;

        double maxValue = getMaxValue(knapsackCapacity, items);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}
