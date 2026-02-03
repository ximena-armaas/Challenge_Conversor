public record Moneda(String base_code, String target_code, double conversion_rate, double conversion_result) {
    @Override
    public String toString() {
        return "Moneda base: "+base_code+", Moneda a la que se desea convertir: "+target_code+" ,Resultado: "+conversion_result;
    }
}
