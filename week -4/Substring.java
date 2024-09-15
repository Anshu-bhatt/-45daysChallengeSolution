class Substring {
    public static void main(String[] args) {
        String s = "ACBBD";
        System.out.println(substring(s)); 
    }

    public static int substring(String s) {
        String str = s.replace("AB", "");
        String str1 = str.replace("CD", "");

        if (str1.contains("AB") || str1.contains("CD")) {
            return substring(str1);
        } else {
            return str1.length();
        }
    }
}
