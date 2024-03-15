
public class reversedString {
    public static void main(String[] args) {
        String string = "Hello";
        String[] arrayString =  new String[string.length()];
        arrayString = string.split("");
        System.out.print("resultado: ");
        for(int i = arrayString.length - 1;i>=0;i--){
            System.out.print(arrayString[i]);
            
        }
        System.out.println();
    }
}
