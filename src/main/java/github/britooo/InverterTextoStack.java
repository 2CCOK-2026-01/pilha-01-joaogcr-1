package github.britooo;

public class InverterTextoStack {
    public static String inverter(String input) {
        /*
            É óbvio que não precisamos de uma pilha para resolver esse
            problema, porém, precisamos desenvolver nosso raciocínio lógico!

            Então, não fique pilhado, use a classe Pilha.
        */
        Pilha<String> pilha = new Pilha<>(input.length());
        String resultado = "";

        for (char c : input.toCharArray()) {
            pilha.push(String.valueOf(c));
        }

        for (int i = 0; i < input.length(); i++) {
            resultado += pilha.pop();
        }

        return resultado;
    }
}
