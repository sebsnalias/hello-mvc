/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelMessage;
import views.ViewMessage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sebastián
 */
public class ControllerMessage implements ActionListener {
    /**
     * Se inicializan las variables miembro
     */
    private final ModelMessage modelMessage;
    private final ViewMessage viewMessage;
    /**
     * En esta clase colocamos las variables que van a ser tomadas como parametros
     * 
     * @param viewMessage
     * Variable para acceder a nuestra vista ymodificar sus componentes
     * @param modelMessage 
     * Variable para acceder a nuestro modelo y a sus get y set
     */
    public ControllerMessage(ViewMessage viewMessage, ModelMessage modelMessage){
        this.viewMessage = viewMessage;
        this.modelMessage = modelMessage;
        viewMessage.jbtnHello.addActionListener(this);
        viewMessage.jbtnbye.addActionListener(this);
        initView();
    }
   
    /**
     * En el metodo actionPerformed se colocaran las acciones que se realizan mediante el contacto 
     * con la interfaz, recoge una variable ActionEvent para poder realizar los distintos metodos
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMessage.jbtnHello)
            btnHelloActionPerformed();
        else if(e.getSource()==viewMessage.jbtnbye)
            btnByeActionPerformed();
    }

    /**
     * Metodos de los botones que son llamados en el actionPerformed
     */
    private void btnHelloActionPerformed(){
        modelMessage.setMessage("Hello from MVC");
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }

    private void btnByeActionPerformed(){
        modelMessage.setMessage("Bye from MVC");
        viewMessage.jlMessage.setText(modelMessage.getMessage());
    }

    /**
     * Metodo para inicializar el jForm y que sea visible
     */
    public final void initView(){
        viewMessage.setTitle("Hello MVC");
        viewMessage.setLocationRelativeTo(null);
        viewMessage.jlMessage.setText(modelMessage.getMessage());
        viewMessage.setVisible(true);
    }
}

 