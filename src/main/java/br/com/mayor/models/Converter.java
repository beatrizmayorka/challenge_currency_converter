package br.com.mayor.models;

public class Converter {
    private final String base_code;
    private final String target_code;
    private final double conversion_rate;

    public Converter(String base_code, String target_code, double conversion_rate) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public double conversion_rates() {
        return conversion_rate;
    }
}