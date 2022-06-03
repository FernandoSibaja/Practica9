package Practica9;

public class MiniRobotCuchillos extends Robot{
    
    public MiniRobotCuchillos(){
        super(100, "Robot de cuchillos", 0);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-15);
    }
    
    @Override
    public int accion(String accionRealizada){
        setultA(accionRealizada);
        //Accion que debe realizar 
        return 1; 
    }
}