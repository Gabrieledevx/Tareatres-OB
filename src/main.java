public class main {

    public static void main(String args[]){
        Persona per=new Persona();
        per.setNombre("Carlos");
        per.setEdad("22"); //Puede ser Int
        per.setTelefono("098765432");
        System.out.println("Nombres: "+per.getNombre());
        System.out.println("Edad: "+per.getEdad());
        System.out.println("Telefono: "+per.getTelefono());
    }
}

