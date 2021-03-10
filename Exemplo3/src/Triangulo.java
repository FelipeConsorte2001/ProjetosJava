public class Triangulo extends Forma {
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);

    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float area(){
        return (base*altura)/2;
    }
    public void mostra(){
        System.out.println("Base: "+base+"\nArea: "+ area() +"\nAltura: "+ altura);
    }

}
