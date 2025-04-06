package lasalle.warehousesystem.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class login_validator {
    @FXML
    TextField txtBoxUsername;

    @FXML
    TextField txtBoxPassword;

    @FXML
    Button btnLogin;

    String username, password;

    public void validateLogin(ActionEvent event) {
        username = txtBoxUsername.getText();
        password = txtBoxPassword.getText();

        // Please create a logic to validate the login, based on those 2 strings.
        // Do not forget to comment where the two possible results are (valid and invalid login)
        // So i can addapt the code with JavaFX

        // ...

    }
}
