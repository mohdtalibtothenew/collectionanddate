//Question 2

public class UniqueCharacter {

    public static void main(String[] args) {
        String inputString = "dihfgiuhdfa";
        String temp = "";
        for (int i = 0; i < inputString.length(); i++){
            char current = inputString.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }

        System.out.println(temp.length() + " ");

    }

}
