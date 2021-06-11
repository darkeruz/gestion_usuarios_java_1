package metodos;

import alumno.Alumno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    public void guardar(Alumno alumno){
        vPrincipal.addElement(alumno);
    }
    
    public void guardarArchivo(Alumno alumno){
        try{
            FileWriter fw = new FileWriter("Alumnos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(alumno.getNombre());
            pw.print("|"+alumno.getApellido());
            pw.print("|"+alumno.getDni());
            pw.println("|"+alumno.getCarrera());
            pw.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel listaAlumnos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Apellido");
        cabeceras.addElement("DNI");
        cabeceras.addElement("Carrera");
        
        DefaultTableModel modeloTabla = new DefaultTableModel(cabeceras, 0);
        
        try{
            FileReader fr = new FileReader("Alumnos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d = br.readLine()) != null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                modeloTabla.addRow(x);
                 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return modeloTabla;
        
    }
    
}
