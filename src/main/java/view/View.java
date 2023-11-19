package view;

public interface View {
    void showResult(float result);
    void showError(String message);
    void showMenu();
    void getUserInput();
}