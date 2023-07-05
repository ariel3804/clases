
public class OEPTERNARIO{
    public String verificar (Persona persona){
        int edadPersona=persona.getEdad();
        String nombrePersona=persona.getNombre();
        String res = nombrePersona;
        res = edadPersona>=18? res+" esta habilitado": res+" no estahabilitado";
        return res;
    }    
}
