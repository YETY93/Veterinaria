
package co.uptc.vet.view;

import java.net.URL;
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
    
    public void setMainApp(Main mainApp){
        this.mainApp=mainApp;
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
    private void informacionCapturadaCl (ActionEvent event){
    	Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        Cliente clienteNuevo1 = new Cliente();
        
        clienteNuevo1.setNombre(nombreCliente.getText());
        clienteNuevo1.setPrimerApellido(apellidoCliente.getText());
        clienteNuevo1.setSecundoApellido(apellidoSecuCliente.getText());
        clienteNuevo1.setTelefono(telefonoContacto.getText());
    
    	
    	if (clienteNuevo1.getNombre().isEmpty()){
    		dialogoInfo.setHeaderText("No hay infomacion a guardar en nombre ");
    		dialogoInfo.setContentText("Error almacenando informacion");
    		
    	}else if(clienteNuevo1.getPrimerApellido().isEmpty()){
    		dialogoInfo.setHeaderText("No hay infomacion a guardar en primer apellido ");
    		dialogoInfo.setContentText("Error almacenando informacion");
    		
    	}else if(clienteNuevo1.getSecundoApellido().isEmpty()){
    		dialogoInfo.setHeaderText("No hay infomacion a guardar en secundo apellido ");
    		dialogoInfo.setContentText("Error almacenando informacion");
    		
    	}else if (clienteNuevo1.getTelefono().isEmpty()) {
    		dialogoInfo.setHeaderText("No hay infomacion a guardar en numero de contacto ");
    		dialogoInfo.setContentText("Error almacenando informacion");
    		
		}else {
	    	dialogoInfo.setHeaderText("Esta es la del cliente que se guardara");
	    	dialogoInfo.setContentText("Nombre: " + clienteNuevo1.getNombre()
			+ " \nPrimer apellido: " + clienteNuevo1.getPrimerApellido()
			+ " \nPrimer apellido: " + clienteNuevo1.getSecundoApellido() 
			+ " \nTelefono: " + clienteNuevo1.getTelefono() 
			
			);
		}
    	dialogoInfo.setResizable(false);
    	dialogoInfo.show();
    		
    }
    	
  /**
    @FXML
    private void informacionCapturadaCl (ActionEvent event){
    	Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
    	
    	Cliente clienteNuevo1 = new Cliente();
    	clienteNuevo.setNombre(nombreCliente.getText());
    	clienteNuevo.setPrimerApellido(apellidoCliente.getText());
    	clienteNuevo.setSecundoApellido(apellidoSecuCliente.getText());
    	
    	
    	dialogoInfo.setTitle("Informacion del cliente");
    	if (clienteNuevo.getNombre().isEmpty()){
    		dialogoInfo.setHeaderText("No hay infomacion a guardar ");
    		dialogoInfo.setContentText("Error almacenando informacion");
    	}else{
    		
    	
    	clienteNuevo.setTelefono(telefonoContacto.getText());
    	dialogoInfo.setHeaderText("Esta es la del cliente que se guardara");
    	dialogoInfo.setContentText("Nombre: " + clienteNuevo.getNombre()
		+ " \nPrimer apellido: " + clienteNuevo.getPrimerApellido()
		+ " \nPrimer apellido: " + clienteNuevo.getSecundoApellido() 
		+ " \nTelefono: " + clienteNuevo.getTelefono() 
		
		);
    	}
    
    	dialogoInfo.setResizable(false);
    	dialogoInfo.show();
    	
    }
    **/

}

