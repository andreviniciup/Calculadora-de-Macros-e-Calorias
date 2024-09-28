public class InfoUsuario {
    private double peso;  // kg
    private double altura; // cm
    private int idade;
    private char genero;  // 'M' ou 'F'

    public InfoUsuario(double peso, double altura, int idade, char genero) {
        if(peso <= 0 || altura <= 0 || idade <= 0) {
        }
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public char getGenero() {
        return genero;
    }
}
