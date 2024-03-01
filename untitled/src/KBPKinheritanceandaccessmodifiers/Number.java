package KBPKinheritanceandaccessmodifiers;

public class Number {
    public static void main(String args[]){
        int a=1;
        for(int i=0;i<=10;i++){
            if(i==0 || i==1 || i==2){
                System.out.println(i+" its a prime number");
            }
            else {
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        System.out.println(i+" its not a prime number");
                        a=0;
                        break;
                    }
                }

            }
        }
        if(a==1){
            System.out.println("prime");
        }
    }
}
