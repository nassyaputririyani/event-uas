/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andriawan.event_tix.utils;

/**
 *
 * @author naufalfawwaz
 */
public class NumberFormatter {
    
    public static String formatCurrency(int number) {
        return String.format("Rp%,.2f", number * 1.0);
    }
} 
