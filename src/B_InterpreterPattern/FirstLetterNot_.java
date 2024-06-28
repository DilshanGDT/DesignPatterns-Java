package B_InterpreterPattern;

public class FirstLetterNot_ implements Expression {

    private final FirstLetterUpperCase fluc = new FirstLetterUpperCase();

    @Override
    public String interpret(String context) {
        if (context.startsWith("_")) {
            context = context.substring(1);
        }
        return fluc.interpret(context);
    }

}
