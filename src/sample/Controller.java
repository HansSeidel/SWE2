package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.awt.*;

public class Controller {

    public JFXTextField username_jfxtf;
    public JFXPasswordField password_jfxtf;
    public JFXButton submit_jfxbtn;
    public Label username_lbl;

    public void submit(){
        //Will be moved into ViewModel class
        //Will be checked with actual values
        if(username_jfxtf.getText().equals("admin") && password_jfxtf.getText().equals("admin") && !submit_jfxbtn.disableProperty().getValue()){
            submit_jfxbtn.disableProperty().setValue(true);
            username_lbl.fontProperty().setValue(Font.getDefault());
            username_lbl.textProperty().setValue(username_jfxtf.getText());
        }
    }

    public void exit(){
        System.exit(0);
    }
}
