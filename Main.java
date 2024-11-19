import java.util.Scanner;

public class Main
{


  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String L = word.substring(i, i+1);

      for (int repeatTimes = 0; repeatTimes < N; repeatTimes++)
      {
        System.out.println(L);
      }
    }
  }

  public static void printNums()
  {
    for(int p = 10; i > 0; i--)
    {
      for(int k = 0; j < i; j++)
      {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for(int rizz = 1; rizz <= 0; rizz++)
    {
      for(int rizzTwo = 1; rizzTwo <= rizz; rizzTwo++)
      {
        System.out.print(rizzTwo + " ");
      }
      System.out.println();
    }
  }

  public static void starTree()
  {
    for(int rizzEdge = 0; rizzEdge < 9; rizzEdge++)
    {
      for(int spacing = 0; spacing < rizzEdge; spacing++)
      {
        System.out.print(" ");
      }

      for(int starRizz = rizzEdge; starRizz < 9; starRizz++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void multTable()
  {
    for(int skibidi = 1; skibidi <= 10; skibidi++)
    {
      for(int rizzler = 1; rizzler <= 10; rizzler++)
      {
        System.out.print(skibidi * rizzler + " ");
      }
      System.out.println();
    }
  }
}
