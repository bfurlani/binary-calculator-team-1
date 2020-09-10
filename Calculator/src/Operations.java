public class Operations {


    public int doSquareRoot(int num){
        double root = Math.sqrt(num);
        return (int) root;
    }

    public int doSquare(int num){
        int square = num*num;
        return square;
    }

    public int doAddition(int num, int num2){
        int sum = num+num2;
        return sum;
    }

    public int doSubtraction(int num, int num2){
        int difference = num-num2;
        return difference;
    }

    public int doMultiply(int num1, int num2){
        return num1 * num2;
    }

    public int doDivide(int num1, int num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("Divide by 0 Error");
        }
        return num1 / num2;
    }
}
