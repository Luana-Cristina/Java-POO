
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Luana Cristina
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        
        System.out.print("Seu idioma está em ");
        System.out.println(idioma.toString());
    }
    
}
