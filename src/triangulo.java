public abstract class triangulo extends figura{
    private double base;
    private double altura;
    double lado1;
    double lado2;

    public triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    public void calcularArea(double base, double altura){area = base*altura/2;}
    @Override
    public void calcularPerimetro(double lado1, double lado2, double base){perimetro = lado1+lado2+base;}
}
