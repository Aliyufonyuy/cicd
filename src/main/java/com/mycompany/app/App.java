package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        int count = 0;
        while (count++ < 50) {
            Thread.sleep(2000);
            System.out.println("Application Heart beat");
        }
    }
}
