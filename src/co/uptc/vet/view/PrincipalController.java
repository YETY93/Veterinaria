
package co.uptc.vet.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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

	
	
    private Main mainApp;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

		tipoAnimCBOX.getItems().removeAll(tipoAnimCBOX.getItems());
		tipoAnimCBOX.getItems().addAll("Seleccione", "Gato", "Perico", "Perro");
		tipoAnimCBOX.getSelectionModel().select("Seleccione");
    }    

    public void setMainApp(Main mainApp){
        this.mainApp=mainApp;
    }
    
    @FXML
    private void abrirVentana(ActionEvent event) {
        mainApp.cargarVentana(Main.ventana2);
    }
    
    

    
    
    @FXML
    private void informacionCapturadaM (ActionEvent event){
    	
    	Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
    	Alert errorDatosMascota = new Alert(Alert.AlertType.ERROR);
    	
		Mascota mascota= new Mascota();
		
		mascota.setNombre(idNombreMascota.getText());
		mascota.setEdad(idEdadMascota.getText());
		mascota.setTipoAnimal(tipoAnimCBOX.getValue());
		mascota.setRaza(idRazaMascota.getText());
		mascota.setSintomas(idSintomasMascota.getText());
	
		
		
		List <String> datosMascota = new ArrayList<String>(5);
		List <String> datosMascotaDeafaul = new ArrayList<String>(5);
		
		
		// asignacion datos a las lista datosMascota
		
		if(mascota.getNombre().isEmpty()){
			datosMascota.add("Nombre Mascota Vacio");
		}else {
			datosMascota.add(mascota.getNombre());
			}
	
		if (mascota.getEdad().isEmpty()){
			datosMascota.add("Edad Mascota Vacio");
		}else {
			datosMascota.add(mascota.getNombre());
			}
        		
        if(mascota.getRaza().isEmpty()){
        	datosMascota.add("Raza Mascota Vacio");
		}else {
			datosMascota.add(mascota.getNombre());
			}
        		
        if(mascota.getSintomas().isEmpty()){
        	datosMascota.add("Sintomas Mascota Vacio");
		}else {
			datosMascota.add(mascota.getNombre());
			}  		
	
        
     // asignacion datos a las lista por default
        
        datosMascotaDeafaul.add("Nombre Mascota Vacio");
        datosMascotaDeafaul.add("Edad Mascota Vacio");
        datosMascotaDeafaul.add("Raza Mascota Vacio");
        datosMascotaDeafaul.add("Sintomas Mascota Vacio");
			
        if (datosMascota.equals(datosMascotaDeafaul)) {
        	
        	errorDatosMascota.setHeaderText("No hay imformacion a guardar");
        	errorDatosMascota.setContentText("Por favor diligenciar Todos los Campos");
        	errorDatosMascota.show();

        }else	{
    	dialogoInfo.setHeaderText("Esta es la informacion \nbasica de la mascota" );
    	dialogoInfo.setContentText("Nombre: " + datosMascota.get(0).toUpperCase()
    			+ " \nEdad: " + datosMascota.get(1) + " meses"
    			+ " \nTipo de Animal: " + mascota.getTipoAnimal().toUpperCase()
    			+ " \nRaza: " + datosMascota.get(2).toUpperCase()
    			+ " \nSintomas: " + datosMascota.get(3).toUpperCase() 
    			);


		
		dialogoInfo.setTitle("Informacion de la mascota");
    	dialogoInfo.setResizable(false);
    	dialogoInfo.show();
        }
    }
		
}
