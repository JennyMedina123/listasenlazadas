class NodoDoble {  
  public int dato;
  NodoDoble siguiente, anterior;
  // construtor para cuando aun no hay nodos
  public NodoDoble(int el){
     this(el, null, null);
  }
  // constructor para cuando hay nodos
  public NodoDoble(int el, NodoDoble s, NodoDoble a){
     this.dato= el;
     this.siguiente= s;
     this.anterior= a; 
  }
  
}
