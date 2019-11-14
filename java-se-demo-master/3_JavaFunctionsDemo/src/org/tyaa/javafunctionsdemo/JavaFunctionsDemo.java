/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javafunctionsdemo;

/**
 *
 * @author student
 */
public class JavaFunctionsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*printHello();
        printHello();
        printInteger(12);
        // Объявление и одновременно - инициализация
        int resource = 43;
        printInteger(resource);
        printSum(resource, resource);
        // Объявление переменной с именем result и типом int
        int result;
        // Первое присвоение переменной значения - инициализация
        result = calcSum(2, 3);
        // Присвоение переменной нового значения
        result = calcSum(3, 3);
        System.out.println(calcSum(2, 3));
        System.out.println(result);
      
        int sqr = calcSqr(3);
        System.out.println(sqr);
        System.out.println(calcSqr(result));*/
        
        double result1 = foo1();
        System.out.println(result1);
        double result2 = foo2();
        System.out.println(result2);
        double result3 = foo3(result1, result2);
        System.out.println("Result: " + result3);
        //System.out.print("Result: ");
        //System.out.println(result3);
    }
    
    public static void printHello(){
        System.out.println("Hello");
    }
    
    public static void printInteger(int _integer){
        System.out.println(_integer);
    }
    
    public static void printSum(int _x, int _y){
        System.out.println(_x + _y);
    }
    
    public static int calcSum(int _x, int _y){
        return _x + _y;
    }
    
   public static int calcSqr(int _x){
        return _x * _x;
    }  
   
   public static int foo1(){
        return 12 + 5;
    }
    public static int foo2(){
        return 8 * 19;
    }
    public static double foo3(double _x, double _y){
        return (_x/_y)/3.0;
    }
}
