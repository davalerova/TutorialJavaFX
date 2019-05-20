package controlador;

import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Principal implements Initializable {
    Stage principal;

    public Stage getPrincipal() {
        return principal;
    }

    public void setPrincipal(Stage principal) {
        this.principal = principal;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
