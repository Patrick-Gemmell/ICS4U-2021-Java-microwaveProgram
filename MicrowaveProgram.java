/*
* This function tells the user how long a microwave will
* take to cook select foods depending on the amount..
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-04-26
*/

import java.util.Scanner;

public final class MicrowaveProgram {
   private MicrowaveProgram() {

    }
  /**
   * This function tells the user how long a microwave will
   * take to cook select foods depending on the amount.
   * @param args
   */
  public static void main(final String[] args) {

    // Constants
    final float pizzaCookingTime = 0.75f;
    final float subCookingTime = 1;
    final float soupCookingTime = 1.75f;
    final float time = 0.5f;
    final int totalItems = 3;

    try {
      // Input for the type of food
      Scanner foodInput = new Scanner(System.in);
      System.out.println("Enter the type of food you would like to cook "
                          + "(pizza, sub or soup):");
      String foodChosen = foodInput.nextLine();
      String foodChosenUpperCase = foodChosen.toUpperCase();
      System.out.println();

      // Input for the quantity of food
      Scanner numberInput = new Scanner(System.in);
      System.out.println("Enter how many items you would like to be cooked:");
      int numberOfItems = foodInput.nextInt();
      System.out.println();

      // Process and outputs
      if ((numberOfItems <= totalItems) && (numberOfItems >= 1)) {
        if (foodChosenUpperCase.equals("PIZZA")) {
          // Output time for cooking pizzas
          float cookingTime = pizzaCookingTime
                              + (time * pizzaCookingTime * (numberOfItems - 1));
          System.out.println("Your food will be cooked in "
                              + cookingTime + " minutes.");
        } else if (foodChosenUpperCase.equals("SUB")) {
          // Output time for cooking subs
          float cookingTime = subCookingTime
                              + (time * subCookingTime * (numberOfItems - 1));
          System.out.println("Your food will be cooked in "
                              + cookingTime + " minutes.");
        } else if (foodChosenUpperCase.equals("SOUP")) {
          // Output time for cooking cups of soup
          float cookingTime = soupCookingTime
                              + (time * soupCookingTime * (numberOfItems - 1));
          System.out.println("Your food will be cooked in "
                              + cookingTime + " minutes.");
        } else {
          // Output if input is not one of the three foods
          System.out.println("Invalid food input");
        }
      } else {
        System.out.println("Invalid number of items");
      }
      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    }
  }
}
