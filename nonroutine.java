import java.awt.*;
import javax.swing.*;

public class nonroutine extends JPanel{
	private JLabel parts;
	private JLabel labor;
	
	private JTextField partsText;
	private JTextField laborText;
	
	public nonroutine() {
		setLayout(new GridLayout(2, 2));
		setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
		
		parts = new JLabel("Parts Charges: ");
		labor = new JLabel("Hours of Labor:");
		
		partsText = new JTextField(0);
		laborText = new JTextField(0);
		partsText.setText("0");
		laborText.setText("0");
		add(parts);
		add(partsText);
		add(labor);
		add(laborText);
	}
	
	public double getNonRoutineCost() {
		double partsDouble, laborDouble, laborCost, total;
		partsDouble = Double.parseDouble(partsText.getText());
		laborDouble = Double.parseDouble(laborText.getText());
		laborCost = laborDouble * 20;
		total = laborCost + partsDouble;
		return total;
	}

}
