package swing.btn.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;

import swing.JFrame.DiceEnum;

public class DiceAcction implements ActionListener {
	JLabel jLabel;
	ArrayList<DiceEnum> da = new ArrayList<>();
	public DiceAcction(JLabel jLabel) {
		this.jLabel = jLabel;
		for (DiceEnum d : DiceEnum.values()) {
			da.add(d);
		}
		Collections.shuffle(da);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jLabel.setIcon(da.get(0).getImageicon());
	}

}
