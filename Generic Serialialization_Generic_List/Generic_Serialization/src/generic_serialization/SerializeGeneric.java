/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generic_serialization;
import java.io.*;
import java.util.List;
/**
 *
 * @author User
 */
public class SerializeGeneric<T>{
    private String fileName;
    private List<T> serData;
   
 
 public SerializeGeneric(String fileName,List<T> serData) {
 // super();
  this.fileName = fileName;
  this.serData = serData;
  
 }


 
 
 public void serialize() {
  FileOutputStream fos = null;
  ObjectOutputStream oos = null;
  
  try {
   fos = new FileOutputStream(getFileName());
   oos = new ObjectOutputStream(fos);
   oos.writeObject(getSerData());
      System.out.println("Sucess  ");
   oos.close();
   fos.close();
  } catch(Exception e) {
  }
 }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the serData
     */
    public List<T> getSerData() {
        return serData;
    }

    /**
     * @param serData the serData to set
     */
    public void setSerData(List<T> serData) {
        this.serData = serData;
    }

    
    
}
