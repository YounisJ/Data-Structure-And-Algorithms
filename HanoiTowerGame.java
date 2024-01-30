import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class HanoiTowerGame extends JFrame {
    private final int numberOfDisks = 3;
    private final Stack<Integer>[] pegs = new Stack[3];
    private final JButton[] pegButtons = new JButton[3];
    private int sourcePeg = -1;

    public HanoiTowerGame() {
        setTitle("Tower of Hanoi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 4));

        for (int i = 0; i < 3; i++) {
            pegs[i] = new Stack<>();
            pegButtons[i] = new JButton("Peg " + (i + 1));
            final int pegIndex = i;
            pegButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pegClicked(pegIndex);
                }
            });
            add(pegButtons[i]);
        }

        for (int i = numberOfDisks; i >= 1; i--) {
            pegs[0].push(i);
        }

        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void pegClicked(int pegIndex) {
        if (sourcePeg == -1) {
            if (!pegs[pegIndex].isEmpty()) {
                sourcePeg = pegIndex;
                pegButtons[sourcePeg].setEnabled(false);
            }
        } else {
            moveDisk(sourcePeg, pegIndex);
            sourcePeg = -1;
            for (int i = 0; i < 3; i++) {
                pegButtons[i].setEnabled(true);
            }
        }
    }

    private void moveDisk(int source, int target) {
        if (!pegs[source].isEmpty() && (pegs[target].isEmpty() || pegs[target].peek() > pegs[source].peek())) {
            int disk = pegs[source].pop();
            pegs[target].push(disk);
            repaint();
            if (pegs[2].size() == numberOfDisks) {
                JOptionPane.showMessageDialog(this, "You won!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid move!");
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < 3; i++) {
            int x = 50 + i * 150;
            int y = 150;
            for (int disk : pegs[i]) {
                int width = disk * 20;
                g.setColor(Color.BLUE);
                g.fillRect(x - width / 2, y, width, 10);
                y -= 15;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HanoiTowerGame());
    }
}
