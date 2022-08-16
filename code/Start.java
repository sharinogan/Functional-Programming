class Start {
    public static void main(String[] data) {
       String[] all = { "Hydrogen", "Helium", "Lithium",
                        "Berylium", "Boron"};
       
       Element first = create(all);
       print(first);
       int count = 0;
       System.out.println(count(first));
    }  
    
    // recursive call method to return count node in linked list
    static int count(Element e ) {
        if (e == null) return 0;
        return 1 + count(e.next);
    }
    
    static Element create(String[] data) {
        Element first = null;
        Element last = null;
        for (int i = 0; i < data.length; i++) {
            Element current = new Element();
            current.name = data[i];
            if (first == null) {
                first = current;
                last = current;
            } else {
                last.next = current;
                last = current;
            }
        }
        return first;
    }
    
    static void print(Element e) {
        if (e == null) return; 
        print(e.next);
        System.out.println(e.name);       
    }
}

class Element {
    String name;       // null
    int number;        // 0
    double weight;     // 0.0
    Element next;      // null
}