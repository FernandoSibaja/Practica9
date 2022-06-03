package Practica9;

import java.util.Scanner;
public class Cocina {
    public Robot[] Bots = new Robot[6];
    public String[] listaDeAcciones;
    public int accionActual;
    public int accionCorrecta;
    public int comidaActual;
    public int botActual;
    public int[] acciones;
    public boolean salida;
    boolean salir = false;


    private void setAccionCorrecta(int accionCorrecta){
        this.accionCorrecta = accionCorrecta;
    }
    
    private void setAccionActual(int accionActual){
        this.accionActual = accionActual;
    }

    private void setComidaActual(int comidaActual){
        this.comidaActual = comidaActual;
    }

    public boolean revisarAccion(){
        return accionCorrecta == acciones[accionCorrecta-1];
    }

    public boolean revisarOrden(){
        return accionActual == accionCorrecta;
    }

    public boolean revisarComida(int revision){
        return revision == comidaActual;
    }
    
    public Cocina(){
        Bots[0] = new MiniRobotCuchillos();
        Bots[1] = new minird();
        Bots[2] = new MiniRobotComidas();
        Bots[3] = new minirc();
        Bots[4] = new minirs();
        Bots[5] = new MagnumOpus();

        setAccionCorrecta(1);
        setAccionActual(0);
        setComidaActual(0);
        
        botActual = 0;
        salida = true;
        acciones = new int[3]; 
        listaDeAcciones = new String[3];
        listaDeAcciones[0] = "Corto ingredientes";
        listaDeAcciones[1] = "Cocino comida";
        listaDeAcciones[2] = "Sirvio comida";
    }

    public void Cocinando(){

        while(!salir){
            comidaActual = desplegarMenu();
       
        infoBots();
        

        System.out.println("Empezaremos a cocinar.\n");
        System.out.println("1)Cortar los ingredientes");
        System.out.println("2)Cocinar la comida");
        System.out.println("3)Servir la comida");
        
        do{
            accionActual = captura.Entero("Selecciona el paso");
            botActual = captura.Entero("Selecciona el robot que quieres que realice la tarea");
            acciones[accionCorrecta-1] = Bots[botActual].accion(listaDeAcciones[accionActual-1]);

            //seleccionar al bot con el indice de robots, y restar la bateria de ese robot
            Bots[botActual].restarBateria();
            
            if (accionCorrecta == 2){

                switch (botActual){ 
                    
                    case 1 -> salida = revisarComida(1);
                    case 2 -> salida = revisarComida(2);
                    case 3 -> salida = revisarComida(3);
                    case 5 -> salida = true; 
                    default -> salida = false; //LOS OTROS BOTS NO TIENEN LA CAPACIDAD DE COCINAR
                }

                if(!salida){
                    System.out.println("El robot que seleccionaste no pudo cocinar lo que pediste.");
                }
            }
            if(botActual!=5){

                if(!revisarAccion()){
                    salida = false;
                    System.out.println("El robot que seleccionaste no pudo cocinar lo que pediste.");
                }
                if(!revisarOrden()){
                    salida = false;
                    System.out.println("Realizaste alguna accion en el orden incorrecto");
                    }
            }

        accionCorrecta++;

        }while(accionCorrecta<=3 && salida);
        
        if(salida){
            System.out.println("¡Hurra! El plato estaba delicioso");
        }
        }
    }



    

    public int desplegarMenu(){
        
        System.out.println("Lista de opciones:");
        System.out.println("1)Desayuno\n2)Comida\n3)Cena\n4)salir\n");
        return captura.Entero("Selecciona una opcion");
    }

    public void infoBots(){
        System.out.println("\nEstos son los Bots disponibles por el momento");

        for(int i=0; i<6; i++){
            //pasar por cada indice de los bots e imprimir cada uno
            Bots[i].imprimeBot();
        }
    }

    public class captura {
        public static String String(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.next());
        }
    
        public static int Entero(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.nextInt());
        }
    
        public static float cFloat(String captura){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n"+ captura + ": ");
            return (scan.nextFloat());
        }
    }
}
