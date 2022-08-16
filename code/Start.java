class Start {

    public static void main(String[] data) {
        print(7);
    }
    
    static void print(int n) {
        if (n == 0) return;
        print(n-1);
        System.out.println(n);
    }
}

  
