
package gt.edu.umg.desdeNB;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ControladorInicio {
    @GetMapping ("/")
    public String inicio (Model model) {
      
        
        var persona = new Persona();
        persona.setNombre("Bryan");
        persona.setEnero ("321");
        persona.setFebrero("145");
        persona.setMarzo("231");
        persona.setTotal("697");
        persona.setPromedio("232");
        
       
        var persona2= new Persona ();
        persona2.setNombre("Jose");
        persona2.setEnero("100");
        persona2.setFebrero("200");
        persona2.setMarzo("150");
        persona2.setTotal("450");
        persona2.setPromedio("150");
       
        var persona3= new Persona ();
        persona3.setNombre("Carlos");
        persona3.setEnero("30");
        persona3.setFebrero("100");
        persona3.setMarzo("70");
        persona3.setTotal("200");
        persona3.setPromedio("66");
        
         var persona4= new Persona ();
        persona4.setNombre("jonathan");
        persona4.setEnero("120");
        persona4.setFebrero("80");
        persona4.setMarzo("100");
        persona4.setTotal("300");
        persona4.setPromedio("100");
        
         var persona5= new Persona ();
        persona5.setNombre("Antoni");
        persona5.setEnero("100");
        persona5.setFebrero("20");
        persona5.setMarzo("50");
        persona5.setTotal("170");
        persona5.setPromedio("56");
        
        
        var personas = Arrays.asList(persona,persona2,persona3,persona4,persona5);
        
       
        model.addAttribute("personas",personas);
        
        
        return "index";
    }
    @GetMapping("/dirección")
    public String dire () {
        return "Segunda pagina";
    }
}
