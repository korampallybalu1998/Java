package practice;
import java.util.*;
public class Third {
    public static void main(String args[]){
        Scanner sf=new Scanner(System.in);
        int pos=0;
        int neg=0;
        int odd=0;
        int even=0;
        int zero=0;
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=sf.nextInt();
            if(a[i]>=0){
                pos++;
                if(a[i]==0){
                    zero++;
                }
                else{
                    if(a[i]%2==0){
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
            }
            else{
                neg++;
                if(a[i]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.print("number of pos are"+pos+" neg are"+neg+" odd are"+odd+" even are"+even+"zero's are "+zero+"");
    }
}
