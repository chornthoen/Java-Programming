package Form3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BistroPizzaBillCalculator extends JFrame {
    private Container ct;
    private JLabel lblNameForm,lblOrder,lblCTMName,lblQty,lblRate,lblAmount,lblCostTopping,lblPizzaType,lblTopping;
    private JTextField txtOrder,txtCTMName,txtQty,txtRate,txtAmount,txtCostTopping;
    private JRadioButton rdoPanPizza,rdoSuffed,rdoRegular;
    private JCheckBox chkOnion,chkCheese,chkTomato,chkBabyCorn;
    private JButton btnGenerateBill,btnClear;
    private JTextArea txtArea;
    private JScrollPane jspDisplay;
    private ButtonGroup bgSize;
    public void initUI(){

        lblNameForm = new JLabel("Bistro Pizza Bill Calculator");
        lblNameForm.setBounds(150,10,200,20);
        ct.add(lblNameForm);

        lblOrder = new JLabel("Order");
        lblOrder.setBounds(10,40,100,20);
        ct.add(lblOrder);

        txtOrder = new JTextField();
        txtOrder.setBounds(120,40,80,20);
        ct.add(txtOrder);

        lblCTMName = new JLabel("Customer Name");
        lblCTMName.setBounds(10,70,100,20);
        ct.add(lblCTMName);

        txtCTMName = new JTextField();
        txtCTMName.setBounds(120,70,80,20);
        ct.add(txtCTMName);

        lblQty = new JLabel("Quantity");
        lblQty.setBounds(10,100,100,20);
        ct.add(lblQty);

        txtQty = new JTextField();
        txtQty.setBounds(120,100,80,20);
        ct.add(txtQty);

        lblRate = new JLabel("Rate");
        lblRate.setBounds(250,40,100,20);
        ct.add(lblRate);

        txtRate = new JTextField();
        txtRate.setBounds(320,40,80,20);
        ct.add(txtRate);

        lblAmount = new JLabel("Amount");
        lblAmount.setBounds(250,70,100,20);
        ct.add(lblAmount);

        txtAmount = new JTextField();
        txtAmount.setBounds(320,70,80,20);
        ct.add(txtAmount);

        lblCostTopping = new JLabel("Cost of Topping");
        lblCostTopping.setBounds(250,100,100,20);
        ct.add(lblCostTopping);

        txtCostTopping = new JTextField();
        txtCostTopping.setBounds(360,100,80,20);
        ct.add(txtCostTopping);
        lblPizzaType = new JLabel("Pizza Type");
        lblPizzaType.setBounds(30,150,100,20);
        ct.add(lblPizzaType);

        rdoPanPizza = new JRadioButton("Pan Pizza");
        rdoPanPizza.setBounds(40,180,100,20);
        ct.add(rdoPanPizza);
        rdoSuffed = new JRadioButton("Stuffed");
        rdoSuffed.setBounds(40,200,100,20);
        ct.add(rdoSuffed);
        rdoRegular = new JRadioButton("Regular");
        rdoRegular.setBounds(40,220,100,20);
        JPanel jp = new JPanel();
        jp.setBounds(30,170,100,100);
        jp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jp.setLayout(new GridLayout(3,1));
        jp.add(rdoPanPizza);
        jp.add(rdoSuffed);
        jp.add(rdoRegular);
        ct.add(jp);
//        ct.add(rdoRegular);
//        bgSize = new ButtonGroup();
//        bgSize.add(rdoPanPizza);
//        bgSize.add(rdoSuffed);
//        bgSize.add(rdoRegular);


    }
    public void initForm(){
        ct = getContentPane();
        ct.setLayout(null);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public BistroPizzaBillCalculator(){
        initForm();
        initUI();
    }

    public static void main(String[] args) {
        new BistroPizzaBillCalculator();
    }
}
