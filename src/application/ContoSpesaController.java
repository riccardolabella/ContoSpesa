package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ContoSpesaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox checkRick;

    @FXML
    private CheckBox checkAle;

    @FXML
    private CheckBox checkPeppe;

    @FXML
    private CheckBox checkDav;

    @FXML
    private VBox box;

    @FXML
    private TextField prezzo;

    @FXML
    private Button metti;

    @FXML
    private Button togli;

    @FXML
    private TableColumn<?, ?> colonnaRiccardo;

    @FXML
    private TableColumn<?, ?> colonnaAlessandro;

    @FXML
    private TableColumn<?, ?> colonnaGiuseppe;

    @FXML
    private TableColumn<?, ?> colonnaDavide;

    @FXML
    private TextField totaleRick;

    @FXML
    private TextField totaleAle;

    @FXML
    private TextField totalePep;

    @FXML
    private TextField totaleDav;

    @FXML
    private Button svuota;
    
    private int contatore=0; 
    
    @FXML
    private TextArea spesa;
    
    @FXML
    private TextField totaletot;


    @FXML
    void checkd(ActionEvent event) {
    	if(box.isDisable()==true && checkDav.isSelected()==true && 
    			checkAle.isSelected()==false && checkRick.isSelected()==false 
    			&& checkPeppe.isSelected()==false) {
    		box.setDisable(false);
    	}
    	if(box.isDisable()==false && checkDav.isSelected()==false && 
    			checkAle.isSelected()==false && checkRick.isSelected()==false 
    			&& checkPeppe.isSelected()==false) {
    		box.setDisable(true);
    	}
    	if(checkDav.isSelected()==true) {
    		contatore++;
    	}
    	if(checkDav.isSelected()==false) {
    		contatore--;
    	}
    }

    @FXML
    void checka(ActionEvent event) {
    	if(box.isDisable()==true && checkAle.isSelected()==true && 
    			checkRick.isSelected()==false && checkDav.isSelected()==false 
    			&& checkPeppe.isSelected()==false) {
    		box.setDisable(false);
    	}
    	if(box.isDisable()==false && checkAle.isSelected()==false && 
    			checkRick.isSelected()==false && checkDav.isSelected()==false 
    			&& checkPeppe.isSelected()==false) {
    		box.setDisable(true);
    	}
    	if(checkAle.isSelected()==true) {
    		contatore++;
    	}
    	if(checkAle.isSelected()==false) {
    		contatore--;
    	}
    }

    @FXML
    void checkp(ActionEvent event) {
    	if(box.isDisable()==true && checkPeppe.isSelected()==true && 
    			checkAle.isSelected()==false && checkDav.isSelected()==false 
    			&& checkRick.isSelected()==false) {
    		box.setDisable(false);
    	}
    	if(box.isDisable()==false && checkPeppe.isSelected()==false && 
    			checkAle.isSelected()==false && checkDav.isSelected()==false 
    			&& checkRick.isSelected()==false) {
    		box.setDisable(true);
    	}
    	if(checkPeppe.isSelected()==true) {
    		contatore++;
    	}
    	if(checkPeppe.isSelected()==false) {
    		contatore--;
    	}
    }

    @FXML
    void checkr(ActionEvent event) {
    	if(box.isDisable()==true && checkRick.isSelected()==true && 
    			checkAle.isSelected()==false && checkDav.isSelected()==false 
    			&& checkPeppe.isSelected()==false) {
    		box.setDisable(false);
    	}
    	if(box.isDisable()==false && checkRick.isSelected()==false && 
    			checkAle.isSelected()==false && checkDav.isSelected()==false 
    			&& checkPeppe.isSelected()==false) {
    		box.setDisable(true);
    	}
    	
    	if(checkRick.isSelected()==true) {
    		contatore++;
    	}
    	if(checkRick.isSelected()==false) {
    		contatore--;
    	}
    }
    
    private double totrick=0;
    private double totale=0;
    private double totpep=0;
    private double totdav=0;
    private int numero=0;

    @FXML
    void dometti(ActionEvent event) {
    	numero++;
    	spesa.appendText(String.format("%d)   "+prezzo.getText()+" €\n", numero));
    	double divisione = ((Double.parseDouble(prezzo.getText())))/contatore;
    	if(checkRick.isSelected()==true) {
    		totrick=totrick+divisione;
    		totaleRick.setText(String.format("%.2f", totrick));
    	}
    	if(checkAle.isSelected()==true) {
    		totale=totale+divisione;
    		totaleAle.setText(String.format("%.2f", totale));
    	}
    	if(checkPeppe.isSelected()==true) {
    		totpep=totpep+divisione;
    		totalePep.setText(String.format("%.2f", totpep));
    	}
    	if(checkDav.isSelected()==true) {
    		totdav=totdav+divisione;
    		totaleDav.setText(String.format("%.2f", totdav));
    	}
    	totaletot.setText(String.format("%.2f", totale+totdav+totrick+totpep));
    }

    @FXML
    void dosvuota(ActionEvent event) {
    	totaleRick.clear();
    	totaleAle.clear();
    	totalePep.clear();
    	totaleDav.clear();
    	spesa.clear();
    	checkRick.setSelected(false);
    	checkPeppe.setSelected(false);
    	checkAle.setSelected(false);
    	checkDav.setSelected(false);
    	box.setDisable(true);
    	prezzo.clear();
    	totaletot.clear();
    }

    @FXML
    void dotogli(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert checkRick != null : "fx:id=\"checkRick\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert checkAle != null : "fx:id=\"checkAle\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert checkPeppe != null : "fx:id=\"checkPeppe\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert checkDav != null : "fx:id=\"checkDav\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert box != null : "fx:id=\"box\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert prezzo != null : "fx:id=\"prezzo\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert metti != null : "fx:id=\"metti\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert togli != null : "fx:id=\"togli\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert colonnaRiccardo != null : "fx:id=\"colonnaRiccardo\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert colonnaAlessandro != null : "fx:id=\"colonnaAlessandro\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert colonnaGiuseppe != null : "fx:id=\"colonnaGiuseppe\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert colonnaDavide != null : "fx:id=\"colonnaDavide\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert totaleRick != null : "fx:id=\"totaleRick\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert totaleAle != null : "fx:id=\"totaleAle\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert totalePep != null : "fx:id=\"totalePep\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert totaleDav != null : "fx:id=\"totaleDav\" was not injected: check your FXML file 'ContoSpesa.fxml'.";
        assert svuota != null : "fx:id=\"svuota\" was not injected: check your FXML file 'ContoSpesa.fxml'.";

    }
}
