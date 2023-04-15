public class NumberLetterCounts {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            count += getNumberLetterCount(i);
        }
        System.out.println(count);
    }

    public static int getNumberLetterCount(int num) {
        if (num == 1000) {
            return 11; // "one thousand"
        }
        int count = 0;
        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = (num / 100) % 10;
        if (hundreds > 0) {
            count += getOnesLetterCount(hundreds) + 7; // "hundred"
            if (tens > 0 || ones > 0) {
                count += 3; // "and"
            }
        }
        if (tens == 1) {
            count += getTeensLetterCount(ones);
        } else {
            count += getTensLetterCount(tens) + getOnesLetterCount(ones);
        }
        return count;
    }

    public static int getOnesLetterCount(int num) {
        switch (num) {
            case 1: return 3; // "one"
            case 2: return 3; // "two"
            case 3: return 5; // "three"
            case 4: return 4; // "four"
            case 5: return 4; // "five"
            case 6: return 3; // "six"
            case 7: return 5; // "seven"
            case 8: return 5; // "eight"
            case 9: return 4; // "nine"
            default: return 0;
        }
    }

    public static int getTeensLetterCount(int num) {
        switch (num) {
            case 0: return 3; // "ten"
            case 1: return 6; // "eleven"
            case 2: return 6; // "twelve"
            case 3: return 8; // "thirteen"
            case 4: return 8; // "fourteen"
            case 5: return 7; // "fifteen"
            case 6: return 7; // "sixteen"
            case 7: return 9; // "seventeen"
            case 8: return 8; // "eighteen"
            case 9: return 8; // "nineteen"
            default: return 0;
        }
    }

    public static int getTensLetterCount(int num) {
        switch (num) {
            case 2: return 6; // "twenty"
            case 3: return 6; // "thirty"
            case 4: return 5; // "forty"
            case 5: return 5; // "fifty"
            case 6: return 5; // "sixty"
            case 7: return 7; // "seventy"
            case 8: return 6; // "eighty"
            case 9: return 6; // "ninety"
            default: return 0;
        }
    }
}
