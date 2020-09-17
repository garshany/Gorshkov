public class test {
    public static void main(String[] args) {
        book b1 = new book (50, 2019, "How to Java", "Gorshkov", 4503);
        System.out.println(b1);
        b1.setAuthor("Gorshkov A P");
        System.out.println(b1);
        b1.setYear(1998);
        System.out.println(b1);
        b1.getAllwords();

    }
}
