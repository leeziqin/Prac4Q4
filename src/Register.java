/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Register {
    private static int count = 1001;
    
    private int regNo;
    private Owner owner;
    private Car1 car;
    
    public Register(Owner owner, Car1 car){
        this.owner = owner;
        this.car = car;
        this.regNo = count;
        count++;
    }

    public static int getCount() {
        return count;
    }
    
    public String toString(){
        return String.format("%6d %s %s", regNo, owner.toString(), car.toString());
    }
}
