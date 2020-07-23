/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Owner {
    private String name;
    private String icnumber;
    
    public Owner(String name, String icNo){
        this.name = name;
        this.icnumber = icNo;
    }
    
    public String toString(){
        return String.format("%-15s %-15s", name, icnumber);
    }
}
