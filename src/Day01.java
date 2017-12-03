class Day01 {
    static int captcha(String digits) {

        char[] intArray = digits.toCharArray();

        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            Integer x = Integer.parseInt(String.valueOf(intArray[i]));

            if (i < intArray.length -1) {
                if (intArray[i] == intArray[i + 1]) {
                    sum += x;
                }
            } else if (intArray[i] == intArray[0]) {
                sum += x;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
