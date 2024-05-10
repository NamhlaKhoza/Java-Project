/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package generic_serialization;
import java.io.*;
/**
 *
 * @author User
 */
public class MyData implements Serializable 
{
 private String name;
 private int age;
 private String country;
 
 
 public MyData(String name, int age, String country)
 {
  
  this.name = name;
  this.age = age;
  this.country = country;
 }
 
 public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
  this.name = name;
 }
 public int getAge()
 {
  return age;
 }
 public void setAge(int age)
 {
  this.age = age;
 }
 public String getCountry()
 {
  return country;
 }
 public void setCountry(String country) 
 {
  this.country = country;
 }
 
 public void print(int c) 
 {
    System.out.println("\n[MyData"+c+" ] : " + "Name => "+ name + "  Age => " + age + "  Country => " + country);
 }
 
}

