import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    Operations operation = new Operations();
    String firstBinNum = "";
    String secondBinNum = "";
    String currentEquation = "";
    String currentOperation = "";
    Boolean equalClicked = false;
    int result = 0;
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
            startOperation("+");

        }
        else if (command.equals("-")) {
            startOperation("-");


        }
        else if (command.equals("x")) {


        }
        else if (command.equals("÷")) {
            startOperation("÷");


        }
        else if (command.equals("x\u00B2")) {


        }
        else if (command.equals("√")) {

        }
        else if (command.equals("=")) {
            if(!equalClicked) {
                result = getOperation(currentOperation);
                currentEquation = currentEquation + secondBinNum;
                if (!binLabel.getText().equals("Operation Error")) {
                    binLabel.setText(currentEquation + " = " + operation.decimalToBinary(result));
                }
                equalClicked = true;
            }
            //TODO: should set operationClicked to false?
        }
        else if (command.equals("Switch")) {

        }
        else if (command.equals("Clear")) {
            firstBinNum = "";
            secondBinNum = "";
            currentEquation = "";
            currentOperation = "";
            result = 0;
            binLabel.setText("");
            operationClicked = false;
            equalClicked = false;
        }
    }

    private void startOperation(String operationString){
        if(!operationClicked && !firstBinNum.equals("")) {
            currentOperation = operationString;
            operationClicked = true;
            currentEquation = firstBinNum + " "+operationString+" ";
            binLabel.setText(currentEquation);
        }
    }

    private int getOperation(String op){
        int firstDecNum = 0;
        int secondDecNum = 0;
        if(!firstBinNum.equals("")) {
            firstDecNum = operation.binaryToDecimal(firstBinNum);
        }
        if(!secondBinNum.equals("")) {
            secondDecNum = operation.binaryToDecimal(secondBinNum);
        }
        if(op.equals("+")){
            return operation.doAddition(firstDecNum,secondDecNum);
        }else if(op.equals("-")){
            return operation.doSubtraction(firstDecNum,secondDecNum);
        }else if(op.equals("÷")) {
            try {
                return operation.doDivide(firstDecNum, secondDecNum);
                }catch(IllegalArgumentException e){
                binLabel.setText("Operation Error");
                return 0;
            }
        }else{
            return firstDecNum;
        }
    }
}
