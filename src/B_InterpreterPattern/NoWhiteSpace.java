package B_InterpreterPattern;

public class NoWhiteSpace implements Expression {

    @Override
    public String interpret(String context) {
        return context.replaceAll(" ", "");
    }

}
