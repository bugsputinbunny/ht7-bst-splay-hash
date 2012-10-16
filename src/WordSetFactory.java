/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7 
Autor: Eduardo Castellanos

Descripcion: WordSetFactory. Clase  utilizada para instanciar los diferentes tipos de sets. 
*/
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	
	public static WordSet generateSet(int tipo)
	{
	    if (tipo == 1)
		    return new SimpleSet();
            else{
                if (tipo == 2)
                    return new RedBlackTreeSet();
                else{
                }
            }
		    // aqui se regresara el set empleando sus implementaciones:
			// if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
			// if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
			// if tipo == 4 cree una instancia para un Wordset impelementdo con Hash table
			
			return null;
	}
	
	
}