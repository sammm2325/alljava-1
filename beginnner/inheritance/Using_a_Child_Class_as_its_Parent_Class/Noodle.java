package inheritance.Using_a_Child_Class_as_its_Parent_Class;

class Noodle {
  
    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";
    
    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
      
      this.lengthInCentimeters = lenInCent;
      this.widthInCentimeters = wthInCent;
      this.shape = shp;
      this.ingredients = ingr;
      
    }
    
    public void cook() {
      
      this.texture = "cooked";
      
    }
    
  }
