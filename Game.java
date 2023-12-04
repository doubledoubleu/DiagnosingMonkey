package diagnosingmonkey;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Game extends JFrame {

    public Game() {
        
        initUI();
    }
    
    private void initUI() {
        
        //add(new Board());
        Program game = new Program();   
        game.setBackground(Color.white);
        add(game);
        setTitle("Diagnosing Monkey");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(585, 665);        
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Game game = new Game();
            game.setVisible(true);
        });
    }
}