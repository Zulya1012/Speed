import java.util.Scanner;
  public class skorost{
   public static void main(String[] arg){
int x=50;
Scanner s=new Scanner(System.in);
System.out.println("Tekushaya skorost:");
int a=s.nextInt();

if (x>a){
System.out.println("Mense");
}

else if(x<a){
System.out.println("Previsel");
}

else if(x==a){
System.out.println("Norma");
}

}

}