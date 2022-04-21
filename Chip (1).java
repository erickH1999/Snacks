// Author Erick Huerta

public class Chip extends Snack {


  private boolean gluten;

  public Chip(String name, double weightOunces, boolean gluten) {
    super(name, weightOunces);
    this.gluten = gluten;
  }


  public boolean containsGluten() {
    return gluten;
  }



  // Should return the name, weight, and whether or not it contains gluten
  public String toString() {

    String result;

    // to call the toString of the parent class (Snack.java)
    result = super.toString();
    if (this.gluten) {
      result += "(Contains Gluten!!!)";
    } else {
      result += "(Gluten Free)";
    }

    // result = "The chip IS: " + this.name + this.weightOunces + "<has gluten>";

    // result += "The OTHER chip is: :" + this.name + this.weightOunces + "HAS NO GLUTEN";

    return result;
  }
}

