package controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class DashBordFormController {
    public Label lblTital;
    public AnchorPane root;
    public Label lbtSubTital;

    private final String LocationPath = "../views/";

    public void initialize(){
        DateAndTime();
    }

    private void DateAndTime() {
//        date.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
//        Timeline Clock =new Timeline(new KeyFrame(Duration.ZERO, e ->{
//            LocalTime currentTime = LocalTime.now();
//            time.setText(currentTime.getHour()+":"+
//                    currentTime.getMinute()+":"+
//                    currentTime.getSecond());
//        }),
//                new KeyFrame(Duration.seconds(1))
//        );
//        Clock.setCycleCount(Animation.INDEFINITE);
//        Clock.play();
    }

    public void FirstPucMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("CUSTOMER");
        lbtSubTital.setText("You Can Save,Update,Delete,Read And find Customer Data In This Option..!");
    }

    public void FirstPucMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("WELCOME");
        lbtSubTital.setText("Please select one of above main operations to proceed");
    }

    public void SecondPicMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("ITEMS");
        lbtSubTital.setText("You Can Save,Update,Delete,Read And find Item Data In This Option..!");
    }

    public void SecondPicMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("WELCOME");
        lbtSubTital.setText("Please select one of above main operations to proceed");
    }

    public void ThiredPicMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("PURCHES ORDER");
        lbtSubTital.setText("You Can Save,Update,Delete,Read And find Purches Order Data In This Option..!");
    }

    public void ThiredPicMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("WELCOME");
        lbtSubTital.setText("Please select one of above main operations to proceed");
    }

    public void UserImageMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("User Settings");
        lbtSubTital.setText("You Can Save,Update,Delete,Read And find User Data In This Option..!");
    }

    public void UserImageMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("WELCOME");
        lbtSubTital.setText("Please select one of above main operations to proceed");
    }

    public void LogOutImageMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("LogOut");
        lbtSubTital.setText("You Can LogOut by Click On this Option");
    }

    public void LogOutImageMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("WELCOME");
        lbtSubTital.setText("Please select one of above main operations to proceed");
    }

    public void SettingsImageMouseEnter(MouseEvent mouseEvent) {
        lblTital.setText("General Settings");
        lbtSubTital.setText("You Can Chenge General Setting in this Option");
    }

    public void SettingsImageMouseExit(MouseEvent mouseEvent) {
        lblTital.setText("WELCOME");
        lbtSubTital.setText("Please select one of above main operations to proceed");
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
