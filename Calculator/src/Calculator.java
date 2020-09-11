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
        GridBagConstraints gbc  = new GridBagConstraints();
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
        panel.setLayout(new GridBagLayout());
        binaryInput.setOpaque(true);
        binaryInput.setPreferredSize(new Dimension(200,25));
        binaryInput.setMaximumSize(new Dimension(500,20));
        binaryInput.setBackground(Color.white);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth  = 6;
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 20, 0);
        gbc.weightx = 1;
        panel.add(binaryInput,gbc);
        panel.add(output);

        //Top Row
        zeroButton.setPreferredSize(new Dimension(75,30));
        panel.add(zeroButton,getConstraints(0,1));
        oneButton.setPreferredSize(new Dimension(75,30));
        panel.add(oneButton,getConstraints(1,1));
        panel.add(switchButton,getConstraints(3,1));
        panel.add(clearButton,getConstraints(2,1));


        //Second Row
        additionButton.setPreferredSize(new Dimension(75,30));
        subtractionButton.setPreferredSize(new Dimension(75,30));
        multiplyButton.setPreferredSize(new Dimension(75,30));
        panel.add(additionButton,getConstraints(0,3));
        panel.add(subtractionButton,getConstraints(1,3));
        panel.add(multiplyButton,getConstraints(2,3));
        //Third Row
        divideButton.setPreferredSize(new Dimension(75,30));
        squareButton.setPreferredSize(new Dimension(75,30));
        squareRootButton.setPreferredSize(new Dimension(75,30));
        panel.add(divideButton,getConstraints(0,5));
        panel.add(squareButton,getConstraints(1,5));
        panel.add(squareRootButton,getConstraints(2,5));
        //Bottom Row
        equalsButton.setPreferredSize(new Dimension(75,30));
        clearButton.setPreferredSize(new Dimension(75,30));
        panel.add(equalsButton,getConstraints(2,7));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Binary Calculator");
        frame.pack();
        frame.setVisible(true);
    }

    private GridBagConstraints getConstraints(int gridX, int gridY){
        GridBagConstraints gbc = new GridBagConstraints();
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth  = 1;
        gbc.gridheight = 2;
        gbc.gridx = gridX;
        gbc.gridy = gridY;
        gbc.insets = new Insets(20, 0, 20, 10);
        gbc.weightx = 1;
        return gbc;
    }


    public JLabel getBinaryInput(){
        return  binaryInput;
    }




}
