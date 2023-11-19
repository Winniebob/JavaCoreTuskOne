package model;

public class Model {
    public float calulate(float a, float b, String operation) {
        float res = 0;

        switch (operation) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
        }
        return res;
    }
}
