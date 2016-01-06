import javax.swing.JOptionPane;

public class delksolw {
public static void main(String[] args) {
String an = JOptionPane.showInputDialog("Do u liek pizza?");	
if (an.equalsIgnoreCase("yes")){JOptionPane.showMessageDialog(null, "Why u no eat pizza yet?");
}
else{
String an2 = JOptionPane.showInputDialog("Do u liek Cheese?"); 
if(an2.equalsIgnoreCase("yes")){ JOptionPane.showMessageDialog(null, "Cmon mon eat the pizza!");}
else{ JOptionPane.showMessageDialog(null, "ok man if ur not alergic just eat the pizza!!!!!11!!1!!1");
}

}
}
}

