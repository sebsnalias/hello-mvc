/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
 

/**
 *
 * @author Sebastián
 */
public class ModelMessage {
    /**
     * Se crean las variables con sus get y set respectivamente
     */
 
    private String message ="Funciona";

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
