package dad.calculadoraFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	private Calculadora calculadora= new Calculadora();
	
	private char funcion;
	
	@FXML
	private TextField panelNumeros1;

	@FXML
	private GridPane panelTotal;

	@FXML
	private Button boton7;

	@FXML
	private Button boton8;

	@FXML
	private Button boton9;

	@FXML
	private Button botonCE;

	@FXML
	private Button botonC;

	@FXML
	private Button boton4;

	@FXML
	private Button boton5;

	@FXML
	private Button boton6;

	@FXML
	private Button botonMultiplicar;

	@FXML
	private Button botonDividir;

	@FXML
	private Button boton1;

	@FXML
	private Button boton2;

	@FXML
	private Button boton3;

	@FXML
	private Button botonMenos;

	@FXML
	private Button boton0;

	@FXML
	private Button botonComa;

	@FXML
	private Button botonMas;
	
	@FXML
	private Button botonIgual;

	private StringProperty numeros = new SimpleStringProperty();

	public Controller() throws IOException {
		FXMLLoader loader= new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		panelNumeros1.textProperty().bind(numeros);
	}

	public GridPane getView() {
		return panelTotal;
	}

	@FXML
	private void onClick (ActionEvent e) {
	
		funcion=e.getSource().toString().charAt(e.getSource().toString().length()-2);
		
		if(funcion=='0') {
			calculadora.insertar(funcion);
		}
		if(funcion=='1') {
			calculadora.insertar(funcion);
		}
		if(funcion=='2') {
			calculadora.insertar(funcion);
		}
		if(funcion=='3') {
			calculadora.insertar(funcion);
		}
		if(funcion=='4') {
			calculadora.insertar(funcion);
		}
		if(funcion=='5') {
			calculadora.insertar(funcion);
		}
		if(funcion=='6') {
			calculadora.insertar(funcion);
		}
		if(funcion=='7') {
			calculadora.insertar(funcion);
		}
		if(funcion=='8') {
			calculadora.insertar(funcion);
		}
		if(funcion=='9') {
			calculadora.insertar(funcion);
		}
		if(funcion=='E') {
			calculadora.borrarTodo();
		}
		if(funcion=='C') {
			calculadora.borrar();
		}
		if(funcion=='+') {
			calculadora.operar(Calculadora.SUMAR);
		}
		if(funcion=='*') {
			calculadora.operar(Calculadora.MULTIPLICAR);
		}
		if(funcion=='-') {
			calculadora.operar(Calculadora.RESTAR);
		}
		if(funcion=='/') {
			calculadora.operar(Calculadora.DIVIDIR);
		}
		if(funcion=='=') {
			calculadora.operar(Calculadora.IGUAL);
		}
		if(funcion=='.') {
			calculadora.insertarComa();
		}
		numeros.set(calculadora.getPantalla());
		
	}

}
