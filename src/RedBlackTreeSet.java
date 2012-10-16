import implementaciones.RedBlackSearchTree;

/**
 * RedBlackTreeSet.java
 * Descripción: Utiliza el RedBlackSearchTree elaborado por Bailey para guardar en
 *              el objetos de la clase Word, y así crear un diccionario con los tipos
 *              de palabras existentes.
 * @author Oscar Castañeda, Carnet 11086
 * @since  15/10/2012
 * @version 1.0
 */

public class RedBlackTreeSet implements WordSet{

    //RedBlackSearchTree donde se guardarán las palabras.
    
    private RedBlackSearchTree<Word> theWordTree;
    
    /**
     * Constructor del RedBlackTreeSet
     */
    public RedBlackTreeSet(){
        theWordTree = new RedBlackSearchTree<>();
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
