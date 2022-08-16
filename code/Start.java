class Start {

    public static void main(String[] data) {
        f("");
    }
    
    static void f(String status) {
        if (status.length() == 3) {
            System.out.println(status);
            return; // พอถึงขั้นสุดท้าย return กลับขึ้นไป
        }
        
        f(status + "L");
        f(status + "D"); // optional เผื่อมีการเสมอ
        f(status + "W");
    }
}    