package DailyCodeChallenge.array;

import java.util.ArrayList;
import java.util.List;

public class PlaceFlower {

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,0,1}, 2));
    }

    //0,0,0,1
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        List<Integer> newFlowerBed = new ArrayList<>();
        newFlowerBed.add(0);
        for (int item : flowerbed) {
            newFlowerBed.add(item);
        }
        newFlowerBed.add(0);

        for(int index = 1 ; index < newFlowerBed.size(); index++ ) {
            if(newFlowerBed.get(index-1) == 0 && newFlowerBed.get(index) == 0 && newFlowerBed.get(index+1) == 0) {
                newFlowerBed.set(index , 1);
                n--;
            }
        }

        if(n <= 0) {
            return true;
        }
        return false;
    }
}
