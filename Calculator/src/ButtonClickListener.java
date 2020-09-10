import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    String firstBinNum = "";
    String secondBinNum = "";
    String currentEquation = "";
    Boolean operationClicked = false;
    JLabel binLabel;
    public ButtonClickListener(JLabel label){
        this.binLabel = label;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.equals("0")) {
            if(operationClicked == false){
                firstBinNum += "0";
                binLabel.setText(firstBinNum);
            }else{
                secondBinNum += "0";
                binLabel.setText(currentEquation + secondBinNum);
            }

        }
        else if (command.equals("1")) {
            if(operationClicked == false){
                firstBinNum += "1";
                binLabel.setText(firstBinNum);
            }else{
                secondBinNum += "1";
                binLabel.setText(currentEquation + secondBinNum);
            }
        }

        else if (command.equals("+")) {
            if(operationClicked == false && !firstBinNum.equals("")) {
                operationClicked = true;
                currentEquation = firstBinNum + " + ";
                binLabel.setText(currentEquation);
            }

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
