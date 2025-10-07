import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(6.1,7);
    Rectangle r2 = new Rectangle(7,6.1);

    boolean lengthSameWidth = r1.getLength() == r2.getWidth();
    boolean widthSameLength = r1.getWidth() == r2.getLength();
    boolean isRotated = lengthSameWidth && widthSameLength;
    //logical AND - &&
    //logical OR -||

    //r1.equals(r2) - want to chek for equality of two objects
    boolean isCongruent = r1.equals(r2) || (isRotated == true);
   
    double lengthRatio = (r1.getLength()) / (r2.getLength());
    double widthRatio = (r1.getWidth()) / (r2.getWidth());
    boolean equalRation = lengthRatio == widthRatio;
    boolean isSimilar = (isCongruent == true) || (equalRation == true);

   
    
  }
}
