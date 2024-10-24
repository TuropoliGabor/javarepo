package javagit;

public class Javagit {

    public static void main(String[] args) {
        /* 10 fok alatt van hideg
            ha hideg van, akkor viszek kabátot
            egyébként nem viszek kabátot
        */
        final int HIDEG_HATAR = 10;
        int fok = 7;
        boolean hidegVan = fok < HIDEG_HATAR;
        String viszek = "Viszek kabátot";
        String nemViszek = "Nem viszek kabátot";
        String eredmeny = hidegVan ? viszek : nemViszek;
        
        System.out.println(eredmeny);
    }
    
}
