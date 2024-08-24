class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a=473, sum=0;
        while(a!=0)
        {
            sum+=a%10;
            a=a/10;
        }
        System.out.println(sum);
    }
}
