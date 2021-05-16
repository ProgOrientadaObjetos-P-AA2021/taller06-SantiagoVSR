
package entidades;


public class Enfermeros {
    private String nombredelEnfermero;
    private String tipoNombramiento;
    private double sueldoMensual;

    public Enfermeros(String n, String c, double d){
        this.nombredelEnfermero= n;
        this.tipoNombramiento= c;
        this.sueldoMensual=d;
    }
    
    public void establecerNombredelEnfermero(String n){
        this.nombredelEnfermero=n;
    }
    
    public void establecerTipoNombramiento(String c){
        this.tipoNombramiento=c;
    }
    
    public void establecerSueldoMensual(int d){
        this.sueldoMensual=d;
    }
    
    public String obtenerNombredelEnfermero(){
        return nombredelEnfermero;
    }
    
    public String obtenerTipoNombramiento(){
        return tipoNombramiento;
    }
    
    public double obtenerSueldoMensual(){
        return sueldoMensual;
    }
    

    public String toString(){
        return "-"+ nombredelEnfermero +" - nombramiento: "+ tipoNombramiento+
                " - sueldo: "+sueldoMensual+"\n";
    }

}
