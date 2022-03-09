package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;

public class FXMLController {
	
	Parole elenco ;
	
	@FXML
	private TextArea txtTempo;
	
	@FXML
    private Button btnClear;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) 
    {
    long inizio = System.nanoTime();
    elenco.addParola(txtParola.getText());
    txtParola.clear();
    elenco.getElenco();
    txtResult.setText(elenco.stampaElenco());
    long fine = System.nanoTime();
    txtTempo.setText(""+(fine-inizio)+" ns");
    }
    
    @FXML
    void doReset(ActionEvent event) 
    {
    	elenco.reset();
    	txtResult.clear();
    	txtTempo.clear();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
    
    @FXML
    void doClear(ActionEvent event) 
    {
    	long inizio = System.nanoTime();
    	
    	String ss=txtResult.getSelectedText();
    	elenco.listaParole.remove(ss);
    	txtResult.setText(elenco.stampaElenco());	
    	long fine = System.nanoTime();
    	txtTempo.setText(""+(fine-inizio)+ " ns");
    }
}
