/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GSILabs.persistence;

/**
 *
 * @author Alex
 */
public class XMLParsingException extends Exception{
    
    private String errorMessage;
    private String fileName;
    
    /**
     *
     * @param localizedError
     * @param errorMessage
     */
    public XMLParsingException(String errorMessage){
        this.errorMessage = errorMessage;
        this.fileName = null;
    }
    
    /**
     *
     * @param errorMessage
     * @param fileName
     */
    public XMLParsingException(String errorMessage, String fileName){
        this.errorMessage = errorMessage;
        this.fileName = fileName;
    }
    
    @Override
    public String getMessage(){
        return "El objeto contenido en el código XML no ha podido ser deserializado por la siguiente razón\n" + errorMessage;
    }
    
    public String getFileNameDescription(){
        return "El fichero donde se ha producido el error es: " + fileName;
    }
    
    public String getFileName(){
        return fileName;
    }
    
}
