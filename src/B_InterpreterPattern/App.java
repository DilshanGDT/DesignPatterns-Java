package B_InterpreterPattern;

public class App {

    public static void main(String[] args) {

        var context = "_My Variabe";

        var fluc = new FirstLetterUpperCase();
        var result = fluc.interpret(context);
        System.out.println(result); /* -> myVariable */
    }
}
