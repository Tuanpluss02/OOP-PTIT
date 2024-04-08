import java.util.Scanner;

class HanhTinh {
    private double khoiLuong;
    private double banKinh;
    // G = 6.67 * 10^-11
    public static final double G = 6.67300E-11;

    public HanhTinh(double khoiLuong, double banKinh) {
        this.khoiLuong = khoiLuong;
        this.banKinh = banKinh;
    }

    public double trongLucBeMat() {
        return khoiLuong * G / (banKinh * banKinh);
    }

    public double khoiLuongBeMat(double khoiLuong) {
        return (trongLucBeMat() / 9.802775697614821) * khoiLuong;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hanhTinh = sc.nextLine();
        double khoiLuong = sc.nextDouble();
        double banKinh = sc.nextDouble();
        double khoiLuongTD = sc.nextDouble();
        HanhTinh ht = new HanhTinh(khoiLuong, banKinh);
        System.out
                .println("Your weight on " + hanhTinh + " is " + String.format("%.2f", ht.khoiLuongBeMat(khoiLuongTD)));
        sc.close();
    }
}
