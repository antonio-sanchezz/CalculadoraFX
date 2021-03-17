package gui.viewsandcontrollers.calculadora;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalculadoraController {

    @FXML
    private Label label;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;
    
    @FXML
    private TextField resultado;
    
    public void initialize() {
        // TODO
    }

    @FXML
    private void sumarButtonAction(ActionEvent event) throws IOException {

    	double num1Calc = Double.parseDouble(num1.getText());
    	double num2Calc = Double.parseDouble(num2.getText());
    	
    	double result = num1Calc + num2Calc;
    	
    	resultado.setText(result + "");

    }
    
    @FXML
    private void restarButtonAction(ActionEvent event) {
    	
    	double num1Calc = Double.parseDouble(num1.getText());
    	double num2Calc = Double.parseDouble(num2.getText());
    	
    	double result = num1Calc - num2Calc;
    	
    	resultado.setText(result + "");
    	
    }
    
    @FXML
    private void multiplicarButtonAction(ActionEvent event) {
    	
    	double num1Calc = Double.parseDouble(num1.getText());
    	double num2Calc = Double.parseDouble(num2.getText());
    	
    	double result = num1Calc * num2Calc;
    	
    	resultado.setText(result + "");
    	
    }
    
    @FXML
    private void dividirButtonAction(ActionEvent event) {
    	
    	double num1Calc = Double.parseDouble(num1.getText());
    	double num2Calc = Double.parseDouble(num2.getText());
    	
    	double result = num1Calc / num2Calc;
    	
    	resultado.setText(result + "");
    	
    }
}
