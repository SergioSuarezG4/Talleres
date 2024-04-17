package TallerProgramacion;
import javax.swing.JOptionPane;
public class Ejercicio {

    public double CalcularResultadoOperacion( double num1, double num2, int opcionElegida){


        double resultadoOperacion = 0;

        switch (opcionElegida){
            case 1:
                resultadoOperacion = (num1 + num2);
                break;
            case 2:
                resultadoOperacion = (num1 - num2);
                break;
            case 3:
                resultadoOperacion  =  (num1 * num2);
                break;
            case 4:
                resultadoOperacion =  (num1 / num2 );
                break;

            default:
            JOptionPane.showMessageDialog(null, "Opcion Incorrecta");        
        }
        
        return resultadoOperacion;
    }   
}



    

