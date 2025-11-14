

public class AlgoritmosDeBusqueda 
{
    private int cantidadDeNodos;
    public AlgoritmosDeBusqueda()
    {
        this.cantidadDeNodos = 0;
    }

    public void busquedaSecuencialArray(int númeroBuscado, int lalista[])
    {
        boolean seEncontro = false;
        for(int i = 0; i < lalista.length; i++)
        {
            if(lalista[i] == númeroBuscado)
            {
                System.out.println("El valor " + númeroBuscado + " fue encontrado en la posición " + i + " de la lista");
                seEncontro = true;
            }
        }
        if(seEncontro == false)
        {
            System.out.println("El valor no se encuentra en la lista");
        }
    }
    

    public void buscarNodo(Nodo pivote, int valorBuscado)
    {
        int dondeEstoy = 0;
        busquedaSecuencialLista(pivote, valorBuscado, dondeEstoy);
    }

    public void busquedaSecuencialLista(Nodo pivote, int valorBuscado, int ubicaciónDelValor)
    {
        if(pivote.getValorNodo() == valorBuscado)
        {
            System.out.println("El valor fue encontrado correctamente en la posición " + ubicaciónDelValor);
        }
        else if(pivote.getSiguiente() != null)
        {
            ubicaciónDelValor ++;
            busquedaSecuencialLista(pivote.getSiguiente(), valorBuscado, ubicaciónDelValor);
        }
        else
        {
            System.out.println("El valor no se encuentra en la lista");
        }
    }

    public void busquedaBinaria(int númeroBuscado, int laLista[])
    {
        boolean terminarCiclo = false;
        int mitadDelLargo = (int) (laLista.length / 2);
        int largoMax = laLista.length;
        int largoMin = 0;
        while(terminarCiclo == false)
        {
            if(mitadDelLargo < largoMax && mitadDelLargo >= 0)
            {
                if(laLista[mitadDelLargo] == númeroBuscado)
                {
                    System.out.println("El número " + númeroBuscado + " correctamente en la posición " + mitadDelLargo);
                    terminarCiclo = true;
                }
                else
                {
                    if(laLista[mitadDelLargo] < númeroBuscado)
                    {
                        int valorPivote = (int) (largoMax - mitadDelLargo) / 2;
                        mitadDelLargo = mitadDelLargo + valorPivote;
                    }
                    else
                    {
                        mitadDelLargo = (int) (mitadDelLargo / 2);
                    }
                }
            }
            else
            {
                System.out.println("El valor no se encuentra en la lista");
            }
        }
    }
    
    public void buscarEnListaBinario(int númeroBuscado,  Nodo elNodo)
    {
        boolean terminarCiclo = false;
        int mitadDelLargo = (int) (this.cantidadDeNodos / 2);
        Nodo variable = elNodo;
        for(int i = 0; i < mitadDelLargo ; i++)
        {
            variable = variable.getSiguiente();
        }
        while(terminarCiclo == false)
        {
    
            if(mitadDelLargo < this.cantidadDeNodos && mitadDelLargo > 0)
                {
                    if(variable.getValorNodo() == númeroBuscado)
                    {
                        System.out.println("El número " + númeroBuscado + " correctamente en la posición " + mitadDelLargo);
                        terminarCiclo = true;
                    }
                    else
                    {
                        if(variable.getValorNodo() < númeroBuscado)
                        {
                            int valorPivote = (int) (this.cantidadDeNodos  - mitadDelLargo) / 2;
                            int mitadPrevia = mitadDelLargo;
                            mitadDelLargo = mitadDelLargo + valorPivote;
                            for(int i = mitadPrevia; i < mitadDelLargo ; i++)
                            {
                             variable = variable.getSiguiente();
                            }
                        }
                        else
                        {
                            mitadDelLargo = (int) (mitadDelLargo / 2);
                            variable = elNodo;
                            for(int i = 0; i < mitadDelLargo ; i++)
                            {
                                variable = variable.getSiguiente();
                            }
                        }
                    }
                }
                else if(mitadDelLargo == 0 && elNodo.getValorNodo() == númeroBuscado)
                {
                    System.out.println("El número " + númeroBuscado + " correctamente en la posición 0");
                }
                else
                {
                    System.out.println("El valor no se encuentra en la lista");
                }
            }
    }

    public void contarCuantosNodos(Nodo primero)
    {
        Nodo elComodin = primero;
        while(elComodin != null)
        {
            this.cantidadDeNodos ++;
            elComodin = elComodin.getSiguiente();
        }
    }

    public int getCuantosNodos()
    {
        return cantidadDeNodos;
    }
}