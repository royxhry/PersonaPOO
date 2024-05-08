public class Persona {
  
    String nombre, apellido;
    int edad;
    double altura;
    
    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }
    
    // Método para establecer el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método para obtener el apellido de la persona
    public String getApellido() {
        return apellido;
    }
    
    // Método para establecer el apellido de la persona
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // Método para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }
    
    // Método para establecer la edad de la persona
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Método para obtener la altura de la persona
    public double getAltura() {
        return altura;
    }
    
    // Método para establecer la altura de la persona
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método toString para representar la información de la persona
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
    }
}
