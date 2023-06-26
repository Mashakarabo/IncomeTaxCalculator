import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TaxCalculator extends JFrame implements ActionListener {

    JButton k;
    JTextField b;
    JLabel b3, b1, b2, b4;

TaxCalculator(){

        

    b2 = new JLabel("EMPLOYEE PERSONAL INCOME TAX CALCULATOR");
    b2.setBounds(80,20,800,40);
    add(b2);

    b1 =new JLabel("Annual income");
    b1.setBounds(80,80,180,40);
    add(b1);

    b = new JTextField();
    b.setBounds(80,160,400,60);
    add(b);

    b3 = new JLabel("Your Income Tax is");
    b3.setBounds(80,300,400,40);
    add(b3);

    b4 = new JLabel("Your Monthly Income Tax is");
    b4.setBounds(80,320,400,40);
    add(b4);
        
    k = new JButton("CALCULATE");
    k.setBounds(80,240,400,40);
    add(k);

    k.addActionListener(this);
    setLayout(null);
    setSize(1200, 800);
    setVisible(true);
    
    }

public void actionPerformed(ActionEvent e) {

    int a = Integer.parseInt(b.getText());

    

if(a >= 1 || a <= 237100){

    Double incometax = a*0.18;
    b3.setText(String.valueOf(incometax));
    double monthlyIncomeTax = incometax / 12;
    b4.setText(String.valueOf(monthlyIncomeTax));


}else

if(a >= 237101 || a <= 370500){
    double incometax = 42678+0.26*(a - 237100);
    b3.setText(String.valueOf(incometax));
    double monthlyIncomeTax = incometax / 12;
    b4.setText(String.valueOf(monthlyIncomeTax));

}else
 
if(a >= 370501 || a <= 512800 ){
    double incometax = 77362+0.26*(a - 370500);
    b3.setText(String.valueOf(incometax));
    double monthlyIncomeTax = incometax / 12;
    b4.setText(String.valueOf(monthlyIncomeTax));

}else

if(a >= 512801 || a <= 673000){
    double incometax = 121475+0.26*(a - 512800);
    b3.setText(String.valueOf(incometax));
    double monthlyIncomeTax = incometax / 12;
    b4.setText(String.valueOf(monthlyIncomeTax));

}else

if(a >= 673001 || a <= 857900){
    double incometax = 179147+0.26*(a - 673000);
     b3.setText(String.valueOf(incometax));
     double monthlyIncomeTax = incometax / 12;
    b4.setText(String.valueOf(monthlyIncomeTax));

}else

if(a >= 857901 || a <= 1817000){
    double incometax = 251258+0.26*(a - 857900);
    b3.setText(String.valueOf(incometax));
    double monthlyIncomeTax = incometax / 12;
    b4.setText(String.valueOf(monthlyIncomeTax));

}else

if(a >= 1817001){
    double incometax = 644489+0.26*(a - 1817000);
    System.out.println("Your income tax is : " + incometax);
    double monthlyIncomeTax = incometax / 12;
    b4.setText(String.valueOf(monthlyIncomeTax));

}
    }

public static void main(String args[]){
    TaxCalculator S = new TaxCalculator();
    }
}



