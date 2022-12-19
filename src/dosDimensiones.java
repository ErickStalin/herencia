public class dosDimensiones {
    private double base;
    private double altura;
    dosDimensiones(){
        base=altura=0.0;
    }
    dosDimensiones(double a, double b){
        base = b;
        altura = b;
    }
    dosDimensiones(double x){
        base=altura=x;
    }
    double getBase(){return base;}
    double getAltura(){return altura;}
    void setBase(double b){base = b;}
    void setAltura(double h){altura = h;}
    void mostrarDimension(){
        System.out.println("La base es: "+base+" y la altura es: "+altura );
    }

}
