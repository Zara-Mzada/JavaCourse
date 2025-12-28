package Lesson20;

public class BinarySearchTree {

    public void searchTree(int target){
        int[] array = new int[50];
        int index = 0;

        for(int i = 1; i<array.length; i++){
            array[index] = i;
            index++;
        }

        int left = 0;
        int right = array.length;

        while(left<=right){
            int mid = left + (right -left)/2;
            if(array[mid] == target){
                System.out.println("Our target inside array: " + array[mid]);
                break;
            }
            else if(array[mid] < target){
                left = mid + 1;
                System.out.println("Left: " + left + "  mid: " + mid);
            }
            else{
                right = mid - 1;
                System.out.println("Right: " + right + "   mid: " + mid);
            }
        }
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.searchTree(24);
    }
}
