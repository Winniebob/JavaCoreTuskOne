package view;

import model.Model;
import presenter.Presenter;

import java.util.Scanner;

public class Main implements View{
    private Presenter presenter;
    public Main(){
        Model model = new Model();
        presenter = new Presenter(model,this);
    }
    public static void main (String[] args){
        Main main = new Main();
        main.run();
    }
    public void run() {
        showMenu();
        getUserInput();
    }

    public void showResult(float result) {
        System.out.println("Result: " + result);
        getUserInput();
    }

    public void showError(String message) {
        System.out.println("Error: " + message);
        getUserInput();
    }

    public void showMenu() {
        System.out.println("Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        float a, b;
        String operator;

        switch (choice) {
            case 1:
                operator = "+";
                enterNumbers(operator);
                break;
            case 2:
                operator = "-";
                enterNumbers(operator);
                break;
            case 3:
                operator = "*";
                enterNumbers(operator);
                break;
            case 4:
                operator = "/";
                enterNumbers(operator);
                break;
            case 5:
                presenter.onExitClicked();
                break;
            default:
                presenter.onError("Incorrect choice of operation. Try again.");
        }
    }

    private void enterNumbers(String operator) {
        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();

        System.out.println("Enter second number:");
        float b = scanner.nextFloat();

        presenter.onOperatorSelected(a, b, operator);
    }
}
