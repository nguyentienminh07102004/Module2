import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

public class controller implements ActionListener{
  private JTextField inputCurrency;
  private JLabel resultCurrency;

  public controller(JTextField inputCurrency, JLabel resultCurrency){
    this.inputCurrency = inputCurrency;
    this.resultCurrency = resultCurrency;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String input = this.inputCurrency.getText();
    try{
      double inputCurren = Double.parseDouble(input);
      double res = inputCurren * 23000;
      this.resultCurrency.setText("Kết quả là: " + res + "VND");
    }catch(Exception ex){
      this.resultCurrency.setText("Giá trị đầu vào không hợp lệ");
    }
  }
  
}
