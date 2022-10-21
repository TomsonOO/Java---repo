
class Circle extends Figure implements Printable {

    int radius;
    double result;

    public Circle(int radius){

        this.radius = radius;
    }

    @Override
    public void printf() {
        System.out.println("Radius: " + this.radius);
    }

    public double calculatedArea(){
        this.result = this.radius * this.radius * 3.14;
        System.out.println("Circle calculated Area: " + this.result);
        return this.result;
    }
    public double calculatePerimeter(){
        this.result = this.radius * 6.28;
        System.out.println("Circle calculated Perimeter: " + this.result);
        return this.result;
    }
}
