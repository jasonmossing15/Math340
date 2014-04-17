import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogicCalculator extends JFrame {

	private JPanel contentPane;
	private JComboBox TF1;
	private JComboBox LogicVariable1;
	private JComboBox TF2;
	private JLabel lblProposition;
	private JComboBox LogicVariable2;
	private JComboBox TF3;
	private JLabel lblProposition_1;
	private JLabel lblTf;
	private JButton btnNewButton;
	private JLabel lblYourPropositionIs;
	private JTextField answer;
	private String TF1_String;
	private String TF2_String;
	private String TF3_String;
	private String LV1;
	private String LV2;
	private String answer_str;
	private JLabel lblNewLabel_1;
	private JComboBox not1;
	private JComboBox not2;
	private JComboBox not3;
	private JComboBox not4;
	private JComboBox not5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogicCalculator frame = new LogicCalculator();
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
	public LogicCalculator() {
		setResizable(false);
		setTitle("Proposition Logic Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane
				.setLayout(new FormLayout(new ColumnSpec[] {
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("max(23dlu;default):grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("max(46dlu;default):grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("max(96dlu;default):grow"), },
						new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC,
								FormFactory.RELATED_GAP_ROWSPEC,
								FormFactory.DEFAULT_ROWSPEC, }));

		lblNewLabel_1 = new JLabel("\u00AC ?");
		contentPane.add(lblNewLabel_1, "2, 2");

		lblTf = new JLabel("T/F ?");
		contentPane.add(lblTf, "4, 2, center, default");

		not1 = new JComboBox();
		not1.setModel(new DefaultComboBoxModel(new String[] { "", "\u00AC" }));
		contentPane.add(not1, "2, 4, fill, default");

		TF1 = new JComboBox();
		TF1.setModel(new DefaultComboBoxModel(new String[] { "", "T", "F" }));
		contentPane.add(TF1, "4, 4, fill, default");

		JLabel lblNewLabel = new JLabel("Proposition 1");
		contentPane.add(lblNewLabel, "6, 4, center, default");

		not2 = new JComboBox();
		not2.setModel(new DefaultComboBoxModel(new String[] { "", "\u00AC" }));
		contentPane.add(not2, "2, 6, fill, default");

		LogicVariable1 = new JComboBox();
		LogicVariable1.setModel(new DefaultComboBoxModel(new String[] { "",
				"\u2227", "\u2228", "\u2295" }));
		contentPane.add(LogicVariable1, "6, 6, fill, default");

		not3 = new JComboBox();
		not3.setModel(new DefaultComboBoxModel(new String[] { "", "\u00AC" }));
		contentPane.add(not3, "2, 8, fill, default");

		TF2 = new JComboBox();
		TF2.setModel(new DefaultComboBoxModel(new String[] { "", "T", "F" }));
		contentPane.add(TF2, "4, 8, fill, default");

		lblProposition = new JLabel("Proposition 2");
		contentPane.add(lblProposition, "6, 8, center, default");

		not4 = new JComboBox();
		not4.setModel(new DefaultComboBoxModel(new String[] { "", "\u00AC" }));
		contentPane.add(not4, "2, 10, fill, default");

		LogicVariable2 = new JComboBox();
		LogicVariable2.setModel(new DefaultComboBoxModel(new String[] { "",
				"\u2227", "\u2228", "\u2295" }));
		contentPane.add(LogicVariable2, "6, 10, fill, default");

		not5 = new JComboBox();
		not5.setModel(new DefaultComboBoxModel(new String[] { "", "\u00AC" }));
		contentPane.add(not5, "2, 12, fill, default");

		TF3 = new JComboBox();
		TF3.setModel(new DefaultComboBoxModel(new String[] { "", "T", "F" }));
		contentPane.add(TF3, "4, 12, fill, default");

		lblProposition_1 = new JLabel("Proposition 3");
		contentPane.add(lblProposition_1, "6, 12, center, default");

		btnNewButton = new JButton("Calculate!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TF1_String = TF1.getSelectedItem().toString();
				TF2_String = TF2.getSelectedItem().toString();
				TF3_String = TF3.getSelectedItem().toString();
				LV1 = LogicVariable1.getSelectedItem().toString();
				LV2 = LogicVariable2.getSelectedItem().toString();

				// Determines how many propositions there are and calls the
				// proper logic function
				if (TF1_String != "") {
					if (TF2_String != "") {
						if (TF3_String != "") {
							answer_str = threeIn(TF1_String, TF2_String,
									TF3_String, LV1, LV2);
						} else {
							answer_str = twoIn(TF1_String, TF2_String, LV1);
						}
					} else {
						answer_str = oneIn(TF1_String, 1);
					}
				} else {
					answer_str = "";
				}
				answer.setText(answer_str);
			}
		});
		contentPane.add(btnNewButton, "4, 16, 4, 1");

		lblYourPropositionIs = new JLabel("Your Proposition is...");
		contentPane.add(lblYourPropositionIs, "4, 20, 3, 1, center, default");

		answer = new JTextField();
		answer.setEditable(false);
		contentPane.add(answer, "8, 20, fill, default");
		answer.setColumns(10);
	}

	protected String oneIn(String tF1_String, int not) {
		// TODO Auto-generated method stub
		String notstring = "";
		// decides which not is being looked at
		if (not == 1) {
			notstring = not1.getSelectedItem().toString();
		} else if (not == 2) {
			notstring = not2.getSelectedItem().toString();
		} else if (not == 3) {
			notstring = not3.getSelectedItem().toString();
		} else if (not == 4) {
			notstring = not4.getSelectedItem().toString();
		} else {
			notstring = not5.getSelectedItem().toString();
		}

		// figures the correct logic value of the proposition
		if (notstring == "") {
			if (tF1_String == "T" || tF1_String == "True") {
				return "True";
			} else {
				return "False";
			}
		} else {
			if (tF1_String == "T" || tF1_String == "True") {
				return "False";
			} else {
				return "True";
			}
		}

	}

	protected String twoIn(String tF1_String, String tF2_String, String lV1) {
		String answer = "";
		tF1_String = oneIn(tF1_String, 1);
		tF2_String = oneIn(tF2_String, 3);
		// and
		if (lV1 == "\u2227") {
			if (tF1_String == "True" && tF2_String == "True") {
				answer = "True";
			} else {
				answer = "False";
			}
		}
		// or
		else if (lV1 == "\u2228") {
			if (tF1_String == "True" || tF2_String == "True") {
				answer = "True";
			} else {
				answer = "False";
			}
		}
		// xor
		else if (lV1 == "\u2295") {
			if ((tF1_String == "True" && tF2_String == "False")
					|| (tF1_String == "False" && tF2_String == "True")) {
				answer = "True";
			} else {
				answer = "False";
			}
		} else {
			answer = "Enter in the first logic variable please.";
		}
		// flips the result if the logic variable is not'd
		if (lV1 != "") {
			answer = oneIn(answer, 2);
		}
		return answer;
	}

	protected String threeIn(String tF1_String, String tF2_String,
			String tF3_String, String lV1, String lV2) {
		String answer1 = twoIn(tF1_String, tF2_String, lV1);
		String answer = "";
		tF3_String = oneIn(tF3_String, 5);

		// deals if there is no logic variable 1
		if (lV1 == "") {
			answer = answer1;
		} else {
			// and
			if (lV2 == "\u2227") {
				if (answer1 == "True" && tF3_String == "True") {
					answer = "True";
				} else {
					answer = "False";
				}
			}
			// or
			else if (lV2 == "\u2228") {
				if (answer1 == "True" || tF3_String == "True") {
					answer = "True";
				} else {
					answer = "False";
				}
			}
			// xor
			else if (lV2 == "\u2295") {
				if ((answer1 == "True" && tF3_String == "False")
						|| (answer1 == "False" && tF3_String == "True")) {
					answer = "True";
				} else {
					answer = "False";
				}
			} else {
				answer = "Enter in the second logic variable please.";
			}
		}
		// flips result if the logic variable is not'd
		if (lV2 != "") {
			answer = oneIn(answer, 4);
		}

		return answer;
	}

}
