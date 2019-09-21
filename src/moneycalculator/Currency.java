package moneycalculator;

public class Currency {

    private final String code;
    private final String name;
    private final String symbol;

    public Currency (String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Currency{" + "code=" + code + ", name=" + name + ", symbol=" + symbol + '}';
    }

}
