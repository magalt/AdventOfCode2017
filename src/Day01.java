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

    static int captcha2(String digits) {
      char[] intArray = digits.toCharArray();

      int size = digits.length();
      int ahead = digits.length() / 2;

      int sum = 0;

      for (int i = 0; i < intArray.length; i++) {
        Integer x = Integer.parseInt(String.valueOf(intArray[i]));
        Integer y = Integer.parseInt(String.valueOf(intArray[(i+ahead)%size]));

        if (x == y) {
          sum += x;
        }
      }

      System.out.println(sum);
      return sum;
    }


}
