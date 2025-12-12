import javax.swing.*;
public class TableExample {
    JFrame f;

    public TableExample() {
        f= new JFrame();
         String data[][]={ {"01","Aanchal Pal","A"},    
                          {"11","Anushka Kapse","A"},    
                          {"20","Gayatri Patil","A"},    
                          {"28","Komal Swami","A"},
                          {"75","Vaishnavi Pillai","A"}};   
        String  column[]={"Roll_No","Name","Div"};
        JTable t= new JTable(data, column); 
        t.setBounds(30,40,300,300);
        JScrollPane sp= new JScrollPane(t);
        f.add(sp);
        f.setSize(400,400);
        f.setVisible(true);
};    

    
    public static void main(String[] args) {
        new TableExample();
    }
}
