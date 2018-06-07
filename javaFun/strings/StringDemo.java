public class StringDemo {
  public static void main(String[] args){
    String ninja = "coding dojo is awesoome";
    int length = ninja.length();

    String string2 = "hello again";

    String string3 = ninja + string2;
    System.out.println(string3);
  }
}

// String a = new String("word");
// String b = new String("word");
// System.out.println(a == b); // false. not the same exact object.
// System.out.println(a.equals(b)); // true. same exact characters.
