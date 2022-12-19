import java.lang.*;
public class cuadrado extends figura{
    double lado;

    public cuadrado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea(){
       area = lado*lado*100;
   }
   @Override
   public void calcularPerimetro(){
       perimetro = lado * 4*100;
   }
}
