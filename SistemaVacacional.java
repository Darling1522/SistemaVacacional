import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class SistemaVacacional extends JFrame implements ActionListener{

 private ImageIcon imageicon;
 private JButton aceptar;
 private JTextField capnombre;
 private JLabel inombre,nombrep,image,titulo;
 public static String texto = "";     // OJO

 public SistemaVacacional(){
    setLayout(null);
    setTitle("Bienvenid@");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    inombre = new JLabel("Ingresa tu nombre:");
    inombre.setBounds(40,270,150,10);
    add(inombre);
    inombre.setFont(new Font("arial", 2, 12));
    inombre.setForeground(new Color(255,255,255));
   
    aceptar = new JButton("Ingresar");
    aceptar.setForeground(new Color(199,3,20,255));
    aceptar.setBounds(120,325,140,30);
    aceptar.setBackground(new Color(255,255,255));
    aceptar.setEnabled(true);
    add(aceptar);  
    aceptar.addActionListener(this);

    capnombre = new JTextField();
    capnombre.setBounds(40,290,300,25);
    add(capnombre);
    capnombre.setForeground(new Color(253,0,2,255));
   
    nombrep = new JLabel("@2017 The Coca Cola Company");
    nombrep.setBounds(95,460,200,20);
    add(nombrep);
    nombrep.setFont(new Font("arial", 3, 13));
    nombrep.setForeground(new Color(255,255,255));

    ImageIcon logo = new ImageIcon("images/logo.jpg");
    image = new JLabel(logo);
    image.setBounds(50,30,300,150);
    add(image);

    titulo = new JLabel("Sistema de Control Vacacional");
    titulo.setBounds(50,190,300,20);
    add(titulo);
    titulo.setForeground(new Color(255,255,255,255)); 
    titulo.setFont(new Font("arial", 3, 20));

    getContentPane().setBackground(new Color(253,0,2,255));
    
    setIconImage(new     
    ImageIcon(getClass().getResource("images/icono.png")).getImage());
  }
 

  public void actionPerformed(ActionEvent evento){

    if(capnombre.getText().length() == 0)
     {
     JOptionPane.showMessageDialog(null, "El campo de texto está vacío.");
    }
    if(capnombre.getText().length() <= 3)
    {
    JOptionPane.showMessageDialog(null, "este no es un nombre");
    }
    else{
      texto = capnombre.getText().trim();
       Licencia contenedor2 = new Licencia();
       contenedor2.setBounds(10,10,800,500); 
       contenedor2.setVisible(true);   
       contenedor2.setResizable(false);
       contenedor2.setLocationRelativeTo(null);
 
       this.setVisible(false);    
       
      
    }
  }

  public static void main(String args[]){
   SistemaVacacional contenedor1 = new SistemaVacacional();
   contenedor1.setBounds(10,10,400,530);
   contenedor1.setResizable(false);
   contenedor1.setVisible(true);
   contenedor1.setLocationRelativeTo(null);
 }


}