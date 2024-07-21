import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class Licencia extends JFrame implements ActionListener{
 private JLabel titulo, limage;
 private JTextArea terminos;
 private JCheckBox checkt;
 private JButton continuar, noacepto;
 private ImageIcon imagep;
 private JScrollPane scrollpane;
 public String nombre;

 public Licencia(){
  setLayout(null);
  setTitle("Licencia de uso");
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  SistemaVacacional objeto = new SistemaVacacional();
  nombre = objeto.texto;
  
  setIconImage(new
  ImageIcon(getClass().getResource("images/icono.png")).getImage());

  titulo = new JLabel("TERMINOS Y CONDICIONES");
  titulo.setBounds(255,30,300,17); 
  add(titulo);
  titulo.setFont(new Font("Cabin",1,20));

  terminos = new JTextArea();
  terminos.setText("\n\n        TERMINOS Y CONDICIONES:"+
                   "\n\n             A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE DARLING"+
                   "\n             B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISENO DE INTERFAZE SIN AUTORIZACION DE DARLING"+
                   "\n             C. LA GIKIPEDIA DE DARLING NO SE HACE REESPONSABLE DEL MAL USO DE ESTE SOFTWARE"+
                   "\n\n           LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE SOFTWSARE"+
                   "\n           HAGA CON ESTE SOFWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (ACEPTAR)"+
                   "\n           SI USTED NO ACEPTA ESTOS TERMINOS,HAGA CLICK EN (NO ACEPTO), Y NO UTILIZA ESTE SOFTWARE."+
                   "\n           PARA MAYO INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS,POR FAVOR VISITE:"+ 	
                   "\n\n          LA GIKIPEDIA DE DARLING NO SE HACE REESPONSABLE DEL MAL USO DE ESTE SOGWARE"+
                  "\n          https://www.tamotrabajando.com/miprimerproyecto"

  );
  terminos.setEditable(false);
  scrollpane = new JScrollPane(terminos);
  scrollpane.setBounds(40,70,700,280);
  add(scrollpane);

  checkt = new JCheckBox("Yo "+ nombre + " Acepto los terminos");
  checkt.setBounds(40,360,300,20);
  add(checkt);
  checkt.addActionListener(this);

  continuar = new JButton("continuar");
  continuar.setBounds(40,400,120,40);
  add(continuar);
  continuar.addActionListener(this);
  continuar.setEnabled(false);

  noacepto = new JButton("no acepto");
  noacepto.setBounds(170,400,120,40);
  add(noacepto);
  noacepto.addActionListener(this);
   
  imagep = new ImageIcon("images/logo2.png");
  limage = new JLabel(imagep);
  limage.setBounds(420,300,400,200);
  add(limage);
  
 }

 public void actionPerformed(ActionEvent evento){

   if(checkt.isSelected() == true)
   {
      continuar.setEnabled(true);
      noacepto.setEnabled(false);
   }
   else
   {
    continuar.setEnabled(false);
    noacepto.setEnabled(true); 
   }
   if(evento.getSource() == noacepto)
   {
        SistemaVacacional contenedor1 = new SistemaVacacional();
        contenedor1.setBounds(10,10,400,530);
        contenedor1.setResizable(false);
        contenedor1.setVisible(true);
        contenedor1.setLocationRelativeTo(null);
        this.setVisible(false);
   }
   if(evento.getSource() == continuar)
   {  
    Principal contenedor = new Principal();
    contenedor.setBounds(10,10,700,500);
    contenedor.setResizable(false);
    contenedor.setVisible(true);
    contenedor.setLocationRelativeTo(null);
  
    this.setVisible(false);
    
   }
 }

 public static void main(String args[]){
  Licencia contenedor2 = new Licencia();
  contenedor2.setBounds(10,10,800,500); 
  contenedor2.setVisible(true);
  contenedor2.setResizable(false);
  contenedor2.setLocationRelativeTo(null);
 }

}