
package gui;

import model.SudokuBoard;
import model.SudokuCell;

import javax.swing.*;
import java.awt.*;

public class SudokuGUI extends JFrame {
    private SudokuBoard board = new SudokuBoard();
    private JTextField[][] cells = new JTextField[9][9];

    public SudokuGUI() {
        setTitle("Sudoku Game");
        setSize(600, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(9, 9));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j] = new JTextField();
                cells[i][j].setHorizontalAlignment(JTextField.CENTER);
                cells[i][j].setFont(new Font("Arial", Font.BOLD, 20));
                gridPanel.add(cells[i][j]);
            }
        }

        JPanel buttonPanel = new JPanel();
        JButton startBtn = new JButton("1 - Novo Jogo");
        JButton insertBtn = new JButton("2 - Inserir Número");
        JButton removeBtn = new JButton("3 - Remover Número");
        JButton clearBtn = new JButton("6 - Limpar Jogo");
        JButton statusBtn = new JButton("5 - Verificar Status");
        JButton finishBtn = new JButton("7 - Finalizar Jogo");
        JButton draftBtn = new JButton("R - Inserir Rascunho");

        startBtn.addActionListener(e -> startNewGame());
        insertBtn.addActionListener(e -> insertNumber());
        removeBtn.addActionListener(e -> removeNumber());
        clearBtn.addActionListener(e -> clearBoard());
        statusBtn.addActionListener(e -> checkStatus());
        finishBtn.addActionListener(e -> finishGame());
        draftBtn.addActionListener(e -> insertDraft());

        buttonPanel.add(startBtn);
        buttonPanel.add(insertBtn);
        buttonPanel.add(removeBtn);
        buttonPanel.add(clearBtn);
        buttonPanel.add(statusBtn);
        buttonPanel.add(finishBtn);
        buttonPanel.add(draftBtn);

        add(gridPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void startNewGame() {
        board = new SudokuBoard();
        refreshBoard();
    }

    private void insertNumber() {
        String input = JOptionPane.showInputDialog("Informe: linha,coluna,numero (ex: 0,1,5)");
        if (input == null) return;
        String[] parts = input.split(",");
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);
        int num = Integer.parseInt(parts[2]);
        board.insertNumber(row, col, num);
        refreshBoard();
    }

    private void insertDraft() {
        String input = JOptionPane.showInputDialog("Rascunho: linha,coluna,numero (ex: 0,1,5)");
        if (input == null) return;
        String[] parts = input.split(",");
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);
        int num = Integer.parseInt(parts[2]);
        board.insertDraft(row, col, num);
        refreshBoard();
    }

    private void removeNumber() {
        String input = JOptionPane.showInputDialog("Informe: linha,coluna (ex: 0,1)");
        if (input == null) return;
        String[] parts = input.split(",");
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);
        board.removeNumber(row, col);
        refreshBoard();
    }

    private void clearBoard() {
        board.clearUserInputs();
        refreshBoard();
    }

    private void checkStatus() {
        boolean valid = true;
        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!board.isValidMove(i, j, board.board[i][j].value)) {
                    valid = false;
                    break outer;
                }
            }
        }
        String message = valid ? "Status: Tabuleiro válido até agora." : "Status: Há erros no tabuleiro.";
        JOptionPane.showMessageDialog(this, message);
    }

    private void finishGame() {
        if (board.isComplete()) {
            JOptionPane.showMessageDialog(this, "Parabéns! Você completou o Sudoku corretamente!");
        } else {
            JOptionPane.showMessageDialog(this, "O jogo não está completo ou possui erros.");
        }
    }

    private void refreshBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                SudokuCell cell = board.board[i][j];
                if (cell.value != 0) {
                    cells[i][j].setText(String.valueOf(cell.value));
                } else if (!cell.draftValues.isEmpty()) {
                    cells[i][j].setText(cell.draftValues.toString());
                } else {
                    cells[i][j].setText("");
                }
            }
        }
    }
}
