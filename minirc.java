package Practica9;

public class minirc extends Robot implements MiniRobots{
    public minirc(){
        super(100, "Robot para cenas", 3);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-20);
    }
    
    @Override
    public int accion(String accionRealizada){
        setultA(accionRealizada);
        //La accion que el robot tiene que hacer
        return 2;
    }
    
    @Override
    public int especialidad(){    
        //3 para cenas
        return 3;
    }
}
