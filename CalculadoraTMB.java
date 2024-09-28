public class CalculadoraTMB {
    public static double calcularTMB(InfoUsuario usuario) {
        if (usuario.getGenero() == 'M' || usuario.getGenero() == 'm') {
            return 88.36 + (13.4 * usuario.getPeso()) + (4.8 * usuario.getAltura()) - (5.7 * usuario.getIdade());
        } else {
            return 447.6 + (9.2 * usuario.getPeso()) + (3.1 * usuario.getAltura()) - (4.3 * usuario.getIdade());
        }
    }
}
