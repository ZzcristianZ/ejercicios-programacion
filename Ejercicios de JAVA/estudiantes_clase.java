public class estudiantes_clase {

    public static class alumno {
    
        String nombre;
        int edad;
        int id;

        public alumno(String nombre,int edad,int id){
            this.nombre=nombre;
            this.edad=edad;
            this.id=id;
        }


        public String getNombre(){
            return nombre;
        }


        public int getEdad(){
            return edad;
        }


        public int getId(){
            return id;
        }

    
        public void info(){
            System.out.println("hola mi nombre es "+nombre+" mi codigo es "+id+" y tengo "+edad+" años");
        }

    }














    public static void main(String[] args) {
        
        alumno cris= new alumno("cistian", 17, 192337);

        cris.info();

    }
}