import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        setTitle("Automated Teller Machine");
        setSize(800,400);
        setVisible(true);
        setLocation(350,200);
        getContentPane().setBackground(Color.black);
    }
    public static void main(String[] args) {
        new Login() ;
    }
}
