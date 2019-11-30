package View.TimetableModule;

import Controller.StageManager;
import View.TimetableModule.Util.PopOutWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static View.TimetableModule.Util.Constants.INITIAL_ADS_VALUE;
import static View.TimetableModule.Util.Constants.INITIAL_PERFORMANCE_GAP_VALUE;
import static View.TimetableModule.Util.Constants.MAX_ADS_VALUE;
import static View.TimetableModule.Util.Constants.MAX_PERFORMANCE_GAP_VALUE;
import static View.TimetableModule.Util.Constants.MIN_ADS_VALUE;
import static View.TimetableModule.Util.Constants.MIN_PERFORMANCE_GAP_VALUE;
import static View.TimetableModule.Util.Constants.SPINNER_STEP;
import static View.TimetableModule.Util.Constants.TIMETABLE_PANEL;
import static View.TimetableModule.Util.Constants.TIMETABLE_PANEL_PATH;
import static View.TimetableModule.Util.Constants.TIMETABLE_PANEL_STYLE_PATH;

public class SystemParamsPanel implements Initializable {

    /*------------------------ FIELDS REGION ------------------------*/
    @FXML
    private Spinner spinnerAdsDuration;

    @FXML
    private Spinner spinnerGapDuration;

    @FXML
    private Button confirmButton;

    private PopOutWindow popOutWindow = new PopOutWindow();

    /*------------------------ METHODS REGION ------------------------*/
    private Stage loadFxmlStage(String fxmlPath, String fxmlStylePath, String title) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource(fxmlPath)));
        scene.getStylesheets().add(getClass().getResource(fxmlStylePath).toExternalForm());

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(title);
        stage.setResizable(false);
        stage.show();

        return stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        spinnerAdsDuration.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(
                MIN_ADS_VALUE, MAX_ADS_VALUE, INITIAL_ADS_VALUE, SPINNER_STEP));
        spinnerGapDuration.setValueFactory(new SpinnerValueFactory
                .IntegerSpinnerValueFactory(MIN_PERFORMANCE_GAP_VALUE,
                MAX_PERFORMANCE_GAP_VALUE, INITIAL_PERFORMANCE_GAP_VALUE, SPINNER_STEP));
    }

    @FXML
    private void onClickConfirmButton(ActionEvent actionEvent) {
//        TODO SAVING TO DB
        Integer ads = (Integer) spinnerAdsDuration.getValue();
        Integer gap = (Integer) spinnerGapDuration.getValue();

        try {
            Stage currentStage = (Stage) confirmButton.getScene().getWindow();
            currentStage.close();
            Stage mainStage = loadFxmlStage(TIMETABLE_PANEL_PATH,
                    TIMETABLE_PANEL_STYLE_PATH, TIMETABLE_PANEL);
            StageManager.mainStage.close();
            StageManager.mainStage = mainStage;
        } catch (IOException e) {
            popOutWindow.messageBox("Stage Loading Error",
                    "Cannot Properly Load Main Stage", Alert.AlertType.ERROR);
        }
    }
}
