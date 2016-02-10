import javax.swing.JOptionPane;

public class buba {
public static void main(String[] args) {
String badvariable = JOptionPane.showInputDialog("How tall are you in inches?");
int v = Integer.parseInt(badvariable);
if(v >= 48){
JOptionPane.showMessageDialog(null, "you can ride");
}
else{
JOptionPane.showMessageDialog(null, "You are too short to ride");	
}
}
}


