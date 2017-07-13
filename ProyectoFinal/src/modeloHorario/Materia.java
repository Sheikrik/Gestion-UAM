package modeloHorario;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Materia implements Serializable{
   private String nombreMateria;
   private int creditos;

   public String getNombreMateria() {
       return nombreMateria;
   }
   
   public void setNombreMateria(String nombreMateria) {
       this.nombreMateria = nombreMateria;
   }
   
   public int getCreditos() {
       return creditos;
   }
   
   public void setCreditos(int creditos) {
       this.creditos = creditos;
   }
}