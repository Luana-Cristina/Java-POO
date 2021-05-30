package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Luana Cristina
 */
public class ResolucaoTela {

    public static void main(String[] args) {
     Toolkit tk = Toolkit.getDefaultToolkit();
     Dimension d = tk.getScreenSize();
        System.out.print("Sua resolução é de ");
        System.out.print(d.width);
        System.out.print(" X ");
        System.out.println(d.height);
    }
    
}
