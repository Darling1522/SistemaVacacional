import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

 private JMenuBar menu;
 private JMenu menu1,menu2,menu3,submenu1;
 private JMenuItem menuitem11,menuitem12,menuitem13,menuitem21,menuitem31,nuevo,salir;  

 private ImageIcon logo3;
 private JLabel nombrel, titulol;
 private JLabel nombrecompletol,apellidopaternol,apellidomaternol,departamentol,antiguedadl,resultadol;
 private JTextField nombret,apellidomaternot,apellidopaternot;
 private JComboBox departamentoc, antiguedadc;
 private JTextArea resultadot;
 JLabel	textol, image;
 String NOMBRE;
 
  public Principal(){
    setLayout(null);
    setTitle("Principal");
    getContentPane().setBackground(new Color(253,0,2,255));
    Licencia objeto = new Licencia();
    NOMBRE = objeto.nombre; 
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    setIconImage(new 
    ImageIcon(getClass().getResource("images/icono.png")).getImage());    
  
    menu = new JMenuBar();
    setJMenuBar(menu);
    menu.setBackground(new Color(253,0,2,255));

    menu1 = new JMenu("opciones");
    menu.add(menu1);
    menu1.setForeground(new Color(255,255,255));
    menu1.setBackground(new Color(253,0,2,255));

    submenu1 = new JMenu("color de fondo");
    menu1.add(submenu1);
    submenu1.setForeground(new Color(253,0,2,255));

    menuitem11 = new JMenuItem("rojo");
    submenu1.add(menuitem11);
    menuitem11.setForeground(new Color(253,0,2,255));
    menuitem11.addActionListener(this);

    menuitem12 = new JMenuItem("azul");
    submenu1.add(menuitem12);
    menuitem12.setForeground(new Color(253,0,2,255));
    menuitem12.addActionListener(this);
  
    menuitem13 = new JMenuItem("morado");
    submenu1.add(menuitem13);
    menuitem13.setForeground(new Color(253,0,2,255)); 
    menuitem13.addActionListener(this);
  
    menu2 = new JMenu("Calcular");
    menu.add(menu2);
    menu2.setForeground(new Color(255,255,255)); 
    menu.setBackground(new Color(253,0,2,255));
  
    menu3 = new JMenu("Acerca de");
    menu.add(menu3);
    menu3.setForeground(new Color(255,255,255));
    menu3.setBackground(new Color(253,0,2,255));

    nuevo = new JMenuItem("Nuevo");
    menu1.add(nuevo); 
    nuevo.setForeground(new Color(253,0,2,255));
    nuevo.addActionListener(this);

    salir = new JMenuItem("salir");
    menu1.add(salir);
    salir.setForeground(new Color(253,0,2,255));
    salir.addActionListener(this);

    menuitem21 = new JMenuItem("Vacaciones");
    menu2.add(menuitem21);
    menuitem21.setForeground(new Color(253,0,2,255));
    menuitem21.addActionListener(this);

    menuitem31 = new JMenuItem("El Creador");
    menu3.add(menuitem31);
    menuitem31.setForeground(new Color(253,0,2,255));
    menuitem31.addActionListener(this);

    logo3 = new ImageIcon("images/logowhite.png");
    image = new JLabel(logo3); 
    image.setBounds(0,0,300,130);
    add(image);
  
    nombrel = new JLabel("Bienvenid@ " + NOMBRE);
    nombrel.setBounds(380,50,200,30);
    add(nombrel);
    nombrel.setFont(new Font("arial",3,20));
    nombrel.setForeground(new Color(255,255,255));

    titulol = new JLabel("Datos del trabajador para el calculo de las vacaciones");
    titulol.setBounds(130,140,500,30);
    add(titulol);
    titulol.setForeground(new Color(255,255,255));
    titulol.setFont(new Font("Georgia",3,17));

    nombrecompletol = new JLabel("NombreCompleto");
    nombrecompletol.setBounds(30,180,200,20);
    add(nombrecompletol);
    nombrecompletol.setForeground(new Color(255,255,255));
    nombrecompletol.setFont(new Font("Georgia", 3, 11));

    nombret = new JTextField();
    nombret.setBounds(30,200,150,20);
    add(nombret);
   nombret.addActionListener(this);
  
    apellidopaternol = new JLabel("ApellidoPaterno");
    apellidopaternol.setBounds(30,230,200,20);
    add(apellidopaternol);
    apellidopaternol.setForeground(new Color(255,255,255));
    apellidopaternol.setFont(new Font("Georgia", 3, 11));

    apellidopaternot = new JTextField();
    apellidopaternot.setBounds(30,250,150,20);
    add(apellidopaternot);
    apellidopaternot.addActionListener(this);

    apellidomaternol = new JLabel("ApellidoMaterno");
    apellidomaternol.setBounds(30,280,200,20);
    add(apellidomaternol);
    apellidomaternol.setForeground(new Color(255,255,255));
    apellidomaternol.setFont(new Font("Georgia", 3, 11));

    apellidomaternot = new JTextField();
    apellidomaternot.setBounds(30,300,150,20);
    add(apellidomaternot);  
    apellidomaternot.addActionListener(this);

    departamentol = new JLabel("Selecciona el Departamento");
    departamentol.setBounds(260,180,200,20);
    add(departamentol);
    departamentol.setForeground(new Color(255,255,255));  
    departamentol.setFont(new Font("Georgia", 3, 11));

    departamentoc = new JComboBox();
    departamentoc.setBounds(260,202,230,20);
    add(departamentoc);
    departamentoc.addItem("");
    departamentoc.addItem("Atencion Al Cliente");
    departamentoc.addItem("Departamento de logistica");
    departamentoc.addItem("Departamento de gerencia");
    departamentoc.addActionListener(this);

    antiguedadl = new JLabel("Selecciona la Antiguedad");
    antiguedadl.setBounds(260,230,200,20);
    add(antiguedadl);
    antiguedadl.setForeground(new Color(255,255,255));  
    antiguedadl.setFont(new Font("Georgia", 3, 11));
 
    antiguedadc = new JComboBox();
    antiguedadc.setBounds(260,250,230,20);
    add(antiguedadc);
    antiguedadc.addItem("");
    antiguedadc.addItem("1 año de servicio");
    antiguedadc.addItem("2 a 6 años de servicio");
    antiguedadc.addItem("7 años o mas de servicio");
    antiguedadc.addActionListener(this);

    resultadol = new JLabel("Resultado Del Calculo");
    resultadol.setBounds(260,280,200,20);
    add(resultadol);
    resultadol.setForeground(new Color(255,255,255));
    resultadol.setFont(new Font("Georgia", 3, 11));

    resultadot = new JTextArea();
    resultadot.setBounds(260,300,390,110);
    add(resultadot);
    resultadot.setForeground(new Color(253,0,2,255));
    resultadot.setEditable(false);
   

    textol = new JLabel("@2017 The Coca-Cola Company-Todos los derechos reservados");
    textol.setBounds(150,410,400,30);
    add(textol);
    textol.setFont(new Font("Georgia", 3, 10)); 
    textol.setForeground(new Color(255,255,255));

 }


 public void actionPerformed(ActionEvent evento){ 
  
  if(evento.getSource() == menuitem11){
   getContentPane().setBackground(new Color(253,0,2,255));
  }
  if(evento.getSource() == menuitem12)
  {
   getContentPane().setBackground(new Color(0,6,202));
  }
  if(evento.getSource() == menuitem13)
  {
   getContentPane().setBackground(new Color(76,10,159));
  }
  if(evento.getSource() == nuevo)
  {
     nombret.setText("");
     apellidopaternot.setText("");
     apellidomaternot.setText("");
     departamentoc.setSelectedIndex(-1);
     antiguedadc.setSelectedIndex(-1);
  }
  if(evento.getSource() == salir)
  {
   SistemaVacacional contenedor1 = new SistemaVacacional();
   contenedor1.setBounds(10,10,400,530);
   contenedor1.setResizable(false);
   contenedor1.setVisible(true);
   contenedor1.setLocationRelativeTo(null);
   this.setVisible(false);
  }
  if(evento.getSource() == menuitem31)
     {
      JOptionPane.showMessageDialog(null,"Desarrollado por: Darling Ramirez\nVisitame en: https://tamotrabajando.com/conyoutuve");
     }
 
  if(evento.getSource() ==menuitem21)
  {
     String nombretrabajador = nombret.getText();
     String ap = apellidopaternot.getText();
     String am = apellidomaternot.getText();
     String departamento = departamentoc.getSelectedItem().toString();
     String antiguedad = antiguedadc.getSelectedItem().toString();

      if(nombretrabajador.equals("") || ap.equals("") || am.equals("") ||
      departamento.equals("") || antiguedad.equals("")) 
      {
        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
      }
      else
      {
        if(departamento.equals("Atencion Al Cliente"))
        {
          if(antiguedad.equals("1 año de servicio"))
          {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 6 dias de vacaciones");
           }
           if(antiguedad.equals("2 a 6 años de servicio"))
           {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 14 dias de vacaciones");
           }
           if(antiguedad.equals("7 años o mas de servicio"))
           {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 20 dias de vacaciones");
           }

        }


        if(departamento.equals("Departamento de logistica"))
        {
          if(antiguedad.equals("1 año de servicio"))
          {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 7 dias de vacaciones");
           }
           if(antiguedad.equals("2 a 6 años de servicio"))
           {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 15 dias de vacaciones");
           }
           if(antiguedad.equals("7 años o mas de servicio"))
           {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 22 dias de vacaciones");
           }

        }


        if(departamento.equals("Departamento de gerencia"))
        {
          if(antiguedad.equals("1 año de servicio"))
          {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 10 dias de vacaciones");
           }
           if(antiguedad.equals("2 a 6 años de servicio"))
           {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 20 dias de vacaciones");
           }
           if(antiguedad.equals("7 años o mas de servicio"))
           {
             resultadot.setText("\n el trabajador "+ nombretrabajador+ap +" "+ am
             +"\n quien labora en el departamento de "+ departamento +"\n con"
             + antiguedad+" recibe 30 dias de vacaciones");
           }

        }
        
      }   
   } 
 } 

 public static void main(String args[]){
   Principal contenedor = new Principal();
   contenedor.setBounds(10,10,700,500);
   contenedor.setResizable(false);
   contenedor.setVisible(true);
   contenedor.setLocationRelativeTo(null);
 }
}  // clase 

