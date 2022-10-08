import javax.swing.JOptionPane;
class ListaDoble {
   private NodoDoble inicio, fin, anterior;
   public ListaDoble(){
      inicio=fin=null;
   }
  // metodo cuando la lista este vacia
   public boolean estVacia(){
       return inicio==null;
   }
  // Metodos para agregar nodos al final
   public void agregarAlFinal(int el){
      if (!this.estVacia()){
         this.fin=new NodoDoble(el, null, fin);
         this.fin.anterior.siguiente=fin;
      }else{
         inicio=fin=new NodoDoble(el);
      }
   }
// metodo para agregar al inicio
   public void agregarAlInicio(int el){
      if (!this.estVacia()){
         inicio=new NodoDoble(el, inicio, null);
         inicio.siguiente.anterior=inicio;
      }else{
         inicio=fin=new NodoDoble(el);
      }
   }
  // metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin(){
       if(!this.estVacia()){
           String datos="<=>";
           NodoDoble auxiliar=inicio;
           while (auxiliar!=null){
              datos = datos + "["+ auxiliar.dato+"]<=>";
              auxiliar=auxiliar.siguiente;
           }
         JOptionPane.showMessageDialog(null, datos, 
                  "mostrando lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
       }
    } 
  
  // Metodo para mostrar la lista de fin a inicio
  public void mostrarListaFinInicio(){
       if(!this.estVacia()){
           String datos="<=>";
           NodoDoble auxiliar=fin;
           while (auxiliar!=null){
              datos = datos + "["+ auxiliar.dato+"]<=>";
              auxiliar=auxiliar.anterior;
           }
         JOptionPane.showMessageDialog(null, datos, 
                  "mostrando lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
       }
    } 
}
