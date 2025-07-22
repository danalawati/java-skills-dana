public class GradeManager {
    String[] names;

    public static void main(String[] args ){
        String[] names = {"Sara" , "Dana"};
        String[] reversed = reverseStudentNames(names);

        for (int i = 0; i < reversed.length; i++) {
            System.out.println(reversed[i]);
        }

    }
    public static String[] reverseStudentNames(String[] names) {

        String[] reverseName = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String original = names[i];
            String reversed = "";

            for (int j = original.length() - 1; j >= 0; j--) {
                reversed += original.charAt(j);
            }

            reverseName[i] = reversed;
        }

        return reverseName;
    }


}
