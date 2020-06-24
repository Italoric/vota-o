package source;

import javax.swing.JFrame;
import view.tablemodel;

public class princ {
    public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tablemodel t1 = new tablemodel(null);
                t1.setLocationRelativeTo(null);
                t1.setVisible(true);
                //t1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }
}
