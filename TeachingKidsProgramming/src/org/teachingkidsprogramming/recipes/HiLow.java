package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

import com.spun.util.NumberUtils;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int correctNumber = NumberUtils.getRandomInt(1, 100);
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
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
      else if (guess < correctNumber)
      {
        MessageBox.showMessage("Too Low!");
      }
      MessageBox.showMessage("You Lost!");
    }
  }
}
