public class OperatorsDemo {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition:" + sum);
    
    }
        int multiply(int a, int b){
        return a * b;
        }
        public static void main(String[] args)  {
            int x = 29 , y = 2;
            System.out.println("x + y ="+ (x + y));
            System.out.println("x - y ="+ (x - y));
            System.out.println("x * y ="+ (x * y));
            System.out.println("x / y ="+ (x / y));
            System.out.println("x % y ="+ (x % y));

            byte a = 10,b = 15;
            int result = a + b;
            System.out.println("Arthmetic operations Result:" + result);

            OperatorsDemo obj = new OperatorsDemo();
            obj.add( 3, 4);
            int product = obj.multiply(5, 6);
            System.out.println("multiplication:" + product);

        }
    
}