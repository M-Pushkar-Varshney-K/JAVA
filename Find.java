 public class Find {
    public static void main(String[] args) {
        String a = "The whispers of the wind through the trees filled the air, the rustling leaves painting many shades of green against the vibrant blue sky. (This sentence evokes a natural scene with many uses of \"the\" to describe various elements.)";
        int count = 0;
        String lowercaseA = a.toLowerCase();
        String target = "the".toLowerCase();

        int index = 0;
        while ((index = lowercaseA.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        System.out.println(count);
    }
}


