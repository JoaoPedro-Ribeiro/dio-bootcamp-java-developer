public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2.500;
        salarioMinimo = 4.500; //Pode mudar o valor

        System.out.println(salarioMinimo);

        final double SALARIO_FINAL = 5.500; //Não pode mudar o valor
        
        System.out.println(SALARIO_FINAL);

        //SALARIO_FINAL = 6.500; //The final local variable SALARIO_FINAL cannot be assigned. It must be blank and not using a compound assignmentJava(536870970)

    }   
}
