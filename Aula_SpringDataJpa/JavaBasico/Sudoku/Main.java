
import gui.SudokuGUI;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SudokuGUI().setVisible(true));
    }
}
