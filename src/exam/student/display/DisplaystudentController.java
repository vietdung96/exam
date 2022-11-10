package exam.student.display;

import javafx.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import multipage.Subject;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DisplaystudentController implements Initializable {
    public ListView<Student> lv;
    public static ObservableList<Student> list = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       lv.setItems(list);


    }
}
