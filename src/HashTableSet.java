import implementaciones.Hashtable;

/**
 * SplayTreeSet.java
 * Descripción: Utiliza el Hashtable elaborado por Bailey para guardar en
 *              el objetos de la clase Word, y así crear un diccionario con los tipos
 *              de palabras existentes.
 * @author Luis Fernando Valdeavellano, 11218
 * @since  16/10/2012
 * @version 1.0
 */

public class HashTableSet implements WordSet{

    //RedBlackSearchTree donde se guardarán las palabras.
    
    private Hashtable<String,String> theWordTree;
    
    /**
     * Constructor del SplayTreeSet
     */
    public HashTableSet(){
        theWordTree = new Hashtable<>();
    }
    
    @Override
    /**
     * Añade una nueva palabra a este árbol.
     * @pre El árbol existe.
     * @post Se añade la palabra al árbol de ser nueva. Si ya existe, no se hace nada.
     */
    public void add(Word wordObject) {
        if(!theWordTree.containsKey(wordObject.getWord())){
            theWordTree.put(wordObject.getWord(),wordObject.getType());
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
        String theWord = word.getWord();
        if (theWordTree.containsKey(theWord)){
            String theWordType = theWordTree.get(theWord);
            Word toReturn = new Word(theWord, theWordType);
            return toReturn;
        }else{
            return null;
        }
    }
        
}