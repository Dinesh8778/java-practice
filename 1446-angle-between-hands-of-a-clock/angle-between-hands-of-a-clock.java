class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs( (30 * (double) hour) - (11 * (double) minutes / 2) );

        if(angle > 180)
            return 360 - angle;
        
        return angle;
    }
}