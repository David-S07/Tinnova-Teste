package br.com.tinnova.modulo1;

public class EleicoesDTO {

    private double VotosValidos;
    private double votosBrancos;
    private double votosNulos;
    private double eleitores;

    public double getVotosValidos() {
        return VotosValidos;
    }

    public void setVotosValidos(double votosValidos) {
        VotosValidos = votosValidos;
    }

    public double getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(double votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public double getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(double votosNulos) {
        this.votosNulos = votosNulos;
    }

    public double getEleitores() {
        return eleitores;
    }

    public void setEleitores(double eleitores) {
        this.eleitores = eleitores;
    }

    @Override
    public String toString() {
        return "O total informado é: " +
                "Votos Validos=" + VotosValidos +
                ", votos Brancos=" + votosBrancos +
                ", votos Nulos=" + votosNulos +
                ", eleitores=" + eleitores +
                '}';
    }
}
