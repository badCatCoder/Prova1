package it.polito.tdp.prova1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtEta;

	@FXML
	private Button btnOk;

	@FXML
	private Label lblRisosta;

	@FXML
	void handleOk(ActionEvent event) {
		String nome = txtNome.getText();
		int eta = Integer.parseInt(txtEta.getText());
		String risposta = (eta < 18 ? "Ciao " : "Buongiorno, ") + nome + "!";
		lblRisosta.setText(risposta);
	}

	@FXML
	void initialize() {
		assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtEta != null : "fx:id=\"txtEta\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnOk != null : "fx:id=\"btnOk\" was not injected: check your FXML file 'Scene.fxml'.";
		assert lblRisosta != null : "fx:id=\"lblRisosta\" was not injected: check your FXML file 'Scene.fxml'.";

	}
}
