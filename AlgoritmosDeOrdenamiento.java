public class AlgoritmosDeOrdenamiento 
{
    public AlgoritmosDeOrdenamiento()
    {

    }
    
    public void ordenarBurbujaArray(int [] lista)
    {
        boolean terminarBucle = false;
        int length = lista.length;
        int pivote = 0;
        while(terminarBucle == false)
        {
            int finallizar = 0;
            for(int i = 0; i < length; i++)
            {
                if(i+1 < length && lista[i] > lista[i+1])
                {
                    pivote = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = pivote;
                    finallizar++;
                }
            }
            if (finallizar == 0)
            {
                terminarBucle = true;
            }
        }
        System.err.print("{");
        for(int e = 0; e < length; e++)
        {
            System.out.print(lista[e]);
            if(e != length-1)
            {
                System.out.print(",");
            }
        }
        System.err.print("}\n");
    }

    /* No logre hacer que funcione.
    public void ordenarBurbujaLista(Nodo elNodo, int cuantosNodos)
    {
        boolean terminarBucle = false;
        Nodo comodin = null;
        Nodo comodinSegundo = null;
        while(terminarBucle == false)
        {
            Nodo pivote = elNodo;
            int finallizar = 0;
            do
            {   
                if(pivote.getSiguiente() != null && pivote.getValorNodo() > pivote.getSiguiente().getValorNodo() )
                {
                    comodin = pivote;
                    comodinSegundo = pivote.getSiguiente().getSiguiente();
                    pivote = pivote.getSiguiente();
                    pivote.setSiguiente(comodin);
                    comodin.setSiguiente(comodinSegundo);
                    finallizar++;
                }
                if(pivote.getSiguiente() != null)
                {
                    pivote = pivote.getSiguiente();
                }
            }
            while(pivote.getSiguiente() != null);
            if (finallizar == 0)
            {
                Nodo otro = elNodo;
                System.err.print("{");
                for(int e = 0; e < cuantosNodos; e++)
                {
                    if(otro != null)
                    {
                        System.out.print(otro.getValorNodo());
                        if(e != cuantosNodos-1)
                        {
                            System.out.print(",");
                        }
                        if(otro.getSiguiente() != null)
                        {
                            otro = otro.getSiguiente();
                        }
                    }
                }
                System.out.print("}\n");
                terminarBucle = true;
            }
            else
            {
                ordenarBurbujaLista(elNodo, cuantosNodos);
            }
        }
    }
    */
}
