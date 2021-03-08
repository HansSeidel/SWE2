package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;

import java.awt.*;

public class Presenter {

    public JFXTextField username_jfxtf;
    public JFXPasswordField password_jfxtf;
    public JFXButton button_jfxbtn;

    public void submit(){
        //Will be moved into ViewModel class
        //Will be checked with actual values
        if(username_jfxtf.getText().equals("admin") && password_jfxtf.getText().equals("admin")){
            button_jfxbtn.getStyleableNode().setDisable(true);
        }
    }

    public void exit(){
        System.exit(0);
    }
}
