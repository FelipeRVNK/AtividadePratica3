package AbstrataClasse;

public class Gerente extends Funcionario implements Trabalhavel{

    private float bonus;
    private String equipe;

    public Gerente() {
    }
    public Gerente(String nome, int matricula, float valorHora, int horasTrabalhadas, float bonus,
            String equipe) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.bonus = bonus;
        this.equipe = equipe;
    }

    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public float calcularSalario() {
        return (getValorHora() * getHorasTrabalhadas()) + 2000;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nCargo: Gerente" +
        "\nEquipe: " + equipe +
        "\nSalário: R$" + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return"O gerente " + getNome() + " está trabalhando com a equeipe " + equipe;
    }

    @Override
    public String relatarProgresso() {
        return "O gerente " + getNome() + " e a equipe " + equipe + " estao progredindo";
    }
    
}