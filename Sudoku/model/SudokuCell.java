
package model;

import java.util.HashSet;
import java.util.Set;

public class SudokuCell {
    public int value;
    public boolean isFixed;
    public boolean isUserInput;
    public Set<Integer> draftValues = new HashSet<>();

    public SudokuCell() {
        this.value = 0;
        this.isFixed = false;
        this.isUserInput = false;
    }
}
