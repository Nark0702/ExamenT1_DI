
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * Creamos el login y accedemos a otra ventana
 * @author marki
 * @version 1.0
 * 
 */
public class MainRocket extends Application {
	

	// Metodo para arrancar la aplicacion

	
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Ventana1.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
