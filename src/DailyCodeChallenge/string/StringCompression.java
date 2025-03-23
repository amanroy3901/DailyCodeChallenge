package DailyCodeChallenge.string;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'b' , 'b'}));
    }

//    public static int compress(char[] chars) {
//        int maxCount = 1;
//        int newIndex = 1;
//        for(int index = 1; index < chars.length; index++) {
//            if(chars[index] == chars[index-1]) {
//                maxCount++;
//            }
//            if(chars[index] != chars[index-1] || chars.length-1 == index) {
//                if(maxCount > 1) {
//                    newIndex+=Integer.toString(maxCount).length();
//                }
//                if(chars.length-1 == index) {
//                    newIndex++;
//                }
//                maxCount = 1;
//            }
//        }
//        return newIndex;
//    }

    public static int compress(char[] chars) {
        int read = 0;
        int write = 0;
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == currentChar) {
                count++;
                read++;
            }
            chars[write++] = currentChar;
            if (count > 1) {
                String countInString = Integer.toString(count);
                for (int index = 0; index < countInString.length(); index++) {
                    chars[write++] = countInString.charAt(index);
                }
            }
        }
        return write;
    }
//        int maxCount = 1;
//        int newIndex = 1;
//        for(int index = 1; index < chars.length; index++) {
//            if(chars[index] == chars[index-1]) {
//                maxCount++;
//            }
//            if(chars[index] != chars[index-1] || chars.length-1 == index) {
//                if(maxCount > 1) {
//                    newIndex+=Integer.toString(maxCount).length();
//                }
//                if(chars.length-1 == index) {
//                    newIndex++;
//                }
//                maxCount = 1;
//            }
//        }
//        return newIndex;
//    }



//    public int compress(char[] chars) {
//        int lenght = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(int index = 0; index < chars.length; index++) {
//            map.put(chars[index], map.getOrDefault(chars[index],0)+1);
//        }
//
//        map.forEach({
//
//        });
//        System.out.println(map.to);
//
//
//        return lenght;
//    }
}
