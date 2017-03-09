import javax.swing.*;
import java.awt.*;

public class routine extends JPanel{
	private JCheckBox oilChange;
	private JCheckBox lubeJob;
	private JCheckBox radiatorFlush;
	private JCheckBox transmissionFlush;
	private JCheckBox inspection;
	private JCheckBox mufflerReplacement;
	private JCheckBox tireRotation;
	
	public final double OIL_CHANGE = 26.0;
	public final double LUBE_JOB = 18.00;
	public final double RADIATOR_FLUSH = 30.0;
	public final double TRANSMISSION_FLUSH =  80.0;
	public final double INSPECTION_COST = 15.00;
	public final double MUFFLER_REPLACEMENT = 100.00;
	public final double TIRE_ROTATION = 20.0;
	
	public routine() {
		setLayout(new GridLayout(7, 1));
		setBorder(BorderFactory.createTitledBorder("Routine Services"));
		
		oilChange = new JCheckBox("Oil Change ($26.00)");
		lubeJob = new JCheckBox("Lube Job($18.00");
		radiatorFlush = new JCheckBox("Radiator Flush($30.00)");
		transmissionFlush = new JCheckBox("Transmissions Flush($80.00)");
		inspection = new JCheckBox("Inspection($15.00)");
		mufflerReplacement = new JCheckBox("Muffler Replacement($100.00)");
		tireRotation = new JCheckBox("Tire Rotation($20.00)");
		
		add(oilChange);
		add(lubeJob);
		add(radiatorFlush);
		add(transmissionFlush);
		add(inspection);
		add(mufflerReplacement);
		add(tireRotation);
	}
	
	public double getRoutineCost() {
		double total = 0;
		if (oilChange.isSelected()){
			total += OIL_CHANGE;
		}
		if (lubeJob.isSelected()){
			total += LUBE_JOB;
		}
		if (radiatorFlush.isSelected()) {
			total += RADIATOR_FLUSH;
		}
		if (transmissionFlush.isSelected()) {
			total += TRANSMISSION_FLUSH;
		}
		if (inspection.isSelected()) {
			total += INSPECTION_COST;
		}
		if (mufflerReplacement.isSelected()) {
			total += MUFFLER_REPLACEMENT;
		}
		if (tireRotation.isSelected()) {
			total += TIRE_ROTATION;
		}
		return total;
	}

}
