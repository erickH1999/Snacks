// Author Erick Huerta


public class Snack implements Comparable<Snack> {

    protected String name;
    protected double weightOunces;
  
    public Snack(String name, double weightOunces) {
      this.name = name;
      this.weightOunces = weightOunces;
    }
  
    public String getName(String name) {
      return name;
    }
  
    public double getWeightOunces(double weightOunces) {
      return weightOunces;
    }
  
  
    public String toString() {
  
      String result;
      result = this.name + "( " + this.weightOunces + " )";
  
      return result;
  
    }
  
    // use the compareTo method based on the following :
    /**
     * Snacks should be alphabetic order by name, if two names are the same the order is lowest weight
     * first, if both name and weight are the same then the snacks are equal in terms of order
     **/
  
  
    public int compareTo(Snack testsnack) {
  
      if ((this.name.compareToIgnoreCase(testsnack.name)) < 0) {
        return -1;
      } else if ((this.name.compareToIgnoreCase(testsnack.name)) > 0) {
        return 1;
      }
  
      else {
  
        if ((this.weightOunces < (testsnack.weightOunces))) {
          return -1;
        }
  
        else if ((this.weightOunces > (testsnack.weightOunces))) {
          return 1;
        } else {
          return 0;
        }
      }
  
    }
  
  }
  