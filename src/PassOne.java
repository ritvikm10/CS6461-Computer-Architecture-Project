package src;

/**
 * PassOne of the assembler.
 * 
 * Tasks:
 * - Read source.asm line by line.
 * - Maintain a Location Counter (LOCCTR).
 * - If a line has a label, add it to the Symbol Table with its address.
 * - Handle assembler directives (ORG, END, etc.).
 * - Build and return a SymbolTable object for use in PassTwo.
 */
public class PassOne {
    public SymbolTable firstPass(String inputFile) {
        // TODO: Implement reading input and building SymbolTable
        return new SymbolTable();
    }
}