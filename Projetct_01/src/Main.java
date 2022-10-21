import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // allow user to choose option
        System.out.println("Choose Option 1-4\n 1 - triangle \n 2 - square \n 3 - circle\n 4 - Prism\n 5 - exit\n");
        String option = myObj.nextLine();  // Read user input

        int optionInt = Integer.parseInt(option);

        switch(optionInt) {
            case 1:
                triangleInput();
                break;
            case 2:
                squareInput();
                break;
            case 3:
                circleInput();
                break;
            case 4:
                Scanner choice = new Scanner(System.in);
                System.out.println("Choose base 1-4\n 1 - triangle \n 2 - square \n 3 - circle\n 4 - exit\n");
                String choice2 = choice.nextLine();
                int choice3 = Integer.parseInt(choice2);

                switch(choice3) {
                    case 1:
                        prismTriangleInput();
                        break;
                    case 2:
                        prismSquareInput();
                        break;
                    case 3:
                        prismCircleInput();
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
    }
    public static void triangleInput (){
        System.out.println("Triangle \n provide values (separated by space): ");

        Scanner triangleValues = new Scanner(System.in);
        String triangleInputs = triangleValues.nextLine();
        String[] triangleNumbers = triangleInputs.split(" ");

        int triangle_a =  Integer.parseInt(triangleNumbers[0]);
        int triangle_b =  Integer.parseInt(triangleNumbers[1]);
        int triangle_c =  Integer.parseInt(triangleNumbers[2]);

        Triangle UserTriangle = new Triangle(triangle_a, triangle_b, triangle_c);

        UserTriangle.calculatedArea();
        UserTriangle.calculatePerimeter();
    }

    public static void squareInput (){
        System.out.println("Square \n provide value: ");

        Scanner squareValues = new Scanner(System.in);
        String squareInputs = squareValues.nextLine();

        int square_a =  Integer.parseInt(squareInputs);

        Square UserSquare = new Square(square_a);

        UserSquare.calculatedArea();
        UserSquare.calculatePerimeter();
    }

    public static void circleInput (){
        System.out.println("Circle \n provide value: ");

        Scanner circleValues = new Scanner(System.in);
        String circleInputs = circleValues.nextLine();

        int circle_r =  Integer.parseInt(circleInputs);

        Circle UserCircle = new Circle(circle_r);

        UserCircle.calculatedArea();
        UserCircle.calculatePerimeter();
    }

  public static void prismTriangleInput (){
        System.out.println(" \n Provide values (separated by space): ");

        Scanner triangleValues = new Scanner(System.in);
        String triangleInputs = triangleValues.nextLine();
        String[] triangleNumbers = triangleInputs.split(" ");

        int triangle_a =  Integer.parseInt(triangleNumbers[0]);
        int triangle_b =  Integer.parseInt(triangleNumbers[1]);
        int triangle_c =  Integer.parseInt(triangleNumbers[2]);
        int height     = Integer.parseInt(triangleNumbers[3]);

        Triangle UserTriangle = new Triangle(triangle_a, triangle_b, triangle_c);

        Prism UserPrism = new Prism(UserTriangle, height);
        UserPrism.calculatedArea();
        UserPrism.volume();
  }

    public static void prismSquareInput (){
        System.out.println("\nProvide values (separated by space): ");

        Scanner squareValues = new Scanner(System.in);
        String squareInputs = squareValues.nextLine();
        String[] squareNumbers = squareInputs.split(" ");

        int square_a =  Integer.parseInt(squareNumbers[0]);
        int height     = Integer.parseInt(squareNumbers[1]);

        Square UserSquare = new Square(square_a);

        Prism UserPrism = new Prism(UserSquare, height);
        UserPrism.calculatedArea();
        UserPrism.volume();
    }

    public static void prismCircleInput (){
        System.out.println("\n Provide values (separated by space): ");

        Scanner circleValues = new Scanner(System.in);
        String circleInputs = circleValues.nextLine();
        String[] circleNumbers = circleInputs.split(" ");


        int circle_r =  Integer.parseInt(circleNumbers[0]);
        int height =  Integer.parseInt(circleNumbers[1]);

        Circle UserCircle = new Circle(circle_r);

        Prism UserPrism = new Prism(UserCircle, height);
        UserPrism.calculatedArea();
        UserPrism.volume();
    }
}