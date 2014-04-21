import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KeepAway extends JFrame {

	private JPanel contentPane;
	public static int numberOfSquares;
	private JTextField move;
	public boolean win;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// int numberOfSquares;
					int choice = JOptionPane.showConfirmDialog(null,
							"Do you want 5 Squares, no means you want 6 ");
					if (choice == JOptionPane.YES_OPTION) {
						numberOfSquares = 5;
					} else {
						numberOfSquares = 6;
					}
					KeepAway frame = new KeepAway();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeepAway() {
		final gamePanel board = new gamePanel(numberOfSquares);
		final computer cpu = new computer(numberOfSquares, board);
		win = false;
		setTitle("Keep Away");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.paintComponents(getGraphics());
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		Label label = new Label("1");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);

		final Label spot1 = new Label("");
		spot1.setBackground(Color.WHITE);
		GridBagConstraints gbc_spot1 = new GridBagConstraints();
		gbc_spot1.insets = new Insets(0, 0, 5, 5);
		gbc_spot1.gridx = 2;
		gbc_spot1.gridy = 0;
		panel.add(spot1, gbc_spot1);

		Label label_1 = new Label("2");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 1;
		panel.add(label_1, gbc_label_1);

		final Label spot2 = new Label("");
		spot2.setBackground(Color.WHITE);
		GridBagConstraints gbc_spot2 = new GridBagConstraints();
		gbc_spot2.insets = new Insets(0, 0, 5, 5);
		gbc_spot2.gridx = 2;
		gbc_spot2.gridy = 1;
		panel.add(spot2, gbc_spot2);

		Label label_2 = new Label("3");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 2;
		panel.add(label_2, gbc_label_2);

		final Label spot3 = new Label("");
		spot3.setBackground(Color.WHITE);
		GridBagConstraints gbc_spot3 = new GridBagConstraints();
		gbc_spot3.insets = new Insets(0, 0, 5, 5);
		gbc_spot3.gridx = 2;
		gbc_spot3.gridy = 2;
		panel.add(spot3, gbc_spot3);

		Label label_3 = new Label("4");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 3;
		panel.add(label_3, gbc_label_3);

		final Label spot4 = new Label("");
		spot4.setBackground(Color.WHITE);
		GridBagConstraints gbc_spot4 = new GridBagConstraints();
		gbc_spot4.insets = new Insets(0, 0, 5, 5);
		gbc_spot4.gridx = 2;
		gbc_spot4.gridy = 3;
		panel.add(spot4, gbc_spot4);

		final Label valid = new Label(
				"                                                                                     ");
		GridBagConstraints gbc_valid = new GridBagConstraints();
		gbc_valid.insets = new Insets(0, 0, 5, 0);
		gbc_valid.gridx = 3;
		gbc_valid.gridy = 3;
		panel.add(valid, gbc_valid);

		Label label_4 = new Label("5");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 4;
		panel.add(label_4, gbc_label_4);

		final Label spot5 = new Label("");
		spot5.setBackground(Color.WHITE);
		GridBagConstraints gbc_spot5 = new GridBagConstraints();
		gbc_spot5.insets = new Insets(0, 0, 5, 5);
		gbc_spot5.gridx = 2;
		gbc_spot5.gridy = 4;
		panel.add(spot5, gbc_spot5);

		Label label_5 = new Label("6");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 5;
		panel.add(label_5, gbc_label_5);

		final Label spot6 = new Label("");
		spot6.setBackground(Color.WHITE);
		GridBagConstraints gbc_spot6 = new GridBagConstraints();
		gbc_spot6.insets = new Insets(0, 0, 5, 5);
		gbc_spot6.gridx = 2;
		gbc_spot6.gridy = 5;
		panel.add(spot6, gbc_spot6);

		JLabel enterMove = new JLabel("Enter Move");
		GridBagConstraints gbc_enterMove = new GridBagConstraints();
		gbc_enterMove.insets = new Insets(0, 0, 5, 5);
		gbc_enterMove.gridx = 1;
		gbc_enterMove.gridy = 6;
		panel.add(enterMove, gbc_enterMove);

		move = new JTextField();
		GridBagConstraints gbc_move = new GridBagConstraints();
		gbc_move.insets = new Insets(0, 0, 5, 0);
		gbc_move.fill = GridBagConstraints.HORIZONTAL;
		gbc_move.gridx = 3;
		gbc_move.gridy = 6;
		panel.add(move, gbc_move);
		move.setColumns(10);

		final Label gameover = new Label(
				"                                                                        ");
		GridBagConstraints gbc_gameover = new GridBagConstraints();
		gbc_gameover.gridwidth = 3;
		gbc_gameover.insets = new Insets(0, 0, 0, 5);
		gbc_gameover.gridx = 1;
		gbc_gameover.gridy = 8;
		panel.add(gameover, gbc_gameover);

		Button submitMove = new Button("Submit Move");
		submitMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// gets the correct move number from the text box
				int newmove = parseInt(move.getText());
				// checks to see if your move is valid
				if (board.isValidMove(newmove)) {
					board.placeMove(newmove, 1);
					// updates the board
					spot1.setText(board.game[0]);
					spot2.setText(board.game[1]);
					spot3.setText(board.game[2]);
					spot4.setText(board.game[3]);
					spot5.setText(board.game[4]);
					if (numberOfSquares == 6) {
						spot6.setText(board.game[5]);
					}
					// computers move, first check to see what has peen played
					// then move
					cpu.updateBoard(board);
					int compmove = cpu.move();
					if (board.isValidMove(compmove)) {
						board.placeMove(compmove, 2);
						// updates the board
						spot1.setText(board.game[0]);
						spot2.setText(board.game[1]);
						spot3.setText(board.game[2]);
						spot4.setText(board.game[3]);
						spot5.setText(board.game[4]);
						if (numberOfSquares == 6) {
							spot6.setText(board.game[5]);
						}
					} else {
						// if the computer doesn't have a move then you win
						win = true;
					}
					valid.setText("");
				} else {
					// lets you know that your move was invlaid
					valid.setText("Invalid Move.");
				}
				if (board.gameOver()) {
					if (win) {
						gameover.setText("You Won!!! Exit and Try again");
					} else {
						gameover.setText("You lost, Exit and Try again");
					}
				}
				// clears the move text box
				move.setText("");
			}
		});
		GridBagConstraints gbc_submitMove = new GridBagConstraints();
		gbc_submitMove.insets = new Insets(0, 0, 5, 0);
		gbc_submitMove.gridx = 3;
		gbc_submitMove.gridy = 7;
		panel.add(submitMove, gbc_submitMove);

	}

	/*
	 * this function takes in the move string and outputs a valid move number.
	 * The moves are one less than the number to account for an Array starts at
	 * element 0. 9 was just an arbitrarily chosen number that is out of the
	 * range.
	 */
	public int parseInt(String move) {
		if (move.equals("1")) {
			return 0;
		} else if (move.equals("2")) {
			return 1;
		} else if (move.equals("3")) {
			return 2;
		} else if (move.equals("4")) {
			return 3;
		} else if (move.equals("5")) {
			return 4;
		} else if (move.equals("6")) {
			return 5;
		} else {
			return 9;
		}

	}
}
