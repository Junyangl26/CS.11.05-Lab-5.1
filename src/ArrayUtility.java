public class ArrayUtility {
    public static void main(String[] args) {
        int[] a = {12, 34, 67, 89, 91, 35};
        shiftRight(a);
        print (a);
    }

    public static void print(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]);
            if(i!=array.length-1) {
                System.out.print(", ");
            }
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double avg = ((double)sum(array)/array.length);
        return (int) (avg * 100) / 100.0;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int cnt = 0;
        for (int i=0;i<array.length;i++) {
            if (array[i] % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int[] reverseOne(int[] array) {
        int[] output = new int[array.length];
        for (int i=array.length-1;i>=0;i--) {
            output[array.length-i-1] = array[i];
        }
        return output;
    }

    public static void reverseTwo(int[] array) {

        for (int i=0; i<array.length/2; i++) {
            int cup = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = cup;
        }
    }

    //Method called linearSearchInt that checks to see
    // if a given value exists in an array of integers.
    // Takes two parameters: the first is an array of integers, the second is an integer. Returns a boolean.
    public static boolean linearSearchInt(int[] array, int num) {
        for (int i=0;i<array.length;i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
    //Method called linearSearchString that checks to see if a
    // given value exists in an array of strings.
    // Takes two parameters: the first is an array of Strings,
    // the second is a String. Returns a boolean.

    public static boolean linearSearchString(String[] array, String str) {
        for (int i=0;i<array.length;i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i=0;i<array.length;i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i=0;i<array.length;i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String out = "";
        for (int i=0;i<array.length;i++) {
            out += array[i];
            if (i!= array.length-1) {
                out += ", ";
            }
        }
        return out;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++) {
                if (array[i]+array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length-1];
        for (int i=array.length-1;i>=0;i--) {
            if (i >= 1) {
                array[i] = array[i - 1];
            }
            else {
                array [i] = array[array.length-1];
            }
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int first = array[0];
        for (int i=0;i<array.length-1;i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i=1;i<=n;i++) {
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i=1;i<=n;i++) {
            shiftLeft(array);
        }
    }


}
