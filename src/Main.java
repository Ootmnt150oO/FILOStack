import java.util.Arrays;

public class Main {
    int[] stack = new int[100];
    int top = 0;
    public static void main(String[] args) {
        Main main = new Main();
        for (int i = 0; i < 100;i++){
            main.push(i);
        }
        for (int i = 0 ; i <50; i++){
            main.pop();
        }
        System.out.println(Arrays.toString(main.stack));
    }
    public void push(int data){
        stack[top] = data;
        top++;
    }
    public int pop(){
        int ans = stack[top-1];
        int[] arr = new int[top-1];
        for (int i =0; i < top-1;i++)
            arr[i] = stack[i];
        top--;
        stack = arr;
        return ans;
    }
}