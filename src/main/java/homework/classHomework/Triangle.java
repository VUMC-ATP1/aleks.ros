package homework.classHomework;

public class Triangle {
    public int First_side;
    public int Second_side;
    public int Third_side;
    public int Triangle_Area;


    public Triangle() {
        System.out.println("Create triangle.");
    }

    public  Triangle(int First_side, int Second_side, int Third_side) {
        this.First_side = First_side;
        this.Second_side = Second_side;
        this.Third_side = Third_side;

        double Semi_Perimeter = (this.First_side + this.Second_side + this.Third_side) / 2.0;
        double area = Math.sqrt(Semi_Perimeter * (Semi_Perimeter - this.First_side) * (Semi_Perimeter - this.Second_side) * (Semi_Perimeter - this.Third_side));
        this.Triangle_Area = (int) area;

}

    public boolean Equilateral() {
        return this.First_side == this.Second_side && this.Second_side == this.Third_side;
    }

    public boolean Isosceles() {
        return this.First_side == this.Second_side || this.Second_side == this.Third_side || this.Third_side == this.First_side;
    }
}


