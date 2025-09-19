package src;

import java.util.HashMap;

/**
 * Opcode Table for storing mnemonic → binary opcode mappings.
 * 
 * Tasks:
 * - Initialize mappings for all instructions (e.g., LDR → 000001).
 * - Provide a method to fetch binary opcode by mnemonic.
 */
public class OpcodeTable {
    private HashMap<String, String> table = new HashMap<>();

    public OpcodeTable() {
        // TODO: Add opcode mappings here
    }

    public String getOpcode(String mnemonic) {
        return table.get(mnemonic);
    }
}
