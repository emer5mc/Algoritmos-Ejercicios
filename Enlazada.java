public class Enlazada{

    Nodo cabeza;
    int size;

    public Enlazada(){

        cabeza=null;
        size=0;
    }


    public void agregar(Object obj){

        if (cabeza==null){
            cabeza=new Nodo(obj);           //cuando la lista está vacia
        }else{
            Nodo temp =cabeza;              //cuando ya tiene al menos in dato
            Nodo nuevo=new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza= nuevo;
        }
        size++;
    }

    public Object obtener(int index){
        int cont=0;
        Nodo temporal= cabeza;

        while  (cont<index){
            temporal=temporal.obtenerSiguiente();
            cont++;
        }
        return temporal.obtenerValor();
    }


    public int size(){
        return size;
    }
}
