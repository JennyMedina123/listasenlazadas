import javax.swing.JOptionPane;

 class Main {
 public static void main (String args[]){
  ListaDoble listita=new ListaDoble();
   int opcion=0, elemento;
   do {
        try{
          opcion=Integer.parseInt (JOptionPane.showInputDialog(null, 
                          "1. Agregar un nodo al inicio\n" 
                          + "2. Agregar un nodo al final\n" 
                          + "3. Mostrar la lista de inicio a fin\n"
                          + "4. Mostrar la lista de fin a inicio\n"
                          + "salir\n"
                          + "que deseas hacer?","Menu de Opciones", 
                         JOptionPane.INFORMATION_MESSAGE));
        switch (opcion) {
          case 1:
            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del Nodo","agregando Nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
          listita.agregarAlInicio(elemento);
          break;
          case 2:
            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del Nodo","agregando Nodo al final", JOptionPane.INFORMATION_MESSAGE));
          listita.agregarAlFinal(elemento);
          break;
          case 3:
            if(!listita.estVacia()) {
                listita.mostrarListaInicioFin();
            }else{
              JOptionPane.showMessageDialog (null, "No hay Nodos aun", 
                                  "lista vacia", JOptionPane.INFORMATION_MESSAGE);
            }
          break;
          case 4:
            if(!listita.estVacia()) {
                 listita.mostrarListaFinInicio();
            }else{
              JOptionPane.showMessageDialog (null, "No hay Nodos aun", 
                                  "lista vacia", JOptionPane.INFORMATION_MESSAGE);
            }
          break;
          case 5:
            JOptionPane.showMessageDialog (null, "Aplicacion finalizada", 
                                  "fin", JOptionPane.INFORMATION_MESSAGE);
          break;
          default:
            JOptionPane.showMessageDialog (null, "la opcion no esta en el menu", 
                                  "incorrecto", JOptionPane.INFORMATION_MESSAGE) ;   
        }
    }  catch(NumberFormatException n){
          JOptionPane.showMessageDialog(null, "Error "+ n.getMessage());
    }
  } while(opcion!=5);
}
}