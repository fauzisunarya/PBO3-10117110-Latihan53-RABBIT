
package pbo3.pkg10117110.latihan53.rabbit;

public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;
    
    
    public Animal(String name, boolean veg, String food, int legs, String color){
        this.vegetarian = veg;
        this.eats = food;
        this.noOflegs = legs;
 
        
    }

    public String getEats() {
        return eats;
    }

    public int getNoOflegs() {
        return noOflegs;
    }
    
    
    
}
