
package co.uptc.vet.view;

import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Prueba_ventanas extends Application {
    private Stage mainStage;
    private Group mainScene;
    
    public static String marco ="/co/uptc/vet/gui/frame.fxml";
    public static String ventana1 = "/co/uptc/vet/gui/principal.fxml";
    public static String ventana2 = "/co/uptc/vet/gui/secundaria.fxml";
    
    @Override
    public void start(Stage stage) throws Exception {
        Group root= new Group();
        this.mainStage=stage;
        this.mainScene=root;
        this.cargarVentana(ventana1);
        this.cargarVentana(marco);
        Scene scene = new Scene(root);
       
        stage.setTitle("Aplicaion veterinaria");
        stage.setScene(scene);
        stage.show();
    }




    
    public Stage getMainStage(){
        return mainStage;
    }
  
    public boolean cargarVentana(String archivoFXML){
            try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(archivoFXML));
            AnchorPane screen = (AnchorPane) myLoader.load();
            
            
                if (marco.equals(archivoFXML) || mainScene.getChildren().isEmpty()) {
                    mainScene.getChildren().add(screen);
                }
                else{
                    mainScene.getChildren().remove(0);
                    mainScene.getChildren().add(0,screen);
                } 
            ScreenControlable myScreenControler = ((ScreenControlable) myLoader.getController());
            myScreenControler.setMainApp(this);

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}