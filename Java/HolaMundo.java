import javax.swing.*;
public class HolaMundo extends JFrame
{
public static void main(String[] args)
{
new HolaMundo();
}
public HolaMundo()
{
JPanel panel1 = new JPanel();
JLabel label1 = new JLabel("Hola mundo, este es mi primer programa de Java sobre Ubuntu Linux");
panel1.add(label1);
this.add(panel1);
this.setTitle("Hola Mundo");
this.setSize(500,500);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
}
