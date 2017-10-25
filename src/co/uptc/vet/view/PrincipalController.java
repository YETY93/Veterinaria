
package co.uptc.vet.view;

import java.net.URL;
import java.util.ResourceBundle;

import co.uptc.vet.negocio.Mascota;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


public class PrincipalController implements Initializable, ScreenControlable {
    
	@FXML
    private Button btn_abrir;
	   @FXML
	    private TextField idNombreMascota;
	    @FXML
	    private TextField idEdadMascota;
		@FXML
		private ComboBox<String> tipoAnimCBOX;
	    @FXML
	    private TextField idRazaMascota;
	    @FXML
	    private TextField idSintomasMascota;
	    @FXML
	    private TextField fechaIngreso;

	
	
    private Prueba_ventanas mainApp;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

		tipoAnimCBOX.getItems().removeAll(tipoAnimCBOX.getItems());
		tipoAnimCBOX.getItems().addAll("Gato", "Perico", "Perro");
		tipoAnimCBOX.getSelectionModel().select("Gato");
    }    

    public void setMainApp(Prueba_ventanas mainApp){
        this.mainApp=mainApp;
    }
    
    @FXML
    private void abrirVentana(ActionEvent event) {
        mainApp.cargarVentana(Prueba_ventanas.ventana2);
    }
    
    

    
    
    @FXML
    private void informacionCapturadaM (ActionEvent event){
    	Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
		Mascota mascota= new Mascota();
		
		mascota.setNombre(idNombreMascota.getText());
		mascota.setEdad(idEdadMascota.getText());
		mascota.setTipoAnimal(tipoAnimCBOX.getValue());
		mascota.setRaza(idRazaMascota.getText());
		mascota.setSintomas(idSintomasMascota.getText());
		mascota.toString();
		
		dialogoInfo.setTitle("Informacion de la mascota");

		if(mascota.getNombre().isEmpty()){
    		dialogoInfo.setHeaderText("No hay infomacion a guardar en nombre");
    		dialogoInfo.setContentText("Error almacenando informacion");
    		
		}else if (mascota.getEdad().isEmpty()){
        		dialogoInfo.setHeaderText("No hay infomacion a guardar en edad ");
        		dialogoInfo.setContentText("Error almacenando informacion");
        		
        }else if(mascota.getRaza().isEmpty()){
        		dialogoInfo.setHeaderText("No hay infomacion a guardar en raza ");
        		dialogoInfo.setContentText("Error almacenando informacion");
        		
        }else if(mascota.getSintomas().isEmpty()){
        		dialogoInfo.setHeaderText("No hay infomacion a guardar en sintomas ");
        		dialogoInfo.setContentText("Error almacenando informacion");   		
		}else{
    	
    	dialogoInfo.setHeaderText("Esta es la informacion \nbasica de la mascota" );
    	dialogoInfo.setContentText("Nombre: " + mascota.getNombre()
    			+ " \nEdad: " + mascota.getEdad() + " meses"
    			+ " \nTipo de Animal: " + mascota.getTipoAnimal() 
    			+ " \nRaza: " + mascota.getRaza() 
    			+ " \nSintomas: " + mascota.getSintomas() 
    			);

		}
    	dialogoInfo.setResizable(false);
    	
    	dialogoInfo.show();
    }
		
}
