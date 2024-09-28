public class CalculadoraMacros {
    public static double[] calcularMacros(double tdee, double porcentagemProteina, double porcentagemCarboidrato, double porcentagemGordura) {
        double caloriasProteina = (tdee * porcentagemProteina) / 100;
        double caloriasCarboidrato = (tdee * porcentagemCarboidrato) / 100;
        double caloriasGordura = (tdee * porcentagemGordura) / 100;

        double gramasProteina = caloriasProteina / 4;  // 1g de proteína = 4 calorias
        double gramasCarboidrato = caloriasCarboidrato / 4;  // 1g de carboidrato = 4 calorias
        double gramasGordura = caloriasGordura / 9;  // 1g de gordura = 9 calorias

        return new double[]{gramasProteina, gramasCarboidrato, gramasGordura};
    }
}
