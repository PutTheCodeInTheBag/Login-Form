package LoginForm;
import javax.swing.*;
import java.awt.*;

public class Login {
    JLabel guide;
    static JFrame frame;
    static JPanel panel;
    static JTextField email;
    static JTextField password;
    JButton submit;
    static JLabel message = new JLabel();

    public Login() {
        email = new JTextField();
        password = new JTextField();
        guide = new JLabel();
        frame = new JFrame("Login");
        panel = new JPanel();
        submit = new JButton("Submit");

        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);

        submit.addActionListener(e -> hello());

        email.setText("Enter Your Email");
        email.setPreferredSize(new Dimension(150, 35));

        password.setText("Enter Your Password");
        password.setPreferredSize(new Dimension(150, 35));

        panel.setLayout(new FlowLayout());
        panel.add(email);
        panel.add(password);
        panel.add(submit);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void hello() {
        frame.remove(panel);
        message.setText("Your email is: "+email.getText()+"." + " And your password is: "+password.getText());
        frame.add(message);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
