import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class jogoDaVelha {
    private String x;
    private String o;
    private String[][] tabuleiro = {
            {" ", " ", " "},
            {" ", " ", " " },
            {" ", " ", " "}
    };

    public void iniciaJogo() {
        boolean f0 = false;
        String[] psr = {"sim", "não", "nao"};
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Deseja iniciar o jogo da velha?");
        String re = sc1.next().toLowerCase();

        for (String s : psr) {
            if (re.equals(s)) {
                f0 = true;
                break; // Sai do loop imediatamente ao encontrar uma correspondência
            }
        }

        // Agora a verificação ocorre depois do loop
        if (f0) {
            jogo();
        } else {
            System.out.println("Tente novamente");
        }
    }

    public String verificaVencedor() {
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(tabuleiro[i][0], tabuleiro[i][1]) && Objects.equals(tabuleiro[i][1], tabuleiro[i][2]) && !Objects.equals(tabuleiro[i][0], " ")) {
                return (tabuleiro[i][0]); // Vencedor na linha
            }
            if (Objects.equals(tabuleiro[0][i], tabuleiro[1][i]) && Objects.equals(tabuleiro[1][i], tabuleiro[2][i]) && !Objects.equals(tabuleiro[0][i], " ")) {
                return (tabuleiro[0][i]); // Vencedor na coluna
            }
        }

        // Verifica Diagonal Principal
        if (Objects.equals(tabuleiro[0][0], tabuleiro[1][1]) && Objects.equals(tabuleiro[1][1], tabuleiro[2][2]) && !Objects.equals(tabuleiro[0][0], " ")) {
            return (tabuleiro[0][0]); // Vencedor na diagonal principal
        }

        // Verifica Diagonal Secundária
        if (Objects.equals(tabuleiro[0][2], tabuleiro[1][1]) && Objects.equals(tabuleiro[1][1], tabuleiro[2][0]) && !Objects.equals(tabuleiro[0][2], " ")) {
            return (tabuleiro[0][2]); // Vencedor na diagonal secundária
        }

        return ""; // Ninguém venceu ainda
    }

    public void jogo(){
        Scanner sc1 = new Scanner(System.in);
        boolean vencedor = false;
        String[] jogadores = {"x", "o"};

        while(!vencedor) {
            System.out.println("Deseja escolher qual? lin, col");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tabuleiro[i][j] = sc1.next();
                    System.out.println(tabuleiro[i][j]);
                    if(Objects.equals(verificaVencedor(), "")){
                        continue;
                    }else {
                        break;
                    }
                }
            }
            }

}

    public static void main(String[] args) {
        jogoDaVelha jogo = new jogoDaVelha();
        jogo.iniciaJogo();
    }
}
