//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Assalariado a1 = new Assalariado("Bia","Clara",12345,41,8.0);
        System.out.println(a1.toString());
        System.out.println(a1.getValorAPagar());

        Terceirizado t1 = new Terceirizado("brendo","alves",3698,10);
        System.out.println(t1.toString());
        System.out.println(t1.getValorAPagar());

        Comissionado c1 = new Comissionado("leo","lira",1478,100);
        System.out.println(c1.toString());
        System.out.println(c1.getValorAPagar());

        AssalariadoComissionado ac1 = new AssalariadoComissionado("lia","matos",58763,100,6);
        System.out.println(ac1.toString());
        System.out.println(ac1.getValorAPagar());

        Titulo tl1 =  new Titulo(10,9,100,10,10);
        System.out.println(tl1.toString());
        System.out.println(tl1.getValorAPagar());

        Concessionario con = new Concessionario(6,3,250);
        System.out.println(con.toString());
        System.out.println(con.getValorAPagar());
    }
}