import implementaciones.SplayTree;

/**
 * SplayTreeSet.java
 * Descripción: Utiliza el SplayTree elaborado por Bailey para guardar en
 *              el objetos de la clase Word, y así crear un diccionario con los tipos
 *              de palabras existentes.
 * @author Luis Fernando Valdeavellano, 11218
 * @since  15/10/2012
 * @version 1.0
 */

public class SplayTreeSet implements WordSet{

    //RedBlackSearchTree donde se guardarán las palabras.
    
    private SplayTree<Word> theWordTree;
    
    /**
     * Constructor del SplayTreeSet
     */
    public SplayTreeSet(){
        theWordTree = new SplayTree<>();
    }
    
    @Override
    /**
     * Añade una nueva palabra a este árbol.
     * @pre El árbol existe.
     * @post Se añade la palabra al árbol de ser nueva. Si ya existe, no se hace nada.
     */
    public void add(Word wordObject) {
        if(!theWordTree.contains(wordObject)){
            theWordTree.add(wordObject);
        }
    }

    @Override
    /**
     * Devuelve la palabra buscada de existir en el árbol.
     * @Pre El árbol existe.
     * @Post Si la palabra buscada existe en el árbol, se devuelve esta misma. En caso contrario, se devuelve null.
     */
    public Word get(Word word) {
        //Se revisa si la palabra existe
        if(theWordTree.contains(word)){
            //De ser así, se devuelve la misma palabra.
            return theWordTree.get(word);
        }else{
            return null;
        }
    }
        
}