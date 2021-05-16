
package entidades;

public class Medicos {
    private String nombredelDoctor;
    private String especialidad;
    private double sueldomensual;

    public Medicos(String n, String c, double d){
        this.nombredelDoctor= n;
        this.especialidad= c;
        this.sueldomensual=d;
    }
    
    public void establecerNombredelDoctor(String n){
        this.nombredelDoctor=n;
    }
    
    public void establecerEspecialidad(String c){
        this.especialidad=c;
    }
    
    public void establecerSueldoMensual(int d){
        this.sueldomensual=d;
    }
    
    public String obtenerNombredelDoctor(){
        return nombredelDoctor;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSueldoMensual(){
        return sueldomensual;
    }
    
    @Override
    public String toString() {
        return " - " + nombredelDoctor + " - especialidad: " + especialidad
                + " - sueldo: " + sueldomensual + "\n";
    }

}
