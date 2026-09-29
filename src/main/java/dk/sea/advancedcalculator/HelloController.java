package dk.sea.advancedcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtDisplay;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnAllClear;

    @FXML
    private Button btnPercent;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnEqual;

    @FXML
    private Button btnPlusMinus;

    @FXML
    private Button btnComma;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    private int NumberOne;
    private int NumberTwo;
    private String Operrator;

    public void OnbtnDeleteClicked(ActionEvent actionEvent) {
    }

    public void OnbtnAllClearClicked(ActionEvent actionEvent) {txtDisplay.setText("");
    }

    public void OnbtnPercentClicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "%");
    }

    public void OnbtnDivideClicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "/");
    }

    public void Onbtn7Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "7");
    }

    public void Onbtn8Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "8");
    }

    public void Onbtn9Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "9");
    }

    public void OnbtnMultiplyClicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "X");
    }

    public void Onbtn4Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "4");
    }

    public void Onbtn5Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "5");
    }

    public void Onbtn6Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "6");
    }

    public void OnbtnMinusClicked(ActionEvent actionEvent) {

        txtDisplay.setText(txtDisplay.getText() + "-");
    }

    public void Onbtn1Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "1");
    }

    public void Onbtn2Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "2");
    }

    public void Onbtn3Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "3");
    }

    public void OnbtnPlusClicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "+");
    }

    public void OnbtnPlusMinusClicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "-");
    }

    public void Onbtn0Clicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + "0");
    }

    public void OnbtnCommaClicked(ActionEvent actionEvent) {txtDisplay.setText(txtDisplay.getText() + ",");
    }

    public void OnbtnEqualClicked(ActionEvent actionEvent) {
    }
}
