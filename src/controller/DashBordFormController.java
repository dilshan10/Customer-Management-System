package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBordFormController {
    public Label lblTital;
    public AnchorPane root;
    public Label lbtSubTital;

    private final String LocationPath = "../views/";

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
        Parent parent = FXMLLoader.load(getClass().getResource(location));
        Scene subScene = new Scene(parent);
        Stage primaryStage = (Stage) this.root.getScene().getWindow();
        primaryStage.setScene(subScene);
        primaryStage.centerOnScreen();
    }

    public void FirstPicMouseClickOnAction(MouseEvent mouseEvent) {
        String Location = LocationPath+"";
    }

    public void SecondPicMouseClickOnAction(MouseEvent mouseEvent) {
        String Location  = LocationPath+"";
    }

    public void ThiredPicMouseClickOnAction(MouseEvent mouseEvent) {
        String Location  = LocationPath+"";
    }

    public void UserImageMouseClickOnAction(MouseEvent mouseEvent) {
        String Location  = LocationPath+"";
    }

    public void SettingsImageMouseClickOnAction(MouseEvent mouseEvent) throws IOException {
        String Location  = LocationPath+"Setting_Form.fxml";
        PageLoader(Location);
    }
}
