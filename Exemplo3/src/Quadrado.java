public class Quadrado extends Forma {
    private float base;
    public float getBase(){
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public Quadrado(float base){
        this.base = base;
    }
    public float area(){
        return base*base;
    }
    public void mostra(){
        System.out.println("Base: "+base+"\nArea: "+ area() +"\nPerimetro: "+perimetro());
    }
    public float perimetro(){
        return base*4;
    }
}
