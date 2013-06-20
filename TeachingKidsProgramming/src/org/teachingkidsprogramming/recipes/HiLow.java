package org.teachingkidsprogramming.recipes;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int correctNumber = new Random().nextInt(100);
    int numberofGuesses = 8;
    for (int i = 1; i <= numberofGuesses; i++)
    {
      int ChancesLeft = numberofGuesses + 1 - i;
      int guess = MessageBox.askForNumericalInput("Guess a number ( " + ChancesLeft + " left)");
      if (guess < 1 || 100 < guess)
        MessageBox.showMessage("Your choice, " + guess + "," + " is not between 1 and 100");
      if (guess == correctNumber)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You Won!");
        System.exit(0);
      }
      else if (guess > correctNumber)
      {
        MessageBox.showMessage("Too High!");
      }
      else
      {
        MessageBox.showMessage("Too Low!");
      }
    }
    MessageBox.showMessage("You Lost, the correct number was " + correctNumber);
  }
}
