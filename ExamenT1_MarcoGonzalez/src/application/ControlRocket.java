package application;

import java.io.IOException;


import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 * 
 * @author marki
 *
 */
public class ControlRocket {
	
	@FXML
	private AnchorPane contro, controlador;
	@FXML
	private ImageView fotoLo;

	public void initialize() {

		transiccionFoto();

	}
	// Metodo para cerrar la aplicacion
	@FXML
	public void closeApp() {
		Stage thisStage = (Stage) controlador.getScene().getWindow();
		thisStage.close();
	}
	
	// Metodo para abrir una ventana nueva
	 
	@FXML	
	public void openStage() {
		Stage thisStage = (Stage) contro.getScene().getWindow();
		thisStage.close();
		
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Ventana2.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Metodo que se encarga de la transiccion de la foto principal
	
	private void transiccionFoto() {
		FadeTransition ft = new FadeTransition(Duration.seconds(7), fotoLo);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}


}
