package lect_4;

public class AsciiValue {
    public static void main(String[] args) {
        String str="lives";
        int freq[]=new int[256];
        for (char ch:str.toCharArray()){
            freq[ch]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char)i + "->"+(int)i);
            }
        }
    }
}
