public class Runner {

    public static void main(String[] args) {
        System.out.println(sumDouble(1,2));
        System.out.println(helloName("Bob"));
        System.out.println(twoAsOne(1 ,2, 3  ));
        System.out.println(countHi("abc hi ho"));
        int[] arr = {2,4,6,7,8};
        System.out.println(array667(arr ));
        System.out.println(lucky13(arr));
        System.out.println(sum3(arr));
        System.out.println(loneSum(1,2,1));
        System.out.println(canBalance(arr));
        System.out.println(countTriple("xxx aa axa"));


    }


    //sumDouble
    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    //helloName
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    //twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || c + b == a || a + c == b) {
            return true;
        } else {
            return false;
        }
    }

    //countHi
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) count++;
        }
        return count;
    }

    //lucky13
    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3)
                return false;
        }

        return true;
    }

    //arrry667
    public static int array667(int[] nums) {
        int sum = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7))
                sum++;
        }
        return sum;
    }
    //sum3
    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    //loneSum
    public static int loneSum(int a, int b, int c) {
        int sum = 0;
        if(a != b && a != c)
            sum += a;
        if(b != a && b != c)
            sum += b;
        if(c != a && c != b)
            sum += c;
        return sum;
    }
    //canBalance
    public static boolean canBalance(int[] nums) {
        int first = 0;
        int second = 0;

        for(int i = 0; i < nums.length; i++)
            second += nums[i];

        for(int i = 0; i <= nums.length - 2; i++) {
            first += nums[i];
            second -= nums[i];

            if(first == second)
                return true;
        }

        return false;
    }

    //countTriple
    public static int countTriple(String str) {
        int count = 0;
        for(int i = 0; i <= str.length()-3; i++){
            if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2))
                count++;
        }

        return count;
    }

}

















