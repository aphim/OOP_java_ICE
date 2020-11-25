package ca.durhamcollege;
import java.util.Vector;
import java.util.Scanner;


// driver class
public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String prompt = "";

        int numOfPoints =4;
        Vector<Vector2D> points = new Vector<Vector2D>();
        for (int i=0; i < numOfPoints; i++)
        {
            points.add(Vector2D.zero());
        }




        //Vector2D point1 = new Vector2D();
        //System.out.print("Enter the first point (x, y): ");



        for (int i=0; i<3; i+=2)
        {
        System.out.print("Enter the first point (x, y): ");
        prompt = keyboard.nextLine();
        var values = prompt.split(",");
        points.get(i).set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));


        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("You Entered " + points.get(i).toString() + " for the first point" );
        System.out.println("--------------------------------------------------------------\n" );
        //Vector2D point2 =  new Vector2D();
        System.out.print("Enter the second point (x, y): ");

        prompt = keyboard.nextLine();
        values = prompt.split(",");
        points.get(i+1).set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("You Entered " + points.get(i+1).toString() + " for the second point" );
        System.out.println("--------------------------------------------------------------\n" );

        System.out.printf("Magnitude of first point is: %.3f \n", points.get(i).getMagnitude());
        System.out.printf("Magnitude of second point is: %.3f \n",points.get(i+1).getMagnitude());
        System.out.printf("Distance between first point and second point is: %.3f \n", Vector2D.distance(points.get(i), points.get(i+1)));
        System.out.println("--------------------------------------------------------------\n" );

    Vector2D randomVector2D = RandomVector.Instance().createVector2D(points.get(i), points.get(i+1));
        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("The random vector is: " + randomVector2D.toString());
        System.out.println("--------------------------------------------------------------\n");

        points.add(randomVector2D);
    //keyboard.reset();
        }
        System.out.printf("Magnitude of first point is: %.3f \n", points.get(4).getMagnitude());
        System.out.printf("Magnitude of second point is: %.3f \n",points.get(5).getMagnitude());
        System.out.printf("Distance between first point and second point is: %.3f \n", Vector2D.distance(points.get(4), points.get(5)));
        System.out.println("--------------------------------------------------------------\n" );

    }
}
