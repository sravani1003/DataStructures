class stringOperations{
    public static void main(String[] args){
        String str="Life teaches everything throughout life    ";
        String str1="Lets deal with it";
        String str2="lets deal with it";
        System.out.println(str1.toUpperCase());
        System.out.println(str.compareTo(str2));
        System.out.println(str.trim());
        System.out.println(str.replace("every","any"));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.lastIndexOf("t"));
        System.out.println(str1.charAt(5));
        System.out.println(str.length());
        System.out.println(str.concat(str1));
    }
}