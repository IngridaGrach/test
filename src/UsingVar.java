import javax.swing.*;

public class UsingVar {
    public static void main(String[] args) {
        String name="Урдей Христя";
        int age=19;
        char category='B';
        String text="Driver: "+name;
        text=text+'\n'+"Age: "+age+" years";
        text=text+'\n'+"category rights: "+category;
        JOptionPane.showMessageDialog(null, text);
    }
}
