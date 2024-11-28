package com.cg.sharvari;

abstract class Food{
    double proteins;
    double fats;
    double carbs;
    int tastyScore;
    
    abstract void getMacroNutrients();
    
    void getTaste(){
        System.out.println("Taste: " + tastyScore);
    }
    
    abstract void getType();
}
 
class Egg extends Food {
    String type = "non-vegetarian";
 
    public Egg(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
        this.tastyScore = 7;  
    }
 
    @Override
    void getMacroNutrients() {
        System.out.println("An egg has " + proteins + " gms of protein, " + fats + " gms of fats and " + carbs + " gms of carbohydrates.");
    }
 
    @Override
    void getType() {
        System.out.println("Egg is " + type);
    }
}
 
class Bread extends Food {
    String type = "vegetarian";
 
    public Bread(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
        this.tastyScore = 8;  // Default tasty score for Bread
    }
 
    @Override
    void getMacroNutrients() {
        System.out.println("A slice of bread has " + proteins + " gms of protein, " + fats + " gms of fats and " + carbs + " gms of carbohydrates.");
    }
 
    @Override
    void getType() {
        System.out.println("Bread is " + type);
    }
}



/*
 * TANAY
 * abstract class Food {
	double proteins;
	double fats;
	double carbs;
	double tastyScore;
	
	public abstract void getMacroNutrients();
}
 
class Egg extends Food {
	public Egg(double proteins, double fats, double carbs) {
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
	}
	int tastyScore = 7;
	String type = "non-vegetarian";
	
	@Override
	public void getMacroNutrients() {
		System.out.println("An egg has"+ this.proteins +
				" gms of proteins,"+ this.fats+ " gms of fats and" + this.carbs + " gms of carbohydrates.");
	}	
}
class Bread extends Food{
	public Bread(double proteins, double fats, double carbs) {
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
	}
	
	int tastyScore = 8;
	String type = "vegetarian";
	
	@Override
	public void getMacroNutrients() {
		System.out.println("A slice of bread has "+ this.proteins +
				" gms of proteins,"+ this.fats+ " gms of fats and" + this.carbs + " gms of carbohydrates.");
	}
}*/
