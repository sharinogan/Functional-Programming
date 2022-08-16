class Start {
    public static void main(String[] data) {
        Element first = new Element();
        first.name = "Hydrogen";
        
        // Linking #1
        // first.next = new Element();
       //  first.next.name = "Heluim";
       
       // Linking #2
       Element second = new Element();
       second.name = "Helium";
       first.next = second;      // most important
       print(first);
    }  
    
    static void print(Element e) {
        if (e == null) return;
        System.out.println(e.name);
        print(e.next);
    }
}

class Element {
    String name;       // null
    int number;        // 0
    double weight;     // 0.0
    Element next;      // null
}