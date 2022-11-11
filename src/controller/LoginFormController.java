package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public TextField txtPassword;
    public TextField txtUserName;
    public AnchorPane root;

    public void LoginOnAction(ActionEvent actionEvent) throws IOException {
        final String user = "root";
        final String pass = "1234";

        if (txtUserName.getText().equals(user) && txtPassword.getText().equals(pass)){
            Parent parent = FXMLLoader.load(getClass().getResource("../views/DashBord_Form.fxml"));
            Scene subScene = new Scene(parent);
            Stage primaryStage = (Stage) this.root.getScene().getWindow();
            primaryStage.setScene(subScene);
            primaryStage.centerOnScreen();
        }else {
            new Alert(Alert.AlertType.ERROR,"Please Check Your UserName And Password...!").show();
        }
    }
}
