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
public class binarysearchtree {
 
   
    public static void main(String[] args) {
         ArrayList<Integer> tt = new ArrayList<Integer>();
    
          
   
        
        
    tt.add(3);
    tt.add(2);
    tt.add(5);
    tt.add(1);
    tt.add(4);
    
 
    
    if(tt.size()>3 ) {
        System.out.println("This is a search tree");
    } else { 
        System.out.println("This is still a search tree");
    }
    }
}


