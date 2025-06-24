public class NumberProgramPractice {

    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static int powerOfNum(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }

    public static boolean isArmstrong(int num) {
        int count = count(num);
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = powerOfNum(rem, count) + sum;
            num /= 10;
        }
        return (temp == sum);
    }

    public static boolean isPalindrome(int num) {
        int reverse = reverse(num);
        return (reverse == num);
    }

    public static int reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        return reverse;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static int productOfDigits(int num) {
        int product = 1;
        while (num > 0) {
            int rem = num % 10;
            product *= rem;
            num /= 10;
        }
        return product;
    }

    public static boolean isHarshad(int num) {
        return (num % sumOfDigits(num) == 0);
    }

    public static boolean isAutomorphic(int num) {
        int count = count(num);
        int sqrOfNum = num * num;
        int newNum = 0;
        for (int i = 0; i < count; i++) {
            int rem = sqrOfNum % 10;
            newNum = (newNum * 10) + rem;
            sqrOfNum /= 10;
        }
        return (num == reverse(newNum));
    }

    public static boolean isTech(int num) {
        int sqr = num * num;
        int digits = count(sqr);
        if (digits % 2 != 0)
            return false;
        int divisor = powerOfNum(10, digits / 2);
        int firstHalf = sqr / divisor;
        int secondHalf = sqr % divisor;
        int sum = firstHalf + secondHalf;
        return (sum == num);
    }

    public static boolean isDuck(int num) {
        if (reverse(num) % 10 == 0)
            return false;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0)
                return true;
            num /= 10;
        }
        return false;
    }

    public static boolean isSpy(int num) {
        int sum = sumOfDigits(num);
        int product = productOfDigits(num);
        return (sum == product);
    }

    public static boolean isNeon(int num) {
        int sqr = num * num;
        int sum = sumOfDigits(sqr);
        return (num == sum);
    }

    public static void main(String[] args) {
        System.out.println(isAutomorphic(76));
    }
}
