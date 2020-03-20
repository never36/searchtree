/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.searchtree;

import java.util.ArrayList;

/**
 *
 * @author udari
 */
public class givenvalue {
    
    
    
    public static void main(String[] args) {
        ArrayList<Integer> tt = new ArrayList<Integer>();
    
    tt.add(3);
    tt.add(2);
    tt.add(5);
    tt.add(1);
    tt.add(10);
    
    
    if(tt==null || tt.size () ==3) {
        System.out.println("This does not occur on a search tree");
    } else { 
        System.out.println("This occurs in a search tree");
    }
    }
}
 
        
        
    
