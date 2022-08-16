
class Start {

    public static void main(String[] data) {

        int[] a = {8, 5, 4, 3, 6, 3, 4};
        Item root = create(a, 0, a.length - 1);
        int c = total(root);
        System.out.println(c);
    }

    static Item create(int[] a, int left, int right) {
        if (left > right) return null;               
        int mid = (left + right) / 2;
        Item x = new Item();
        x.number = a[mid];
        x.left = create(a, left, mid - 1);
        x.right = create(a, mid + 1, right);
        return x;
    }
    
    static int total(Item e) {
        return e == null ? 0 : 
                total(e.left) + total(e.right) + e.number;
    }

    static int count(Item e) {
        if (e == null) {
            return 0;
        }
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
