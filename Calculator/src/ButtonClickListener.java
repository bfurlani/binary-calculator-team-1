import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    String firstBinNum = "";
    JLabel binLabel;
    public ButtonClickListener(JLabel label){
        this.binLabel = label;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.equals("0")) {
            firstBinNum += "0";
            binLabel.setText(firstBinNum);

        }
        else if (command.equals("1")) {
            firstBinNum += "1";
            binLabel.setText(firstBinNum);


        }

        else if (command.equals("+")) {


        }
        else if (command.equals("-")) {


        }
        else if (command.equals("x")) {


        }
        else if (command.equals("÷")) {


        }
        else if (command.equals("x\u00B2")) {


        }
        else if (command.equals("√")) {

        }
        else if (command.equals("=")) {

        }
        else if (command.equals("Switch")) {

        }



    }
}
