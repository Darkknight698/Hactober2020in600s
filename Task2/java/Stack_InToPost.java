import java.util.Scanner;
//sample input = a*b/c+d-e^f*g
// A program to convert infix expression to postfix
public class Stack_InToPost {
    static int top = -1;
    static char[] stack = new char[30];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your infix expression:");
        String data = sc.nextLine().toLowerCase();
        sc.close();
        System.out.println("POSTFIX :");
        process(data);
    }

    public static void process(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) != ' ') {
                if (data.charAt(i) >= 'a' && data.charAt(i) <= 'z')
                    System.out.print(data.charAt(i));
                else {
                    //it is a operator!!
                    char ch = data.charAt(i);
                    if (ch == '(')
                        push(ch);
                    if (ch == ')')
                        popBracket();
                    if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^') {
                        if (isEmpty())
                            push(ch);
                        else {
                            if (stack[top] == '*' || stack[top] == '/') {
                                if (ch == '^')
                                    push(ch);
                                else {
                                    pop();
                                    push(ch);
                                }
                            }
                            if (stack[top] == '+' || stack[top] == '-') {
                                if (ch == '+' || ch == '-') {
                                    pop();
                                    push(ch);
                                } else {
                                    push(ch);
                                }
                            }
                            if (stack[top] == '^') {
                                pop();
                                push(ch);
                            }
                        }
                    }

                }// end of else
            }//end of space checking condition
        }//end of for loop
        if (!isEmpty()) {
            for (int i = top; i > -1; i--)
                System.out.print(stack[i]);
        }

    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void push(char ch) {
        top++;
        stack[top] = ch;
    }

    public static void popBracket() {
        for (int i = top; i > -1; i--) {
            if (stack[i] == '(') {
                top--;
                break;
            } else {
                System.out.print(stack[i]);
                top--;
            }
        }
    }// end of popBracket

    public static void pop() {
        System.out.print(stack[top]);
        top--;
    }
}
