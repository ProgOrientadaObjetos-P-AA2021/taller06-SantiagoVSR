
package entidades;

import java.util.ArrayList;

public class Hospital {
    private String nombredelHospital;
    private String direccion;
    private Ciudad ciudad;
    private int especialidades;
    private double sueldoTotal;
    
    private ArrayList<Medicos>medico=new ArrayList<>();
    private ArrayList<Enfermeros>enfermero=new ArrayList<>();
    
    public Hospital (String n, String d, int num, Ciudad c){
        this.nombredelHospital=n;
        this.direccion=d;
        this.ciudad= c;
        this.especialidades=num;
    }
    
    public void establecerNombredelHospital(String n){
        this.nombredelHospital=n;
    }
    
    public void establecerDireccion(String d){
        this.direccion=d;
    }
    
    public void establecerCiudad(Ciudad c){
        this.ciudad=c;
    }
    
    public void establecerEspecialidades(int num){
        this.especialidades=num;
    }
    
    public void establecerMedicos(ArrayList<Medicos> m){
        this.medico = m;
    }
    
    public void establecerEnfermeros(ArrayList<Enfermeros> e) {
        this.enfermero = e;
    }
    
    public void establecerSueldoTotal(){
        for (Medicos i: medico){
            this.sueldoTotal+=i.obtenerSueldoMensual();
        }
        for (Enfermeros i: enfermero){
            this.sueldoTotal+=i.obtenerSueldoMensual();
        }
    }
    
    public String obtenerNombredelHospital(){
        return nombredelHospital;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerEspecialidades(){
        return especialidades;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    public ArrayList<Medicos> obtenerMedicos(){
        return medico;
    }
    
    public ArrayList<Enfermeros> obtenerEnfermeros() {
        return enfermero;
    }
    
    public String obtenerInfMedicos(){
        String info="";
        for (Medicos i : medico){
            info += i.toString();
        }
        return info;
    }
    
    public String obtenerInfEnfermeros() {
        String info = "";
        for (Enfermeros i : enfermero) {
            info += i.toString();
        }
        return info;
    }
    public void addMedicos(Medicos m){
        medico.add(m);
    }
    
    public void addEnfermeros(Enfermeros e){
        enfermero.add(e);
    }
    
    @Override
    public String toString() {
        return String.format(
                "HOSPITAL %s\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Nº especialidades: %s\n"
                + "Listado de médicos: \n%s\n"
                + "Listado de enferemer@s: \n%s\n"
                + "\nTotal de sueldos a pagar por mes: %s \n",
                nombredelHospital, direccion, ciudad.obtenerNombredelaCiudad(), 
                ciudad.obtenerProvinciadelaCiudad(), especialidades, obtenerInfMedicos(),
                obtenerInfEnfermeros(), obtenerSueldoTotal());
    }

}

