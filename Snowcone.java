// Author: Erick Huerta

public class SnowCone extends Snack{

 
  protected String flavor;

  public SnowCone(String name, double weightOunces, String flavor) {
    super(name, weightOunces);
    this.flavor = flavor;
  }

  public String getFlavor(String flavor) {
    return flavor;
  }

  public String toString() {

    String result;

    result = super.toString();
    result +=  "( " + this.flavor + " ) ";
    return result;

  }
}
