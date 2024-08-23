public class Titulo extends Conta{

    private int diaVencimento;
    private  int mesVencimento;

    public Titulo(int dia, int mes, double valor , int diaVencimento,int mesVencimento) {
        super(dia, mes, valor);
        this.diaVencimento = diaVencimento;
        this.mesVencimento = mesVencimento;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public int getMesVencimento() {
        return mesVencimento;
    }

    @Override
    public double getValorAPagar() {
        if ( getMes() >= getMesVencimento() && getDia() > getDiaVencimento() ){
            return  super.getValorAPagar() + (super.getValorAPagar() * 10)/100;
        } else {
            return super.getValorAPagar();
        }
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "diaVencimento=" + diaVencimento +
                ", mesVencimento=" + mesVencimento +
                ", dia=" + dia +
                ", mes=" + mes +
                ", valor=" + valor +
                '}';
    }
}
