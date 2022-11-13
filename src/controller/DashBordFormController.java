package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBordFormController {
    public Label lblTital;

    public void FirstPucMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("Hello");
    }

    public void FirstPucMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("Chesse Your Option");
    }

    public void SecondPicMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("Hello");
    }

    public void SecondPicMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("Chesse Your Option");
    }

    public void ThiredPicMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("Hello");
    }

    public void ThiredPicMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("Chesse Your Option");
    }

    public void UserImageMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("User Settings");
    }

    public void UserImageMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("Chesse Your Option");
    }

    public void LogOutImageMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("LogOut");
    }

    public void LogOutImageMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("Chesse Your Option");
    }

    public void SettingsImageMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("General Settings");
    }

    public void SettingsImageMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("Chesse Your Option");
    }

    private void PageLoader(String location) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../views/DashBord_Form.fxml"));
        Scene subScene = new Scene(parent);
        Stage primaryStage = (Stage) this.root.getScene().getWindow();
        primaryStage.setScene(subScene);
        primaryStage.centerOnScreen();
    }
}
