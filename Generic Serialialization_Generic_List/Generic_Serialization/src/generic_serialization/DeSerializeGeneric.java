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
public class DeSerializeGeneric<T>
{

    private String fileName;

    public DeSerializeGeneric(String fileName) 
    {
        super();
        this.fileName = fileName;
    }

    public String getFileName() 
    {
        return fileName;
    }

    public void setFileName(String fileName) 
    {
        this.fileName = fileName;
    }

    public List<T> deserialize()
    {
        System.out.println("\n Reading the file " + fileName + " and calling deserialize().\n ");
        List<T> data = null;
        try 
        {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            data = (List<T>) ois.readObject();

            ois.close();
            fis.close();
        } 
        catch (Exception e) 
        {
        }
        return data;
    }
}
