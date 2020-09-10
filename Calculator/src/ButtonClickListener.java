import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

public class ButtonClickListener implements ActionListener {
    Operations operation = new Operations();
    String firstBinNum = "";
    String secondBinNum = "";
    String currentEquation = "";
    String currentOperation = "";
    Boolean operationClicked = false;
    JLabel binLabel;
    public ButtonClickListener(JLabel label){
        this.binLabel = label;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        if (command.equals("0")) {
            if(!operationClicked){
                firstBinNum += "0";
                binLabel.setText(firstBinNum);
            }else{
                secondBinNum += "0";
                binLabel.setText(currentEquation + secondBinNum);
            }

        }
        else if (command.equals("1")) {
            if(!operationClicked){
                firstBinNum += "1";
                binLabel.setText(firstBinNum);
            }else{
                secondBinNum += "1";
                binLabel.setText(currentEquation + secondBinNum);
            }
        }

        else if (command.equals("+")) {
            if(!operationClicked && !firstBinNum.equals("")) {
                currentOperation = "+";
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
            int result = getOperation(currentOperation);
            currentEquation = currentEquation + secondBinNum;
            binLabel.setText(currentEquation + " = "+ result);
        }
        else if (command.equals("Switch")) {

        }
    }

    private int getOperation(String op){
        int firstDecNum = 0;
        int secondDecNum = 0;
        if(!secondBinNum.equals("")) {
            firstDecNum = operation.binaryToDecimal(firstBinNum);
        }
        if(!secondBinNum.equals("")) {
            secondDecNum = operation.binaryToDecimal(secondBinNum);
        }
        if(op.equals("+")){
            return operation.doAddition(firstDecNum,secondDecNum);
        }else{
            return 0;
        }
    }
}
