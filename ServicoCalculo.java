public class ServicoCalculo {

    public static String calcularResultado(double peso, double altura, int idade, char genero, String atividade, String objetivo) {
        // Criar o objeto InfoUsuario
        InfoUsuario usuario = new InfoUsuario(peso, altura, idade, genero);

        // Cálculo do IMC
        double imc = CalculadoraIMC.calcularIMC(usuario);
        String classificacaoIMC = CalculadoraIMC.classificarIMC(imc);

        // Cálculo da TMB
        double tmb = CalculadoraTMB.calcularTMB(usuario);

        // Cálculo do TDEE
        double tdee = CalculadoraTDEE.calcularTDEE(tmb, atividade.toLowerCase());

        // Ajuste de calorias com base no objetivo
        double caloriasAjustadas = CalculadoraObjetivo.ajustarCalorias(tdee, objetivo.toLowerCase());

        // Cálculo dos macros (usando valores de exemplo: 30% proteínas, 50% carboidratos, 20% gorduras)
        double[] macros = CalculadoraMacros.calcularMacros(caloriasAjustadas, 30, 50, 20);

        // Formatar o resultado em HTML
        return "<html>"
                + "IMC: " + String.format("%.2f", imc) + " (" + classificacaoIMC + ")<br>"
                + "TMB: " + String.format("%.2f", tmb) + " kcal<br>"
                + "TDEE: " + String.format("%.2f", tdee) + " kcal<br>"
                + "Calorias Ajustadas: " + String.format("%.2f", caloriasAjustadas) + " kcal<br>"
                + "Proteínas: " + String.format("%.2f", macros[0]) + "g<br>"
                + "Carboidratos: " + String.format("%.2f", macros[1]) + "g<br>"
                + "Gorduras: " + String.format("%.2f", macros[2]) + "g"
                + "</html>";
    }
}
