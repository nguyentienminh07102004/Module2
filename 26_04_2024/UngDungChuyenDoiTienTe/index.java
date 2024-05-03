import javax.swing.JButton;
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

    exchangeCurrency = new JLabel();

    resultCurrency = new JLabel();

    exchange = new JButton();

    // Label currency
    labelCurrency.setText("Tiền tệ đầu vào");
    labelCurrency.setBounds(20, 20, 100, 30);

    // input currency
    inputCurrency.setBounds(130, 20, 350, 30);

    // exchange Currency
    exchangeCurrency.setText("Tỷ giá hiện tại là 23000 VND/USD");
    exchangeCurrency.setBounds(20, 60, 480, 30);

    // result Currency
    resultCurrency.setText("Kết quả chuyển đổi tiền tệ là: 0 USD");
    resultCurrency.setBounds(20, 100, 480, 30);

    // exchange Button
    exchange.setText("Exchange");
    exchange.setBounds(250, 150, 100, 30);
    exchange.addActionListener(new controller(inputCurrency, resultCurrency));

    this.add(labelCurrency);
    this.add(inputCurrency);
    this.add(exchangeCurrency);
    this.add(resultCurrency);
    this.add(exchange);
  }

  private JLabel labelCurrency;
  private JTextField inputCurrency;
  private JLabel exchangeCurrency;
  private JLabel resultCurrency;
  private JButton exchange;
}