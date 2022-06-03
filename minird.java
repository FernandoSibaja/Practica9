package Practica9;

public class minird extends Robot implements MiniRobots {
    
    public minird(){
        super(100, "Robot para los desayunos", 1);
    }
    
    @Override
    public void restarBateria(){
        setBateria(bateria-20);
    }
    
    @Override
    public int accion(String accionRealizada){
        setultA(accionRealizada);
            return 2; 
    }

    @Override
    public int especialidad(){
        //1 para desayunos
        return 1;
    }
}
