/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryinventory;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sbc-student
 */
public class Catalogue {

   private final static Map<String, Books> BookMap = new HashMap<>();
//static out
   static {
   BookMap.put("Books1", new Books("Wimpy kid", "paul sian"));
   BookMap.put("Books2", new Books("Titanic", "Jack and rose"));
  
   }

   public static Books getBooks(String Books) {
       return BookMap.get(Books);
   
   }
}
