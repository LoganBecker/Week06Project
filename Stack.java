package week06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class Stack {

    static final int MAX = 20;
    int top;
    int stack[] = new int[MAX]; // Maximum size of Stack 

    public Stack() {
        int stack[] = new int[MAX];
        top = -1;
    }

    public Stack(int x) {
        int stack[] = new int[x];
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    public int push(int x) throws FullStackException {
        try {
            if (stack[top] >= stack[MAX - 1]) {
                return top;
            }
        } catch (FullStackException e) {
            System.out.println("Stack is Full");
        } finally {
            stack[++top] = x;
            System.out.println(x + " pushed into stack");
        }
        return x;
    }

    public int pop() throws EmptyStackException {
        try {
            if (top < 0) {
                return 0;
            }
        } catch (EmptyStackException e) {
        } finally {
            int x = stack[top--];
            return x;
        }
    }

    public int peek() throws EmptyStackException {
        try {
            if (top < 0) {
                return 0;
            }
        } catch (EmptyStackException e) {
        } finally {
            int x = stack[top];
            return x;
        }
    }
}
