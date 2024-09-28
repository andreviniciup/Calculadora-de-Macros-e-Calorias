public class CalculadoraTDEE {
    public static double calcularTDEE(double tmb, String nivelAtividade) {
        switch (nivelAtividade.toLowerCase()) {
            case "sedentario":
                return tmb * 1.2;
            case "leve":
                return tmb * 1.375;
            case "moderado":
                return tmb * 1.55;
            case "ativo":
                return tmb * 1.725;
            case "muito ativo":
                return tmb * 1.9;
            default:
                System.out.println("Nível de atividade desconhecido. Retornando TDEE = 0.");
                return 0; 
        }
    }
}
