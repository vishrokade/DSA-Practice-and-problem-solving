package DAA;

import java.util.HashMap;
import java.util.PriorityQueue;

class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;
    }
}

public class HuffmanEncoding {
    public static HashMap<Character, String> buildHuffmanCodes(String text) {
        HashMap<Character, String> huffmanCodes = new HashMap<>();
        PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>();

        // Calculate character frequencies
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }

        // Create Huffman nodes for each character and add to the priority queue
        for (char c : frequencies.keySet()) {
            priorityQueue.add(new HuffmanNode(c, frequencies.get(c)));
        }

        // Build the Huffman tree
        while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode merged = new HuffmanNode('\0', left.frequency + right.frequency);
            merged.left = left;
            merged.right = right;
            priorityQueue.add(merged);
        }

        // Generate Huffman codes
        generateHuffmanCodes(priorityQueue.peek(), "", huffmanCodes);

        return huffmanCodes;
    }

    public static void generateHuffmanCodes(HuffmanNode root, String code, HashMap<Character, String> huffmanCodes) {
        if (root == null)
            return;
        if (root.data != '\0') {
            huffmanCodes.put(root.data, code);
        }
        generateHuffmanCodes(root.left, code + "0", huffmanCodes);
        generateHuffmanCodes(root.right, code + "1", huffmanCodes);
    }

    public static void main(String[] args) {
        String text = "vishal";
        HashMap<Character, String> huffmanCodes = buildHuffmanCodes(text);

        System.out.println("Character Codes:");
        for (char c : huffmanCodes.keySet()) {
            System.out.println(c + ": " + huffmanCodes.get(c));
        }
    }
}
