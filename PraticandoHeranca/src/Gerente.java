public class Gerente extends  Funcionario{
    protected String departamento;
    protected double calcularbonus;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double calcularbonus() {
        return salario * 0.1;


    }

}


