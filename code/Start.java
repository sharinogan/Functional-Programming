class Start {
    public static void main(String[] data) {
        Item root = new Item();
        root.name = "David";
        root.number = 7;
        
        Item x = new Item();
        x.name = "Frank";
        x.number = 8;       
        root.left = x;  // important
        
        root.right = new Item();
        root.right.name = "Michael";
        root.right.number = 10;
        
        root.right.left = new Item();
        root.right.left.name = "Paul";
        root.right.left.number = 12;
        
        root.right.right = new Item();
        root.right.right.name = "Stephen";
        root.right.right.number = 4;
        int c = count(root);
        System.out.println(c);
    }  
    
    static int count(Item e) {
        if (e == null) return 0;
        return count(e.left) + count(e.right) + 1;
    }
}

class Item {
    String name;      // null
    int number;       // 0
    double salary;    // 0.0
    Item left;        // null
    Item right;       // null
}