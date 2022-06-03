package Practica9;
public class MiniRobotComidas extends Robot implements MiniRobots{
    
    public MiniRobotComidas(){
        super(100, "Robot para comidas", 2);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-20);
    }
    
    @Override
    public int accion(String accionRealizada){
        setultA(accionRealizada);
        //Accion que el robot tiene que realizar
        return 2;
    }

    @Override
    public int especialidad(){
        //2 para comidas
        return 2; 
    }
}