import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class index extends JFrame {
  private int WIDTH = 600;
  private int HEIGHT = 400;
  public index(){

    // Set kích thước và các thông số cho ứng dụng
    this.setTitle("App");
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setSize(WIDTH, HEIGHT);

    // Set các component
    labelCurrency = new JLabel();
    inputCurrency = new JTextField();

    // Label currency
    labelCurrency.setText("Tiền tệ đầu vào");
    labelCurrency.setBounds(20, 20, 100, 30);

    // input currency
    inputCurrency.setBounds(130, 20, 350, 30);

    this.add(labelCurrency);
    this.add(inputCurrency);
  }

  private JLabel labelCurrency;
  private JTextField inputCurrency;
}