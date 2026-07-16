public class Solution {
    public bool LemonadeChange(int[] bills) {
        int Rs5 = 0;
        int Rs10 = 0;
        int Rs20 = 0;

        foreach(int i in bills){
            if(i == 5) Rs5++;
            else if(i == 10){
                if(Rs5 > 0){
                    Rs5--;
                    Rs10++;
                }else{
                    return false;
                }
            }
            else{
                if(Rs5 > 0 && Rs10 > 0){
                    Rs5--;
                    Rs10--;
                    Rs20++;
                }else if(Rs5 > 2){
                    Rs5 -= 3;
                    Rs20++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}