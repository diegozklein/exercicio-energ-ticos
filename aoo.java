import java.util.Scanner;

public class aoo{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o nome da empresa e em seguida a quantidade de energéticos: ");
        String nomeEmpresa = in.nextLine();
        int qntdEnergeticos = in.nextInt();

        double icms = (4.5 * qntdEnergeticos)*0.18; 
        double ipi = (4.5 * qntdEnergeticos)*0.04; 
        double pis = (4.5 * qntdEnergeticos)*0.0186; 
        double cofins = (4.5 * qntdEnergeticos)*0.0854; 
        double total = (4.5*qntdEnergeticos) + icms + ipi + pis + cofins;

        System.out.println("ICMS: " + icms);
        System.out.println("IPI: " + ipi);
        System.out.println("PIS: " + pis);
        System.out.println("COFINS: " + cofins);
        
        //Algoritmo para bonificar empresas que comprar em grandes quantidades
        if(qntdEnergeticos>500){
            System.out.println("Total com desconto de 5%: " + total*0.95);
        }else{System.out.println("Total: " + total);}
        
        
    }

}