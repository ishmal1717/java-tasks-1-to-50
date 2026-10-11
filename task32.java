class Stack {
    private char[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        arr = new char[capacity];
        top = -1;
    }

    public void push(char x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = x;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return '\0';
        }
        return arr[top--];
    }

    public char peek() {
        if (isEmpty()) return '\0';
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class task32 {
    public static boolean isBalanced(String expr) {
        Stack stack = new Stack(expr.length());
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test = "{[()]}";
        System.out.println("Expression: " + test);
        System.out.println("Is balanced? " + isBalanced(test));
    }
}