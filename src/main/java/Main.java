import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Insira um operação (S: Soma | M: Média):");
    char operacao = console.next().charAt(0);
    System.out.println();
    double matriz[][] = {
      {1234, 2345, 3456, 4567, 5678, 6789, 7890, 8901, 9012, 123, 234, 345},
         {456, 567, 678, 789, 890, 901, 1234, 2345, 3456, 4567, 5678, 6789},
         {7890, 8901, 9012, 123, 234, 345, 456, 567, 678, 789, 890, 901},
         {1234, 2345, 3456, 4567, 5678, 6789, 7890, 8901, 9012, 123, 234, 345},
         {456, 567, 678, 789, 890, 901, 1234, 2345, 3456, 4567, 5678, 6789},
         {7890, 8901, 9012, 123, 234, 345, 456, 567, 678, 789, 890, 901},
         {1234, 2345, 3456, 4567, 5678, 6789, 7890, 8901, 9012, 123, 234, 345},
         {456, 567, 678, 789, 890, 901, 1234, 2345, 3456, 4567, 5678, 6789},
         {7890, 8901, 9012, 123, 234, 345, 456, 567, 678, 789, 890, 901},
         {1234, 2345, 3456, 4567, 5678, 6789, 7890, 8901, 9012, 123, 234, 345},
         {456, 567, 678, 789, 890, 901, 1234, 2345, 3456, 4567, 5678, 6789},
         {7890, 8901, 9012, 123, 234, 345, 456, 567, 678, 789, 890, 901}};
    
    if (operacao == 'S'||operacao=='s'){
      double soma = 0;
      for (int i = 0; i < 12; i++){
        for(int j = 0; j < 12; j++){
          if (i < j && i + j > 11){
            soma += matriz[i][j];
          }
        }
      }
      System.out.println("Soma S ou Média M => Soma: " + soma);
    } 
    else if (operacao == 'M'||operacao == 'm'){
      double media = 0;
      for (int i = 0; i < 12; i++){
        for(int j = 0; j < 12; j++){
          if (i < j && i + j > 11){
            media += matriz[i][j];
          }
        }
      }
      media = media / 30;
      System.out.println("Soma S ou Média M => Média: " + media);
    } 
    for (int i = 0; i < 12; i++){
      for(int j = 0; j < 12; j++){
        if (i < j && i + j > 11){
          System.out.print(" X");
        } else {
          System.out.print(" .");
        }
      }
      System.out.println();
    }
  }
}