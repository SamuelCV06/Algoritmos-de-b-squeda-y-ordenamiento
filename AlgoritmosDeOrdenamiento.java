
import javax.lang.model.element.ElementVisitor;

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
        System.out.print("{");
        for(int e = 0; e < length; e++)
        {
            System.out.print(lista[e]);
            if(e != length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}\n");
    }

    public void ordenarBurbujaLista(Nodo elNodo)
    {
        int contador = 0;
        Nodo comodin = elNodo;
        int variable;
        Nodo punteroUno;
        Nodo punteroDos;

        while(comodin != null)
        {
            contador ++;
            comodin = comodin.getSiguiente();
        }

        for(int i = 0; i < contador; i++)
        {
            punteroUno = elNodo;
            punteroDos = elNodo.getSiguiente();
            for(int j = 0; j < contador - i; j++)
            {
                if(punteroUno.getValorNodo() > punteroDos.getValorNodo())
                {
                variable = punteroUno.getValorNodo();
                punteroUno.setValorNodo(punteroDos.getValorNodo());
                punteroDos.setValorNodo(variable);
                }
                if(punteroDos.getSiguiente() != null)
                {
                    punteroUno = punteroUno.getSiguiente();
                    punteroDos = punteroDos.getSiguiente();
                }
            }
        }

        System.out.print("{");
        for(int e = 0; e < contador; e++)
        {
            if(e == 0)
            {
                comodin = elNodo;
            }
            System.out.print(+ comodin.getValorNodo());
            comodin = comodin.getSiguiente();
            if(e == contador-1)
            {
                System.out.print("}");
            }
            else
            {
                System.out.print(",");

            }
        }
        System.out.println("");
    }


    public void ordenarPorInserciónArray(int [] lista)
    {
        int variable;
        for (int i = 1; i < lista.length; i++) 
        {
            variable = lista[i];
            for(int j = i-1; j >= 0 && lista[j] > variable; j--)
            {
                lista[j+1] = lista[j];
                lista[j] = variable;
            }
        }
        System.out.print("{");
        for(int e = 0; e < lista.length; e++)
        {
            System.out.print(lista[e]);
            if(e != lista.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}\n");
    }

    public void OrdenarPorSeleccion(int [] lista)
    {
        int [] listaOrdenada = new int[lista.length];
        int [] listaDesordenada = lista;
        int [] pivote = new int[lista.length];
        int ubicaciónDelValor = 0;
        int elementoMenor = lista[0];
        for(int i = 0; i < lista.length; i++)
        {
            for(int j = 0; j < listaDesordenada.length; j++)
            {
                if(listaDesordenada[j] < elementoMenor)
                {
                    elementoMenor = lista[j];
                    ubicaciónDelValor = j;
                }
            }
            pivote = listaDesordenada;
            listaDesordenada = new int[pivote.length - 1];
            for(int e = 0; e < pivote.length; e++)
            {
                if(e != ubicaciónDelValor)
                {
                    listaDesordenada[e] = pivote[e]; 
                }
                else
                {
                    e--;
                }
            }
            listaOrdenada[i] = elementoMenor;
            elementoMenor = listaDesordenada[0];
        }
        lista = listaOrdenada;
        System.out.print("{");
        for(int e = 0; e < lista.length; e++)
        {
            System.out.print(lista[e]);
            if(e != lista.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}\n");
    }
}
