package B_InterpreterPattern;

public class FirstLetterUpperCase implements Expression {

    private final NoWhiteSpace nws = new NoWhiteSpace();

    @Override
    public String interpret(String context) {
        context = context.substring(0, 1).toLowerCase() + context.substring(1);

        return nws.interpret(context);
    }

}
