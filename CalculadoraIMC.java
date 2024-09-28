public class CalculadoraIMC {
    public static double calcularIMC(InfoUsuario usuario) {
        double alturaMetros = usuario.getAltura() / 100;  // Converte para metros
        return usuario.getPeso() / (alturaMetros * alturaMetros);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 24.9) return "Peso normal";
        else if (imc < 29.9) return "Sobrepeso";
        else return "Obesidade";
    }
}
