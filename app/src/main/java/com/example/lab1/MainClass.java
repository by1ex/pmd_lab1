package com.example.lab1;
/**
 * Главный класс с методами <b>Min</b> и <b>Max</b>.
 * @autor Алексей Злобин
 * @version 1.0
 */
public abstract  class MainClass {
    /**
     * Метод определения минимального числа
     * @param a - первое число
     * @param b - второе число
     * @return возвращает минимальное из двух чисел
     */
    public static int Min(int a, int b){
        if(a < b) return a;
        return b;
    }
    /**
     * Метод определения максимального числа
     * @param a - первое число
     * @param b - второе число
     * @return возвращает максимальное из двух чисел
     */
    public static int Max(int a, int b){
        if(a > b) return a;
        return b;
    }
}