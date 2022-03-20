public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces (double a, double b) {
        double roundA = Math.floor(a*1000);
        System.out.println(roundA);
        double roundB = Math.floor(b*1000);
        System.out.println(roundB);
//        if (roundA == roundB) {
//            return true;
//        } else {
//            return false;
//        }
//        return (roundA==roundB) ? true : false;

        return roundA == roundB;

    }
}
