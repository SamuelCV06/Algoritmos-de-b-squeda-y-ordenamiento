import java.util.Scanner;
public class CrearListas 
{
    private int valores [];
    private Nodo primeroNodo;
    Scanner numeros;
    public CrearListas()
    {
        this.valores = new int[0];
        this.numeros = new Scanner(System.in);
        this.primeroNodo = null;
    }
  
    public void crearListaArrayAlAzar(int totalDigitos)
    {
        this.valores = new int[totalDigitos];
        
        for(int i = 0; i < this.valores.length; i++)
        {
            int valor = (int)(Math.random() * 250);
            this.valores[i] = valor;
        }
    }
    
        public void crearListaArray()
        {
            boolean terminarCiclo = false;
            int respuesta;
            int cantidadDatos = 0;
            while(terminarCiclo == false)
            {
            try
                {
                    if (this.valores.length == 0)
                    {
                        System.out.print("Ingrese el largo de la lista: \n-");
                        respuesta = Integer.parseInt(this.numeros.nextLine());
                        this.valores = new int[respuesta];
                        System.out.println("El largo se ha establecido correctamente");
                    }
                    for(int i = 0; i < this.valores.length; i++)
                    {
                        System.out.print("Ingrese un valor para la lista, (si desea usar la busqueda binaria ingreselos en orden): \n-");
                        respuesta = Integer.parseInt(this.numeros.nextLine());
                        this.valores[i] = respuesta;
                    }
                    System.out.println("El Array se ha establecido correctamente");
                    terminarCiclo = true;
                }
                //Si se introduce un valor no númerico que no sea e dara un error.
                catch(Exception e)
                {
                    System.out.println("Error de ingreso de datos. Debe escoger una valor valido.");
                    terminarCiclo = false;
                }
            }
        }


        public void crearListaNodos()
        {
            boolean terminarCiclo = false;
            int respuesta;
            do
            {
                try
                {
                    System.out.print("Si desea crear una lista de nodos para buscar, creelos en orden numerico\nSi desea utilizar algún algoritmo de ordenamineto creelo en desorden\nIngrese el valor del nodo a agregar: \n-");
                    respuesta = Integer.parseInt(this.numeros.nextLine());
                    if (this.primeroNodo == null)
                    {
                        this.primeroNodo = new Nodo();
                        this.primeroNodo.setValorNodo(respuesta);
                        System.out.println("El valor digitado se ha establecido como primer Nodo");
                    }
                    else
                    {
                        Nodo elComodin = this.primeroNodo;
                        while(elComodin.getSiguiente() != null)
                        {
                            elComodin = elComodin.getSiguiente();
                        }
                        Nodo temporal = new Nodo();
                        temporal.setValorNodo(respuesta);
                        elComodin.setSiguiente(temporal);
                        System.out.println("El valor digitado se ha establecido correctamente");
                    }
                    System.out.print("Desea ingresar otro nodo, presione ENTER para continuar o e para terminar el programa:\n");
                    String terminar = this.numeros.nextLine();
                    if(terminar.equals("e"))
                    {
                        terminarCiclo = true;
                    }
                }
                //Si se introduce un valor no númerico que no sea e dara un error.
                catch(Exception e)
                {
                    System.out.println("Error de ingreso de datos. Debe escoger una valor valido.");
                    terminarCiclo = false;
                    System.out.println("Por favor Ingrese los valores nuevamente");                
                }
            }
            while(terminarCiclo == false);
    }
     
    public void crearListaNodoAlAzar(int totalDigitos)
    {
        Nodo comodin = new Nodo();
        Nodo pivote = null;
        for(int i = 0; i < totalDigitos; i++)
        {
            int valor = (int)(Math.random() * 250);
            if(this.primeroNodo == null)
            {
                this.primeroNodo = new Nodo();
                this.primeroNodo.setValorNodo(valor);
                comodin = this.primeroNodo;
            }
            else
            {
                pivote = new Nodo();
                pivote.setValorNodo(valor);
                comodin.setSiguiente(pivote);
                comodin = comodin.getSiguiente();
            }
        }
    }

    public int[] getLista()
    {
        return this.valores;
    }

    public Nodo getPrimerNodo()
    {
        return this.primeroNodo;
    }

}
