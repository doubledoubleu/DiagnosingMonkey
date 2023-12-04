package diagnosingmonkey;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
    
    JFrame board = new JFrame();
    JPanel menu = new JPanel(new FlowLayout());
    JButton gameBtn = new JButton("Game");
    JLabel titleLbl = new JLabel("Diagnosing Monkey");
    
    public Menu() {                
        gameBtn.setFont(new Font("Monospaced", Font.BOLD, 20));
        gameBtn.setFocusable(false);
        gameBtn.addActionListener(this);        
        titleLbl.setFont(new Font("Monospaced", Font.BOLD, 32));
        titleLbl.setFocusable(false);
        menu.add(gameBtn, BorderLayout.CENTER);
        menu.add(titleLbl,BorderLayout.NORTH);
        menu.setBackground(Color.pink);
        menu.setBounds(0,0,585,665);
        board.add(menu);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(585,665);        
        board.setLayout(null);
        board.setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == gameBtn) {
            board.dispose();
            Program game = new Program();            
        }
    }
}
