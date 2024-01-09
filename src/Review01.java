
public class Review01 {

    public static void main(String[] args) {
        int withoutTax = 1500;
        int taxRate = 10;
        int tax = getTax(withoutTax, taxRate);
        int taxIncluded = withoutTax + tax;
        System.out.println(withoutTax + "円の商品の税込価格は" + taxIncluded + "円（消費税は" + tax + "円）です。");
    }
    public static int getTax(int withoutTax, int taxRate) {
        int tax = (int)(withoutTax * (double)(taxRate*0.01));
        return tax;
    }

}
