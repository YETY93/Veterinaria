
package co.uptc.vet.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.uptc.vet.negocio.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SecundariaController implements Initializable, ScreenControlable {
	@FXML
	private Button btn_volver;
	@FXML
	private Button btn_salir;

	@FXML
	private TextField nombreCliente;
	@FXML
	private TextField apellidoCliente;
	@FXML
	private TextField apellidoSecuCliente;
	@FXML
	private TextField telefonoContacto;

	private Main mainApp;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	private void volver(ActionEvent event) {
		mainApp.cargarVentana(Main.ventana1);
	}

	@FXML
	private void salir(ActionEvent event) {
		Stage stage = (Stage) btn_salir.getScene().getWindow();
		stage.close();
	}

	@FXML
	private void informacionCapturadaCl(ActionEvent event) {

		Alert infDatosCliente = new Alert(Alert.AlertType.INFORMATION);
		Alert errorDatosCliente = new Alert(Alert.AlertType.ERROR);
		Cliente clienteNuevo1 = new Cliente();

		// Asignacion los datos a la lista  mascota
		clienteNuevo1.setNombre(nombreCliente.getText());
		clienteNuevo1.setPrimerApellido(apellidoCliente.getText());
		clienteNuevo1.setSecundoApellido(apellidoSecuCliente.getText());
		clienteNuevo1.setTelefono(telefonoContacto.getText());

		// Crea un ArrayList con los datos de la cliente que estan vacios y otro con los
		// del cliente

		List<String> datosCliente = new ArrayList<String>();
		List<String> datosClienteVacios = new ArrayList<String>();

		// asignacion datos a las lista datosCliente
		if (clienteNuevo1.getNombre().isEmpty()) {
			datosCliente.add("Nombre Vacio");
		} else if (clienteNuevo1.getNombre().isEmpty() != true) {
			datosCliente.add(0, clienteNuevo1.getNombre().toUpperCase());
		}
		if (clienteNuevo1.getPrimerApellido().isEmpty()) {
			datosCliente.add("Primer Apellido Vacio");
		} else if (clienteNuevo1.getPrimerApellido().isEmpty() != true) {
			datosCliente.add(1, clienteNuevo1.getPrimerApellido().toUpperCase());
		}

		if (clienteNuevo1.getSecundoApellido().isEmpty()) {
			datosCliente.add("Segundo Apellido Vacio");
		} else if (clienteNuevo1.getSecundoApellido().isEmpty() != true) {
			datosCliente.add(2, clienteNuevo1.getSecundoApellido().toUpperCase());
		}

		if (clienteNuevo1.getTelefono().isEmpty()) {
			datosCliente.add("Telefono vacio");
		} else if (clienteNuevo1.getTelefono().isEmpty() != true) {
			datosCliente.add(3, clienteNuevo1.getTelefono());
		}

		// asignacion datos a las lista datosCliente default

		datosClienteVacios.add("Nombre Vacio");
		datosClienteVacios.add("Primer Apellido Vacio");
		datosClienteVacios.add("Segundo Apellido Vacio");
		datosClienteVacios.add("Telefono vacio");

		// caparacion si la cadena es iguaal a la de por defectos y lanza un mensaje de
		// alerta o de informacion
		if (datosCliente.equals(datosClienteVacios)) {
			errorDatosCliente.setHeaderText("No hay imformacion a guardar");
			errorDatosCliente.setContentText("Por favor diligenciar al menos el Campo nomnbre");
			errorDatosCliente.setResizable(false);
			errorDatosCliente.show();

		} else {

			// Imprime un Alert de los datos de la mascota que estan vacios

			infDatosCliente.setHeaderText("La siguiente información se almacenara");
			infDatosCliente.setContentText("Nombre: " + datosCliente.get(0).toUpperCase()
			+ " \nPrimer apellido: " + datosCliente.get(1).toUpperCase()
			+ " \nPrimer apellido: " + datosCliente.get(2).toUpperCase() 
			+ " \nTelefono: " + datosCliente.get(3)); 
			infDatosCliente.setTitle("Datos del mascota");
			
			infDatosCliente.show();
		}

	}
}
