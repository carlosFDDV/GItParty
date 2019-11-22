package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

	AnchorPane myPane;
	
	@FXML
	private void openStage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista2.fxml"));
			//BorderPane root = new BorderPane();
			myPane = (AnchorPane) loader.load();
			
			Scene scene = new Scene(myPane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
