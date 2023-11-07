/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryinventory;

/**
 *
 * @author sbc-student
 */
public class Patron {
    public String patronIDnum;
    public String patronName;
    public String patronContactNum;

    public Patron(String patronIDnum, String patronName, String patronContactNum) {
        this.patronIDnum = patronIDnum;
        this.patronName = patronName;
        this.patronContactNum = patronContactNum;
    }

    @Override
    public String toString() {
        return "Patron{" + "patronIDnum=" + patronIDnum + ", patronName=" + patronName + ", patronContactNum=" + patronContactNum + '}';
    }

            
            
}
