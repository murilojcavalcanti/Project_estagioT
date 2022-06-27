package Exercicio04;

public class exercicioFaturamentoMensal {
    public static void main(String[] args) {

        double Sp = 67836.43;
        double Rj = 36678.66;
        double Mg = 29229.88;
        double Es = 27165.48 ;
        double outros = 19849.53;
        double Total;
//percentuais
        double PSp ;
        double PRj ;
        double PMg ;
        double PEs ;
        double Poutros;

        Total = Sp + Rj + Mg + Es + outros;
        System.out.println("O faturamento total é igual a: R$" + Total );
        // São paulo
        PSp= (Sp/Total)*100;
        System.out.println("O percentual do estado de São Paulo é igual a " + PSp+ "%");

        // Rio de Janeiro
        PRj= (Rj/Total)*100;
        System.out.println("O percentual do estado do Rio de janeiro é igual a " + PRj+ "%");

        // Minas Gerais
        PMg= (Mg/Total)*100;
        System.out.println("O percentual do estado de Minas Gerais é igual a " + PMg+ "%");

        // Espirito Santo
        PEs= (Es/Total)*100;
        System.out.println("O percentual do estado do Espirito Santo é igual a " + PEs+ "%");

        // outros
        Poutros= (outros/Total)*100;
        System.out.println("O percentual dos outros estados é igual a " + Poutros+ "%");
    }
}
