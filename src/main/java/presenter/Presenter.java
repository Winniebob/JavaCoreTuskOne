package presenter;

import model.Model;
import view.View;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view){
        this.view = view;
        this.model = model;
    }

    public void onOperatorSelected(float a, float b, String operator){
        float res = model.calulate(a,b,operator);
        view.showResult(res);
    }
    public void onError(String message){
        view.showError(message);
    }
    public void onMenuClicked(){
        view.showMenu();
    }
    public void onExitClicked(){
        System.exit(0);
    }
}

