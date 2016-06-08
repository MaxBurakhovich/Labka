
import java.util.Scanner;

public class coordinate {
    public int X;
    public int Y;

    public void coordinateSetter(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }
    public void ReadCoordinates()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату Х: ");
        X = in.nextInt();
        System.out.println("Введите координату Y: ");
        Y = in.nextInt();

        coordinateSetter(X, Y);

    }

}
