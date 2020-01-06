package View.Report;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReportPanel implements Initializable {
    @FXML
    private GridPane pane;
    @FXML
    private ComboBox<String> reportList;

    private ObservableList<String> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        list = FXCollections.observableArrayList(
                "All Movies Report",
               "Work time report"
        );

        reportList.getItems().addAll(list);
        reportList.setValue(list.get(0));
    }

    public void onClickGenerate(MouseEvent mouseEvent) throws IOException {

        if(reportList.getSelectionModel().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Report");
            alert.setHeaderText(null);
            alert.setContentText("Report must be selected!");
            alert.showAndWait();
            return;
        }

        switch (reportList.getValue()) {
            case "All Movies Report": {
                Controller.ReportGenerator.generateAllMoviesReport();
            }
            case "Work time report": {
                Controller.ReportGenerator.generateWorkTimeReport();
            }

            default: {
                System.out.println("default");
            }
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Report generated");
        alert.setHeaderText(null);
        alert.setContentText("Generated report: " + reportList.getValue());
        alert.showAndWait();
    }
}
