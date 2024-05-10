/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generic_serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Joy.A
 */
public class Generic_Class<T> {
    private String fileName;
    private T serData;

    public Generic_Class(String fileName, T serData) {
        this.fileName = fileName;
        this.serData = serData;
    }

   
   public void serialize() {
  FileOutputStream fos = null;
  ObjectOutputStream oos = null;
  
  try {
   fos = new FileOutputStream(fileName);
   oos = new ObjectOutputStream(fos);
   oos.writeObject(serData);
      System.out.println("Sucess  ");
   oos.close();
   fos.close();
  } catch(Exception e) {
  }
 }
}
