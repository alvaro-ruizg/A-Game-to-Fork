package com.ieselgrao.gametofork;

import javafx.fxml.FXML;
import java.io.IOException;

public class StartController {

    @FXML
    protected void handleStartGame() throws IOException {
        MainApplication.switchToGameView();
    }
}