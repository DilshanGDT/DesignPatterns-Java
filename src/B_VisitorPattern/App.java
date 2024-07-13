package B_VisitorPattern;

public class App {

    public static void main(String[] args) {

        var dir1 = new Directory("Directory 1");
        var file1 = new File("file1.txt", 100);
        dir1.addElement(file1);

        var dir2 = new Directory("Directory 1");
        var file2 = new File("file2.txt", 200);
        dir2.addElement(file2);

        dir1.addElement(dir2);

        var visitor = new CalculateSizeVisitor();
        dir1.accept(visitor);

        System.out.println("Total File Size = " + visitor.getTotalSize() + " MB");
    }

}
