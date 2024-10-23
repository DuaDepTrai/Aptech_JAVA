package Ex_241023;

public class SimpleExample {
    // Biến static
    public static int count = 0;

    // Biến thường
    public int id;

    // Constructor để khởi tạo id
    public SimpleExample(int id) {
        this.id = id;
        count++; // Tăng count mỗi khi tạo đối tượng
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Số đối tượng đã tạo (count): " + count);
    }

    public static void main(String[] args) {
        // Tạo 2 đối tượng
        SimpleExample obj1 = new SimpleExample(1);
        SimpleExample obj2 = new SimpleExample(2);
        
        // Hiển thị thông tin của từng đối tượng
        System.out.println("Thông tin đối tượng 1:");
        obj1.display();
        
        System.out.println("Thông tin đối tượng 2:");
        obj2.display();
    }
}
