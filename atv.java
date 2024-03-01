import java.util.Scanner;
public class atv{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        int qdtAnos,horasT,valorHora,salario;
        System.out.print("digite o total de anos trabalhados:");
        qdtAnos=leia.nextInt();
        System.out.print("digite as horas trabalhadas:");
        horasT=leia.nextInt();
        System.out.print("digite o quanto você ganha por hora:");
        valorHora=leia.nextInt();
        salario=(horasT*valorHora);
        if (qdtAnos<=1){
            System.out.println("O seu salario é:"+(1500+salario));
        }else if ((qdtAnos>1)&&(qdtAnos<3)){
            System.out.println("o seu salario é:"+(2000+salario));
        }else {
            System.out.println("o seu salario é:"+(3000+salario));
        }
        
}
}
