class Array{
    void display(int[] array){
        System.out.println("Integer array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    void display(String[] array){
        System.out.println("String array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    void display(int[][] array){
        System.out.println("Integer array");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();
    }
}

void main() {
    Array a = new Array();
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    String[] names = {"Ayden","Bron","Catherine","Donkey","Ele","Freddy","Gon","Harry"};
    int[][] Matrix={
            {1,3},
            {2,4},
            {5,6},
    };
    a.display(arr);
    a.display(names);
    a.display(Matrix);

}
