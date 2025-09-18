package src;

/**
 * A data structure to represent a parsed instruction.
 * 
 * Fields:
 * - opcode: instruction mnemonic (e.g., LDR, STR).
 * - R: Register number.
 * - IX: Index register number.
 * - I: Indirect addressing bit.
 * - address: memory address or label.
 * - original: original instruction text (for writing in output).
 */
public class Instruction {
    String opcode;
    int R, IX, I, address;
    String original;

    public Instruction(String opcode, int R, int IX, int I, int address, String original) {
        this.opcode = opcode;
        this.R = R;
        this.IX = IX;
        this.I = I;
        this.address = address;
        this.original = original;
    }
}
