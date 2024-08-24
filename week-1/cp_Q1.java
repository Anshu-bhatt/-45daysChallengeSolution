class HelloWorld {
    public static void main(String[] args) {
        String arr[]= {"hello","world"};
        
        int len=0, min=arr[0].length();
        for(int k=0;k<arr.length;k++)
        {
            len=arr[k].length();
            if(min>len)
            {
                min=len;
            }
        }
        String fstr= "";
        for(int i=0;i<min;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j].charAt(i)!=arr[j+1].charAt(i))
                {
                    if(fstr.equals(""))
                    {
                        System.out.println(-1);
                    }
                    else{
                    System.out.println(fstr.toString());
                    }
                    return;
                }
            }
            fstr+=arr[0].charAt(i);
        }
    }
}
