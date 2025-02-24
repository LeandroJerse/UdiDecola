
package interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;


public interface DaoInterface {
    public void saveClient(Object... value);
    public void excludeClient(String user,String password);
    public void showClient(Object...value) throws SQLException;
    public void downComboBox(JComboBox itens) throws SQLException;
    
}
