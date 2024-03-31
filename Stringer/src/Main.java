import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] eger = new int[26];
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        sc.close();
        int numerator=1;
        int denominator=1;
        for(int i=0; i<input.length(); i++){
            eger[((int) input.charAt(i))-'A']++;
        }
        for(int ii=input.length(); ii>0; ii--){
                numerator *= ii;
        }
        for(int iii=0; iii<eger.length; iii++){
            for(int iv=eger[iii]; iv>0; iv--){
                if(iv!=0){
                denominator*=iv;
                }
            }
        }
        int a=0;
        System.out.println(numerator/denominator);
        Character[] acter = new Character[26];
        for(int iv=0; iv< eger.length; iv++) {
            for (int v = 0; v < eger[iv]; v++) {
                if (eger[iv] != 0) {
                    acter[a] = (char) (iv + 'A');
                    a++;
                }
            }
        }
        int b=1;
        Character[] d= new Character[input.length()];
        List<Character> characterList = Arrays.asList(acter);
        ArrayList<String> stringArrayList= new ArrayList<>();
        while(b<=(numerator/denominator)) {
            int sayac=0;
            Collections.shuffle(characterList);
            characterList.toArray(acter);
            int index = 0;
            for (Character karakter : acter) {
                if (karakter != null) {
                    d[index] = karakter;
                    index++;
                }
            }
            String permutationString = Arrays.toString(d);
            if (!stringArrayList.contains(permutationString)) {
                stringArrayList.add(permutationString);
                for(int iv=0; iv<d.length; iv++){
                    System.out.print(d[iv]);
                }
                System.out.println();
                b++;
            }
        }
    }
}
