package Task1;


public class Task1 {;
    public static double calculate(float a, float b, float c){
        return (Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c)) / (a * b + c);
    }

    public static void main(String[] args) {
        System.out.println(calculate(2.5f, 2.5f, 2.5f));

    }
}
