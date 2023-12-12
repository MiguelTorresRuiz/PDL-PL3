public class VisitorLinguine extends linguineParserBaseVisitor<String> {
    
    @Override
    public String visitSuma(linguineParser.SumaContext ctx) {
        return visitChildren(ctx) + "\niadd";
    }
    @Override
    public String visitReal(linguineParser.RealContext ctx) {
        return "ldc " + ctx.REAL().getText();
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate ==  null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }
}
