package Practica9;

public class MagnumOpus extends Robot{
    public MagnumOpus(){
        super(100, "Magnum Opus", 5);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-25);
    }

    @Override
    public int accion(String accionRealizada){
        setultA(accionRealizada);
        return 1000; 
    }
}
