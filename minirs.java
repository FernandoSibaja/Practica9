package Practica9;
public class minirs extends Robot{
    public minirs(){
        super(100, "Robot para servir platos", 4);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-20);
    }
    
    @Override
    public int accion(String accionRealizada){
        setultA(accionRealizada);
        //Accion que el robot tiene que hacer
        return 3;
    }
}