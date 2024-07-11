import java.util.Scanner;
class abi
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int profit=0;
        int sum=0;
        int mini=0;
        int totalp=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
        int a=s.nextInt();
        for(int k=0;k<a;k++)
        {
            for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]!=0){
                if(arr[i]<arr[j])
                {
                    sum=arr[j]-arr[i];
                    //System.out.println(sum);
                    if(profit<sum){
                    profit=sum;
                    mini=i;}
                }
                }
            }
        }
        //System.out.print(profit);
        totalp+=profit;
        profit=0;
        for(int q=mini;q<n;q++)
        arr[q]=0;
        }
        //for(int i=0;i<n;i++)
                //System.out.println(arr[i]);

        System.out.print(totalp);
    }
}
