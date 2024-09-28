import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seu peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.println("Informe sua altura (cm): ");
        double altura = scanner.nextDouble();
        
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Informe seu gênero (M/F): ");
        char genero = scanner.next().charAt(0);
        
        InfoUsuario usuario = new InfoUsuario(peso, altura, idade, genero);
        
        double imc = CalculadoraIMC.calcularIMC(usuario);
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação: " + CalculadoraIMC.classificarIMC(imc));
        
        double tmb = CalculadoraTMB.calcularTMB(usuario);
        System.out.println("Sua TMB é: " + tmb);
        
        System.out.println("Informe seu nível de atividade (sedentario, leve, moderado, ativo, muito ativo): ");
        String nivelAtividade = scanner.next();
        
        double tdee = CalculadoraTDEE.calcularTDEE(tmb, nivelAtividade);
        System.out.println("Seu TDEE é: " + tdee);
        
        // Percentuais sugeridos de macronutrientes: 10-35% proteína, 45-65% carboidratos, 20-35% gordura
        double[] macros = CalculadoraMacros.calcularMacros(tdee, 25, 50, 25);
        System.out.println("Você deve consumir diariamente:");
        System.out.printf("%.2f g de proteína, %.2f g de carboidratos, %.2f g de gordura\n", macros[0], macros[1], macros[2]);
        
        scanner.close();
    }
}
