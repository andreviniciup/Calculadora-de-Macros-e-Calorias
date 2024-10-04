public class CalculadoraObjetivo {
    private static final double DEFICIT_PERCENTUAL = 0.20; // 20% de déficit para perda de peso
    private static final double SUPERAVIT_PERCENTUAL = 0.10; // 10% de superávit para ganho de peso

    public static double ajustarCalorias(double tdee, String objetivo) {
        switch (objetivo) {
            case "perder peso":
                return tdee * (1 - DEFICIT_PERCENTUAL);
            case "ganhar peso":
                return tdee * (1 + SUPERAVIT_PERCENTUAL);
            case "manter peso":
            default:
                return tdee;
        }
    }
}