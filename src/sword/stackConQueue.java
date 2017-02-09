package sword;

import java.util.Stack;

/**
 * 用栈实现队列
 *
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 *
 * @Author: milo
 * @Create: 2017-02-09
 */
public class stackConQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int pop = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return pop;
    }

    public static void main(String[] args) {

    }
}
