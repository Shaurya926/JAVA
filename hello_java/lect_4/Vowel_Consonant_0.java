package lect_4;

public class Vowel_Consonant_0 {
    public static void main(String[] args) {
        String str="human_being";
        int v=0;
        for(char ch :str.toCharArray()){
            if("aerio".indexOf(ch)!=1){
                v++;
            }
        }System.out.println(v);
    }
}
