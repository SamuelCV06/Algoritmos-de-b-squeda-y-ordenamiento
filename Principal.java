public class Principal 
{
    public static void main(String[] args) 
    {
        CrearListas lasListas = new CrearListas();
        AlgoritmosDeBusqueda busqueda = new AlgoritmosDeBusqueda();
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
        lasListas.crearListaArrayAlAzar(25);
        lasListas.crearListaNodoAlAzar(8);
        ordenar.ordenarBurbujaLista(lasListas.getPrimerNodo());
        ordenar.ordenarBurbujaArray(lasListas.getLista());
        busqueda.busquedaSecuencialArray(5, lasListas.getLista());
        busqueda.buscarNodo(lasListas.getPrimerNodo(), 18);
        busqueda.buscarEnListaBinario(158, lasListas.getPrimerNodo());
        lasListas.crearListaArrayAlAzar(25);
        ordenar.ordenarPorInserciónArray(lasListas.getLista());
        lasListas.crearListaArrayAlAzar(25);
        ordenar.OrdenarPorSeleccion(lasListas.getLista());


    }    
}
