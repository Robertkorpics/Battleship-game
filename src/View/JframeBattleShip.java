/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author robertkorpics
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;

public class JframeBattleShip {
    
        JFrame jframe = new JFrame();
        JPanel jPanel = new JPanel(new GridLayout(10, 10));

        public JframeBattleShip(){
            
        for(int k = 1; k <= 100; k++) {
            JButton btn = new JButton("💣");
            btn.setSelected(false);
            btn.addActionListener(l -> {
                btn.setBackground(Color.decode("#ff6347"));
                btn.setText("🔥");
                btn.setEnabled(false);
            });
            jPanel.add(btn);
        }

        jframe.setSize(500, 500);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
}