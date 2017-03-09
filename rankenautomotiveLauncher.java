import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class HandsOnTest extends JFrame{
	private routine rout;
	private nonroutine nonrout;
	private JPanel buttonPanel;
	private JButton calc;
	private JButton exit;
	
	public HandsOnTest() {
		super("Ranken's Automotive");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rout = new routine();
		nonrout = new nonroutine();
		buildButtonPanel();
		
		add(rout, BorderLayout.NORTH);
		add(nonrout, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	public void buildButtonPanel() {
		buttonPanel = new JPanel();
		calc = new JButton("Calculate Charges");
		exit = new JButton("Exit");
		calc.addActionListener(new calcButtonListener());
		exit.addActionListener(new exitButtonListener());
		buttonPanel.add(calc);
		buttonPanel.add(exit);
	}
	private class calcButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			DecimalFormat formatter = new DecimalFormat("$###,###.00");
			double total;
			String output;
			total = rout.getRoutineCost() + nonrout.getNonRoutineCost();
			output = "Total Charges: " + formatter.format(total);
			JOptionPane.showMessageDialog(null, output);
		}
	}
	private class exitButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new HandsOnTest();
	}

}
