package org.chocolate;

/**
 * Hello world!
 *
 */
public class SingletonClient
{
    public static void main( String[] args )
    {

        Singleton sing = Singleton.getInstance();
        Chocolate singleton = Chocolate.INSTANCE;


        System.out.println( "Hello World!" );
    }
}
