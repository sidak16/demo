package com.testing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
            App app = new App();
            int add = app.sum(10, 20);
            System.out.println( "Addition : "+add);
        }
     
        public int sum(int a, int b){
            return a+b;
        }
    }
