package main;
import models.ModelMessage;
import views.ViewMessage;
import controllers.ControllerMessage;
/**
 *
 * @author Sebastián
 */
public class Main {
    /**
     * creacion de las variables miembro
     */
    private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;
    /**
     * Se crean los constructores que van a llamar a las clases en esta clase Main
     */
    public static void main(String[] args) {
        viewMessage = new ViewMessage();
        modelMessage =  new ModelMessage();
        controllerMessage =new ControllerMessage(viewMessage, modelMessage);
        
    }
    
}
