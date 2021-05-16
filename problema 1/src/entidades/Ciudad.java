
package entidades;

public class Ciudad {
    private String nombredelaCiudad;
    private String provinciadelaCiudad;

    public Ciudad(String n, String c){
        this.nombredelaCiudad= n;
        this.provinciadelaCiudad= c;
    }
    
    public void establecerNombredelaCiudad(String n){
        this.nombredelaCiudad=n;
    }
    
    public void establecerProvinciadelaCiudad(String c){
        this.provinciadelaCiudad=c;
    }
    
    public String obtenerNombredelaCiudad(){
        return nombredelaCiudad;
    }
    
    public String obtenerProvinciadelaCiudad(){
        return provinciadelaCiudad;
    }
}
