package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private ComboBox<Integer>year;

    @FXML
    private ComboBox<String>semister;



    public void initialize(){

        year.getItems().addAll(1,2,3,4);
        semister.getItems().addAll("ภาคต้น","ภาคปลาย");
    }


    @FXML
    public void check(ActionEvent event){
        try {


            if (year.getValue() == null || semister.getValue() == null) {
                throw new IllegalArgumentException();
            }

            if (year.getValue() == 1 && semister.getValue().equals("ภาคต้น")) {

                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Year_1Mid.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 722, 496));
                    stage.show();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (year.getValue() == 1 && semister.getValue().equals("ภาคปลาย")) {

                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Year_1Final.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 722, 496));
                    stage.show();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } if (year.getValue() == 2 && semister.getValue().equals("ภาคต้น")) {

                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Year_2Mid.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 722, 496));
                    stage.show();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } if (year.getValue() == 2 && semister.getValue().equals("ภาคปลาย")) {

                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Year_2Final.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 722, 496));
                    stage.show();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } if (year.getValue() == 3 && semister.getValue().equals("ภาคต้น")) {

                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Year_3Mid.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 722, 496));
                    stage.show();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } if (year.getValue() == 3 && semister.getValue().equals("ภาคปลาย")) {

                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Year_3Final.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 722, 496));
                    stage.show();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } if (year.getValue() == 4 && semister.getValue().equals("ภาคต้น")) {

                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Year_4Mid.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 722, 496));
                    stage.show();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } if (year.getValue() == 4 && semister.getValue().equals("ภาคปลาย")) {

                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Year_4Final.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 722, 496));
                    stage.show();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }catch (IllegalArgumentException e){
            System.out.println("Some label is not choose");
        }








    }

}
