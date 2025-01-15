//letra C)

public class StringProgram {

    public static String processString(int T, String CC, char C, boolean O) {
        // Verificar tamanho válido (contrato 1)
        if (T < 1 || T > 20) {
            throw new IllegalArgumentException("Erro: Tamanho inválido");
        }

        // Verificar cadeia de caracteres válida (contrato 2)
        if (CC == null || CC.isEmpty()) {
            throw new IllegalArgumentException("Erro: Cadeia de caracteres vazia");
        }
        if (CC.length() != T) {
            throw new IllegalArgumentException("Erro: Tamanho da cadeia não coincide com T");
        }

        // Verificar caractere válido (contrato 3)
        if (Character.toString(C).length() != 1) {
            throw new IllegalArgumentException("Erro: Mais de um caractere para procurar");
        }

        // Procurar caractere na cadeia (funcionalidade principal)
        int position = CC.indexOf(C);
        if (position == -1) {
            return "Caractere não encontrado";
        }

        // Retornar posição do caractere (funcionalidade principal)
        return "Posição: " + (position + 1); // +1 para usar indexação humana
    }
}
