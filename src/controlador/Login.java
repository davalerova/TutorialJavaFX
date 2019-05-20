package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import vista.Vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {

    @FXML
    TextField user;

    @FXML
    PasswordField pass;

    Stage login;

    public Stage getLogin() {
        return login;
    }

    public void setLogin(Stage login) {
        this.login = login;
    }

    @FXML
    public void accion(ActionEvent evt){
        if(user.getText().equals("daval")&&pass.getText().equals("daval")){
            Vistas vista=new Vistas();
            FXMLLoader princi=vista.vista("Principal");
            princi.setController(new Principal());
            try {
                Parent root=(Parent)princi.load();
                Scene scena=new Scene(root);
                Stage pricipal= new Stage();
                pricipal.setScene(scena);
                pricipal.show();
                getLogin().hide();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Hola javafx");
    }
}
