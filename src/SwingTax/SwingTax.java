package SwingTax;

//INCOMPLETO DEBIDO A NO EXPLICACION DETALLADA EN CLASE

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SwingTax {
    private JTextPane pricePane;
    private JTextPane IVApane;
    private JTextPane totalPane;
    private JButton ButtonCalculate;
    private JPanel TaxPane;




    public SwingTax() {


    }

    public static void main(String[] args){
        JFrame frame = new JFrame("SwingTaxCalculator");
        frame.setContentPane(new SwingTax().TaxPane);
        frame.setVisible(true);
    }
}

