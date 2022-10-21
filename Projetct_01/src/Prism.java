


class Prism extends Figure implements Printable {
    Figure base;
    int height;
    double result;

    public Prism(Figure base, int height){
        this.height = height;
        this.base = base;
    }
    @Override
    public void printf() {
        System.out.println("height: " + this.height);
    }

    public double calculatedArea(){
        this.result = base.calculatePerimeter() * this.height + 2 * base.calculatedArea();
        System.out.println("Prism calculated Area: " + this.result);
        return this.result;
    }
    public double calculatePerimeter(){
        System.out.println("Nope");
        return 0;
    }

    public double volume(){
        this.result = base.calculatedArea() * this.height;
        System.out.println("Prism calculated volume: " + this.result);
        return this.result;
    }


}
