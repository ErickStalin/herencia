public class rectangulo extends figura{
    private double base;
    private double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
        calculoDelPerimetro();
    }
    @Override
    public void calcularArea(){area=base*altura;}
    public void calcularPerimetro(){perimetro = base*2+altura*2;}
}
