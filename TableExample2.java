import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class TableExample2 {
    JFrame f;

    public TableExample2() {
        f= new JFrame();
         String data[][]={ {"01","Aanchal Pal","A"},    
                          {"11","Anushka Kapse","A"},    
                          {"20","Gayatri Patil","A"},    
                          {"28","Komal Swami","A"},
                          {"75","Vaishnavi Pillai","A"}};   
        String  column[]={"Roll_No","Name","Div"};
        JTable t= new JTable(data, column); 
        t.setBounds(30,40,300,300);
        t.setCellSelectionEnabled(true);
         ListSelectionModel select= t.getSelectionModel();
         select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
         select.addListSelectionListener(new ListSelectionListener() {  
              public void valueChanged(ListSelectionEvent e) { 
                  String Data = null;  
                int[] row = t.getSelectedRows();  
                int[] columns = t.getSelectedColumns();  
                for (int i = 0; i < row.length; i++) {  
                  for (int j = 0; j < columns.length; j++) {  
                    Data = (String) t.getValueAt(row[i], columns[j]);  
                } }  
                System.out.println("Table element selected is: " + Data);    
            }       
            });    
        JScrollPane sp= new JScrollPane(t);
        f.add(sp);
        f.setSize(400,400);
        f.setVisible(true);
};    

    
    public static void main(String[] args) {
        new TableExample2();
    }
}
