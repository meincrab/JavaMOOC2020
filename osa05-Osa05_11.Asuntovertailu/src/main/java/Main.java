
public class Main {

    public static void main(String[] args) {
        Asunto eiraYksio = new Asunto(1, 16, 5500);
        Asunto kallioKaksio = new Asunto(2, 38, 4200);
        Asunto jakomakiKolmio = new Asunto(3, 78, 2500);

        System.out.println(eiraYksio.hintaero(kallioKaksio));        // 71600
        System.out.println(jakomakiKolmio.hintaero(kallioKaksio));

    }
}
