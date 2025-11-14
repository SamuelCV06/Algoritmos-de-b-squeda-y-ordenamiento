public class Nodo
{
    private int valorNodo;
    private Nodo siguiente;


    public Nodo()
    {
        this.valorNodo = -1;
        this.siguiente = null;
    }

    public void setValorNodo(int valor)
    {
        this.valorNodo = valor;
    }

    public void setSiguiente(Nodo elNodo)
    {
        this.siguiente = elNodo;
    }

    public int getValorNodo()
    {
        return this.valorNodo;
    }

    public Nodo getSiguiente()
    {
        return this.siguiente;
    }
}
