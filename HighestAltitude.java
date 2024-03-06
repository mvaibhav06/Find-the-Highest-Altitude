public class HighestAltitude {
    public static int greatestAltitude(int[] gain){
        int altitude = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<gain.length; i++){
            int current = gain[i] + altitude;
            if (current > max){
                max = current;
            }
            altitude = current;
        }
        return max>0 ? max:0;
    }

    public static void main(String[] args) {
        int[] points = {-5,1,5,0,-7};
        System.out.println(greatestAltitude(points));
    }
}
