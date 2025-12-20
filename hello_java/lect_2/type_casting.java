package lect_2;

public class type_casting {
        public static void main(String[] args) {
            float f = 9.75f;
            int i = (int) f;

            System.out.println("Float value: " + f);
            System.out.println("Integer value:"+i);
        }
}
//Key Concept: Type Casting
//        - Widening (implicit): Smaller type → larger type (e.g., int → float). Happens automatically.
//        - Narrowing (explicit): Larger type → smaller type (e.g., float → int). Requires explicit cast
//          because data may be lost.
