public class CurvaSierpinski {

   public static void main(String[] args) {
       
       
            System.out.println(sierpinski(3));
            
    }
    
    
    public static int sierpinski(int n){
        if(n == 0)
            return 1;
        else {
            return (sierpinski(n-1)*3) + 2; 
        }
    }
}