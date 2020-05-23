public class aaa {
    public static void main(String[] args) {
        YoptaQueue Stack = new YoptaQueue();


        Stack.put(10);

        Stack.put(30);
        Stack.put(40);
        Stack.put(50);
        int q = Stack.count();
        System.out.println(q);


      Stack.pop();
       Stack.pop();
        Stack.pop();

       Stack.put(60);

       int c = Stack.count();
       System.out.println(c);


        while (!Stack.isEmpty()) {
            int n = Stack.pop();
            System.out.println("Elem: " + n);
        }



    }


}
