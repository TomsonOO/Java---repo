
 class Square extends Figure implements Printable  {
    int a;
    int result;
    public Square(int a)
    {
        this.a = a;
    }

    @Override
    public void printf() {
        System.out.println("a: " + this.a);
    }
     public double calculatedArea(){
         this.result = this.a * this.a;
         System.out.println("Square calculated Area: " + this.result);
         return this.result;
     }
     public double calculatePerimeter(){
         this.result = 4 * this.a;
         System.out.println("Square calculated Perimeter: " + this.result);
         return this.result;
     }

}
