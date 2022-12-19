import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner lectura = new Scanner(System.in);
        int op = -1;
        while(op != 0){
            System.out.println("MENU");
            System.out.println("1.- CUADRADO");
            System.out.println("2.- CIRCULO");
            System.out.println("3.- TRIANGULO");
            System.out.print("Ingrese la opcion que desea: ");
            op = lectura.nextInt();
            switch (op){
                case 1:
                {
                    System.out.println("Ingrese el valor del clado del cuadrado: ");
                    double longitudLado = lectura.nextDouble();
                    cuadrado miCuadrado = new cuadrado(longitudLado);
                    System.out.println(miCuadrado.getArea());
                    System.out.println(miCuadrado.getPerimetro());
                }
                break;
                case 2:
                {
                    System.out.println("Ingrese la base del rectangulo: ");
                    double longitudBase = lectura.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo: ");
                    double longitudAltura = lectura.nextDouble();
                    rectangulo miRectangulo = new rectangulo(longitudBase,longitudAltura);
                }
                break;
                case 3:
                {
                    System.out.println("Ingrese la base del triangulo: ");
                    double longitudBaseTriangulo = lectura.nextDouble();
                    System.out.println("Ingrese la altura del triangulo: ");
                    double longitudAlturaTriangulo = lectura.nextDouble();
                    System.out.println("Ingrese el lado 1 del triangulo: ");
                    double longitudLado1Triangulo = lectura.nextDouble();
                    System.out.println("Ingrese el lado 2 del triangulo: ");
                    double longitudLado2Triangulo = lectura.nextDouble();
                    triangulo miTriangulo = new triangulo(longitudBaseTriangulo, longitudAlturaTriangulo, longitudLado1Triangulo, longitudLado2Triangulo);
                    System.out.println("DATOS DEL TRIANGULO");
                    System.out.println("La area del triangulo es: "+miTriangulo.calculoDelArea());
                    System.out.println("El perimetro del triangulo es: "+miTriangulo.calculoDelPerimetro());
                }
            }
        }

    }
}