public class HCF {
    public static void main(String[] args) {
        int num1 = 36;  
        int num2 = 60;  
        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
    }
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}






