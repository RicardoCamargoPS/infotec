package com.infotec.view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Login extends JFrame {


    public Login(){

		setSize(400,300);
		setVisible(true);
        JLabel lblNewLabel = new JLabel("New label");
		
		JTextPane textPane = new JTextPane();
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
		JTextPane textPane_1 = new JTextPane();
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(144)
					.addComponent(lblNewLabel)
					.addContainerGap(144, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(144)
					.addComponent(lblNewLabel_1)
					.addContainerGap(144, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
						.addComponent(textPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
					.addGap(14))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(btnNewButton)
					.addGap(37)
					.addComponent(btnNewButton_1)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addComponent(lblNewLabel)
					.addGap(11)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(40))
		);
		setLayout(groupLayout);
		revalidate();

	
    }

}
