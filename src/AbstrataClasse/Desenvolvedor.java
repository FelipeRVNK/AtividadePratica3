package AbstrataClasse;

public class Desenvolvedor extends Funcionario implements Trabalhavel{

    private String tecnologiaDomina;

    

    public Desenvolvedor() {
    }
    public Desenvolvedor(String nome, int matricula, float valorHora, int horasTrabalhadas,
            String tecnologiaDomina) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.tecnologiaDomina = tecnologiaDomina;
    }

    public String getTecnologiaDomina() {
        return tecnologiaDomina;
    }
    public void setTecnologiaDomina(String tecnologiaDomina) {
        this.tecnologiaDomina = tecnologiaDomina;
    }


    @Override
    public float calcularSalario() {
        return (getHorasTrabalhadas() * getValorHora());        
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        "\nCargo: Programaçao" +
        "\nTecnologia que o progrmador domina: " + tecnologiaDomina +
        "\nSalário: R$" + calcularSalario();
    }

    @Override
    public String trabalhar() {
        return "O programador " + getNome() + " está trabalhando";
    }

    @Override
    public String relatarProgresso() {
        return"O programador " + getNome() + " progrediu!";
    }
}