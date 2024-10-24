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
        String eredmeny = "";
        if(hidegVan){
            eredmeny = "Viszek kabátot";
        }else{
            eredmeny = "Nem viszek kabátot";
        }
        System.out.println(eredmeny);
    }
    
}
