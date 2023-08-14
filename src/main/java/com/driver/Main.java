package com.driver;

public class Main {
           public static void main(String[]args)
           {
               RWOnly rr=new RWOnly();
              // System.out.println(rr.name="Accio");  // Error:name has private access in com.driver.RWOnly
               rr.setName("Accio");
               System.out.println(rr.getName());
           }
}