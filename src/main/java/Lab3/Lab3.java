
 

public class Lab3 {
    public static void main(String[]arg){
        int a = 5, b = 7, c = a;
        
        System.out.printf("a=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        c = b;
        
        System.out.printf("b=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        
        c = -a;
         
        System.out.printf("-a=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        c = a+b;
        
        System.out.printf("a+b=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        c = a-b;
        
        System.out.printf("a-b=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        c = a*b;
        
        System.out.printf("a*b=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        c = a/b;
        
        System.out.printf("a/b=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        c = a%b;
        
        System.out.print("a%b=");
        System.out.printf("%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        c = a++;
        
        System.out.printf("a++=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        c = b--;
        
        System.out.printf("b--=%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
        
        a = 2024;
        b = 341;
        c = -(a/b+a%b)*5;
        
        System.out.print("-(a/b+a%b)*5=");
        System.out.printf("%s=%x=%o=%d\n",Integer.toBinaryString(c),c,c,c);
    }
}