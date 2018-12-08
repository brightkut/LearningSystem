package Controller;

import Model.Course;
import Model.SqlConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerYear_3Mid {
    private ObservableList<Course> data;
    private ResultSet rs;
    private PreparedStatement ps;




    @FXML
    private TableView<Course> tableCourse;
    @FXML
    private TableColumn<Course,String> subjectId;
    @FXML
    private  TableColumn<Course,String>subjectName;
    @FXML
    private TableColumn<Course,String> unit;
    @FXML
    private TableColumn<Course,String> status;
    @FXML
    private TableColumn<Course,String> subjectPass;
    @FXML
    private Label sub1;
    @FXML
    private Label sub2;
    @FXML
    private Label sub3;
    @FXML
    private Label sub4;
    @FXML
    private Label sub5;
    @FXML
    private Label sub6;
    @FXML
    private Label sub7;








    public void initialize()  {
        //create array list
        data = FXCollections.observableArrayList();


        try {
            //connect database
            rs = SqlConnection.DbConnector().createStatement().executeQuery("SELECT * FROM Course");


            while (rs.next()){
                if (rs.getInt(5)==1&&rs.getInt(6)==3) {
                    //add data to array list
                    data.add(new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
                }
            }


        }catch (SQLException e){
            System.out.println(e);
        }

        //set item to column
        subjectId.setCellValueFactory(new PropertyValueFactory<>("subjectId"));
        subjectName.setCellValueFactory(new PropertyValueFactory<>("subjectName"));
        unit.setCellValueFactory(new PropertyValueFactory<>("unit"));
        status.setCellValueFactory(new PropertyValueFactory<>("status"));
        subjectPass.setCellValueFactory(new PropertyValueFactory<>("subjectPass"));

        //set label background color

        sub1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        sub2.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        sub3.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        sub4.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        sub5.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        sub6.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));


        //set border color
        sub1.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(2), new BorderWidths(3))));
        sub2.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(2), new BorderWidths(3))));
        sub3.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(2), new BorderWidths(3))));
        sub4.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(2), new BorderWidths(3))));
        sub5.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(2), new BorderWidths(3))));
        sub6.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(2), new BorderWidths(3))));

        //set data in array to table view
        tableCourse.setItems(data);
        //close connection database
        SqlConnection.closeConnect();

    }

    @FXML
    public void checkPass(ActionEvent event){
        try {
            if (tableCourse.getSelectionModel().getSelectedItem()==null){
                throw new IllegalArgumentException();
            }
            //value of name in row that user choose to change status
            String nameChoose = tableCourse.getSelectionModel().getSelectedItem().getSubjectName();

            String query = "UPDATE Course SET status = ? WHERE subjectName = ?";

            ps = SqlConnection.DbConnector().prepareStatement(query);
            ps.setString(1,"Pass");
            ps.setString(2,nameChoose);
            ps.executeUpdate();
            ps.close();
        }catch (IllegalArgumentException e){
            System.out.println("not choose row");
        }
        catch (SQLException e){
            System.out.println(e);
        }

        // close database connection
        SqlConnection.closeConnect();

        // reload new gui again
        initialize();
    }

    @FXML
    public void checkNotPass(ActionEvent event){
        try {
            if (tableCourse.getSelectionModel().getSelectedItem()==null){
                throw new IllegalArgumentException();
            }

            //value of name in row that user chooseto change status
            String nameChoose = tableCourse.getSelectionModel().getSelectedItem().getSubjectName();



            String query = "UPDATE Course SET status = ? WHERE subjectName = ?";
            ps = SqlConnection.DbConnector().prepareStatement(query);
            ps.setString(1,"Not Pass");
            ps.setString(2,nameChoose);
            ps.executeUpdate();
            ps.close();
        }
        catch (IllegalArgumentException e){
            System.out.println("not choose row");
        }catch (SQLException e){
            System.out.println(e);
        }
        //close database connection

        SqlConnection.closeConnect();
        //reload gui again
        initialize();
    }

    @FXML
    public void back(ActionEvent event){

        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/Home.fxml"));
        try {
            stage.setScene(new Scene(loader.load(), 546, 400));
            stage.show();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
