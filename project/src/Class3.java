public class Class3 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=5;i>=1;i--) {
            int k=2;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
        int g=1;
        do{
            System.out.println(g);
            g++;

            }while(g<=5);
    }
}