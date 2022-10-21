
class Triangle extends Figure implements Printable {

    int a, b, c;
    double result;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void printf() {
        System.out.println("a: " + this.a + "%nb: " + this.b + "%c: " + this.c);
    }

    public double calculatedArea(){

        double p = (this.a + this.b + this.c) / 2;

        this.result =  Math.sqrt( p*(p-a)*(p-b)*(p-c) );
        System.out.println("Triangle calculated Area: " + this.result);

        return this.result;
    }
    public double calculatePerimeter(){
        this.result = this.a + this.b + this.c;
        System.out.println("Triangle calculated Perimeter: " + this.result);
        return this.result;
    }
}
