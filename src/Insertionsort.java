import java.util.Arrays;

// Author: Erick Huerta

public class InsertionSort {

  public static void sort(Comparable[] array) {

    /**
     * Simple1 s=new Simple1(); System.out.println(s instanceof Simple1);//tru
     **/

    if (!(array instanceof Integer[] || array instanceof Snack[])) {
      System.out.println("Error wrong type of array NO PETS");
      return;
    }


    for (int outer = 0; outer < array.length; outer++) {

      int index1 = outer - 1;
      while (index1 >= 0 && array[outer].compareTo(array[index1]) < 0) {
        index1--;
      }

      Comparable temp = array[outer];
      int index2 = outer;

      while (index2 > index1 + 1) {
        array[index2] = array[index2 - 1];
        index2--;
      }
      array[index2] = temp;
      for (int length = 0; length <= outer; length++) {
        System.out.print((array[length]) + " ");
      }
      System.out.println();
    }
  }
}


