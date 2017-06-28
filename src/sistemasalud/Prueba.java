
package sistemasalud;

import java.util.Calendar;

/**
 *
 * @author andre
 */
public class Prueba {
    
    public static void main(String[] args) throws Exception {
        
        Sistema sis = new Sistema();
        sis.adicionarPrograma(new Programa("1","Adulto Mayor"));
        sis.adicionarPrograma(new Programa("2","Primera Infancia"));
        sis.adicionarPrograma(new Programa("3","Adolescentes"));
        sis.adicionarEps(new Eps("Coosalud","1"));
        sis.adicionarEps(new Eps("FamiSanar","2"));
        sis.adicionarEps(new Eps("SaludTotal","3"));
        sis.adicionarColumna(new Columna("001","Influenza"));
        sis.adicionarColumna(new Columna("002","DPT"));
        sis.adicionarUsuario(new Paciente(0,"andres","padilla","gravier","C.C","1234091",Calendar.getInstance(),"Hombre",sis.RetornarEpsPorCodigo("1")));
        sis.adicionarUsuario(new Paciente(1,"alfredo","padilla","gravier","C.C","12340917",Calendar.getInstance(),"Hombre",sis.RetornarEpsPorCodigo("2")));
        
        
    }
    
}
