
public class DiasSemanaSwitch{
    public String diasSemana(int n){
        String res;
        switch(n){
            case 1: res = "lunes"; break;
            case 2: res = "martes"; break;
            case 3: res = "miercoles"; break;
            case 4: res = "jueves"; break;
            case 5: res = "viernes"; break;
            case 6: res = "sabado"; break;
            case 7: res = "domingo"; break;
            default: res = "El numero indicado no corresponde a nada";
        }
        return res;
    }
}
