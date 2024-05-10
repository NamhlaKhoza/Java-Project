/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generic_serialization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Generic_Serialization
{
//
//    public static <E> void printArray(E[] inputArray) 
//    {
//        int count = 0;
//        for (E element : inputArray) 
//        {
//            System.out.printf("\n inputArray[%d] = %s ", count++, element);
//        }
//        System.out.println("\n");
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
//        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
//        Character[] charArray = {'J', 'A', 'V', 'A'};
//
//        System.out.println("\nInteger Array:");
//        printArray(intArray);
//
//        System.out.println("\nDouble Array:");
//        printArray(doubleArray);
//
//        System.out.println("\nCharacter Array:");
//        printArray(charArray);

        String fileName = "serialization.ser";


//        MyData myData = new MyData("Jiby",30,"SouthFrica");
        MyData myData1 = new MyData("Gavin",4,"India");
       MyData myData2 = new MyData("Millan",3,"America");
       
        List<MyData> my = new ArrayList<MyData>();
        my.add(new MyData("Jiby",30,"SouthFrica"));
       my.add(myData1);
       my.add(myData2);
        
        System.out.println("\n 1. Doing serialization ..");
        System.out.println("--------------------------------");

        //int count=my.size();
        //System.out.println(count);
        String dd="dfd";
//Generic_Class<String> sc;
//sc=new Generic_Class<String>(fileName, dd);
       SerializeGeneric<MyData> sc = new SerializeGeneric<MyData>(fileName,  my);
       sc.serialize();
//
       System.out.println("Serialized Sucessfully");
       System.out.println("--------------------------------");
//
       System.out.println("\n 2. Doing De-serialization ..");
//
        DeSerializeGeneric<MyData> deser_gen = new DeSerializeGeneric<MyData>(fileName);
        List<MyData> new_data = (List) deser_gen.deserialize();
//
          int c = 0;
        while (c < 3)
        {
            //Display using print()
            new_data.get(c).print(c+1);
            //OR
            System.out.println("Name:" + new_data.get(c).getName() + " Age:" + new_data.get(c).getAge() + " Country:" + new_data.get(c).getCountry());
            
            c++;
        }
//        System.out.println("\nDe_Serialized Sucessfully");
      //  sc = new Generic_Class<String>(fileName,  dd);
   }
}
