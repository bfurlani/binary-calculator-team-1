import javax.swing.*;
import java.awt.*;


public class Calculator extends JFrame {

    private JLabel binaryInput;
    private JLabel output;
    private JButton zeroButton;
    private JButton oneButton;
    private JButton additionButton;
    private JButton subtractionButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton squareButton;
    private JButton squareRootButton;
    private JButton equalsButton;
    private JButton switchButton;
    private JButton clearButton;

    JFrame frame;
    JPanel panel;

    public Calculator(){
        frame = new JFrame();

        binaryInput = new JLabel();
        output = new JLabel();

        zeroButton = new JButton("0");
        oneButton = new JButton("1");
        additionButton = new JButton("+");
        subtractionButton = new JButton("-");
        multiplyButton = new JButton("x");
        divideButton = new JButton("÷");
        squareButton = new JButton("x\u00B2");
        squareRootButton = new JButton("√");
        equalsButton = new JButton("=");
        switchButton = new JButton("Bin/Dec");
        clearButton = new JButton("Clear");


        ButtonClickListener buttonClickListener = new ButtonClickListener(binaryInput);
        zeroButton.addActionListener(buttonClickListener);
        oneButton.addActionListener(buttonClickListener);
        additionButton.addActionListener(buttonClickListener);
        subtractionButton.addActionListener(buttonClickListener);
        multiplyButton.addActionListener(buttonClickListener);
        divideButton.addActionListener(buttonClickListener);
        squareButton.addActionListener(buttonClickListener);
        squareRootButton.addActionListener(buttonClickListener);
        equalsButton.addActionListener(buttonClickListener);
        switchButton.addActionListener(buttonClickListener);
        clearButton.addActionListener(buttonClickListener);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(4,3));

        panel.add(binaryInput);
        panel.add(output);
        panel.add(zeroButton);
        panel.add(oneButton);
        panel.add(additionButton);
        panel.add(subtractionButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(squareButton);
        panel.add(squareRootButton);
        panel.add(squareRootButton);
        panel.add(switchButton);
        panel.add(equalsButton);
        panel.add(clearButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Binary Calculator");
        frame.pack();
        frame.setVisible(true);
    }



    public JLabel getBinaryInput(){
        return  binaryInput;
    }




}
