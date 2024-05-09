import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crypto extends JFrame {
    private JButton criptaButton;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel Panel;
    private JTextField textField3;

    public Crypto() {
        criptaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String plaintext = textField1.getText();
                String key = textField2.getText();
                if(!plaintext.equals("") && !key.equals("")) {
                    // qua implementa la tua encryption logic
                    textField3.setText("risultato");
                } else {
                    JOptionPane.showMessageDialog(criptaButton, "I campi non possono rimanere vuoti!");
                }
            }
        });
    }

    public static void main(String[] args) {
        Crypto c = new Crypto();
        c.setContentPane(c.Panel);
        c.setTitle("Esempio Swing");
        c.setSize(500, 300);
        c.setVisible(true);
    }
}
