import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//the "implements Actionlistener" may need to be changed, as ActionListener is one method. Not sure. Could have something to do with "this" below.
public class Calculator implements ActionListener {

    private JLabel label;
    JFrame frame;
    JPanel panel;

    public Calculator(){
        frame = new JFrame();

        label = new JLabel("(blank)");

        JButton zeroButton = new JButton("0");
        JButton oneButton = new JButton("1");
        JButton additionButton = new JButton("+");
        JButton subtractionButton = new JButton("-");
        JButton multiplyButton = new JButton("x");
        JButton divideButton = new JButton("÷");
        JButton squareButton = new JButton("x\u00B2");
        JButton squareRootButton = new JButton("√");
        JButton equalsButton = new JButton("=");
        JButton switchButton = new JButton("Switch");

        zeroButton.addActionListener(this);
        oneButton.addActionListener(this);
        additionButton.addActionListener(this);
        subtractionButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        squareButton.addActionListener(this);
        squareRootButton.addActionListener(this);
        equalsButton.addActionListener(this);
        switchButton.addActionListener(this);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(4,3));
        panel.add(label);
        panel.add(zeroButton);
        panel.add(oneButton);
        panel.add(additionButton);
        panel.add(subtractionButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(squareButton);
        panel.add(squareRootButton);
        panel.add(squareRootButton);
        panel.add(equalsButton);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    //This section down here may need to be altered, as all buttons should not go to one method
    @Override
    public void actionPerformed(ActionEvent e){
        label.setText("User input");
    }
}
