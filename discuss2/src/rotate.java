public class rotate {
    public static int[] rotate(int[] A,int k)
    {
        int rightshift=k % A.length;

        if (rightshift==0)
        {
            return A;
        }

        int[] newArr=new int[A.length];

        for(int index=0;index<A.length;index+=1)
        {
            int newindex=(index+k+A.length) % A.length;
            newArr[newindex]=A[index];
        }

        return newArr;
    }

    public static void main(String[] arguments)
    {
        int[] A={0,1,2,3,4,5,6,7};
        int k=12;
        int[] newarray=rotate(A,k);
        for(int i=0;i<newarray.length;i+=1)
        {
            System.out.println(newarray[i]);
        }
    }
}
