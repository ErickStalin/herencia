public abstract class figura {
    int x,y;
    double perimetro, area;

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double calculoDelPerimetro(){
        return 2*x+2*y;
    }
    public double calculoDelArea(){
        return x*y;
    }
    public double getPerimetro(){
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public abstract void calcularArea(double base, double altura);

    public abstract void calcularPerimetro(double lado1, double lado2, double base);
}

