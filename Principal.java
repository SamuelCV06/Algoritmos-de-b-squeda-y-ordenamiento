public class Principal 
{
    public static void main(String[] args) 
    {
        CrearListas lasListas = new CrearListas();
        AlgoritmosDeBusqueda losAlgoritmos = new AlgoritmosDeBusqueda();
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
        lasListas.crearListaArrayAlAzar(25);
        ordenar.ordenarBurbujaArray(lasListas.getLista());
        lasListas.crearListaNodoAlAzar(8);
        losAlgoritmos.contarCuantosNodos(lasListas.getPrimerNodo());
        ordenar.ordenarBurbujaLista(lasListas.getPrimerNodo(), losAlgoritmos.getCuantosNodos());
        //losAlgoritmos.buscarEnListaBinario(6, lasListas.getPrimerNodo());
        //lasListas.crearListaArray();
        //int laLista [] = lasListas.getLista();
        //losAlgoritmos.busquedaSecuencialArray(5, laLista);
        //losAlgoritmos.busquedaBinaria(5, laLista);

    }    
}
