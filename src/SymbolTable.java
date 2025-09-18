package src;

import java.util.HashMap;

/**
 * Symbol Table for storing labels and their corresponding addresses.
 * 
 * Tasks:
 * - Store (label → address) mappings.
 * - Provide lookup methods for PassTwo.
 * - Handle duplicate label errors.
 */
public class SymbolTable {
    private HashMap<String, Integer> table = new HashMap<>();

    public void add(String label, int address) {
        // TODO: Add label to symbol table
    }

    public int get(String label) {
        // TODO: Return address for given label
        return -1;
    }

    public boolean contains(String label) {
        return table.containsKey(label);
    }
}
