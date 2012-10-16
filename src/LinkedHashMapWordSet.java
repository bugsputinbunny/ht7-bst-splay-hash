
import java.util.LinkedHashMap;

/**
 * LinkedHashWordSet.java
 * Descripción: Utiliza el LinkedHashMap de JCF para guardar en
 *              el objetos de la clase Word, y así crear un diccionario con los tipos
 *              de palabras existentes.
 * @author Oscar Castañeda, Carnet 11086
 * @since  15/10/2012
 * @version 0.5
 */
public class LinkedHashMapWordSet implements WordSet{
    
    //LinkedHashSet donde se guardarán las palabras. La llave será la palabra y su valor, el tipo de palabra.
    
    private LinkedHashMap<String,String> theWordSet;

    /**
     * Constructor de LinkedHashMapWordSet.
     */
    public LinkedHashMapWordSet(){
        theWordSet = new LinkedHashMap<>();
    }
    
    @Override
    /**
     * Añade una nueva palabra al set.
     * @Pre El set existe.
     * @Post Se añade la nueva palabra, con la palabra como llave y su tipo como valor, al LinkedHash. Si ya existía la palabra, no se agrega.
     */
    public void add(Word wordObject) {
        if(!theWordSet.containsKey(wordObject.getWord())){
            theWordSet.put(wordObject.getWord(), wordObject.getType());
        }
    }

    @Override
    /**
     * Obtiene la palabra buscada del set.
     * @Pre El set existe.
     * @Post Se reconstruye el Word, a partir de su palabra y tipo de palabra. SI no existe, se devuelve null.
     */
    public Word get(Word word) {
        String theWord = word.getWord();
        if (theWordSet.containsKey(theWord)){
            String theWordType = theWordSet.get(theWord);
            Word toReturn = new Word(theWord, theWordType);
            return toReturn;
        }else{
            return null;
        }
    }        
}