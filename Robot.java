package Practica9;
public abstract class Robot {

    public float bateria;
    public String nombre, ultA;
    public int id;

    public Robot(float bateria, String nombre, int id){
        setBateria(bateria);
        setNombre(nombre);
        setid(id);
        setultA("Aun no ha realizado ninguna accion");
    }
    
    public abstract void restarBateria(); //cada robot tendra un nivel diferente de bateria en que se gasta
    public abstract int accion(String x);

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }
    private float getBateria() {
        return this.bateria;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String getNombre() {
        return this.nombre;
    }

    public void setultA(String ultA) {
        this.ultA = ultA;
    }
    private String getultA() {
        return this.ultA;
    }

    private void setid(int id) {
        this.id = id;
    }
    private int getid() {
        return this.id;
    }
    
    public void imprimeBot(){
        System.out.println("Identificador: " + getid());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ultima accion realizada por el robot: " + getultA());
        System.out.println("Bateria restante: " + getBateria());
        System.out.println("\n");
    }


}