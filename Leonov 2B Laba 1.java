class Stack
{
    private int arr[];
    private int top;
    private int capacity;
 
    // Конструктор для инициализации stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
 
    // Вспомогательная функция для добавления элемента `x` в stack
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }
 
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
 
    // Вспомогательная функция для извлечения верхнего элемента из stack
    public int pop()
    {
        // проверка на опустошение stack
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
 
        System.out.println("Removing " + peek());
 
        // уменьшаем размер stack на 1 и (необязательно) возвращаем извлеченный элемент
        return arr[top--];
    }
 
    // Вспомогательная функция для возврата верхнего элемента stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
 
        return -1;
    }
 
    // Вспомогательная функция для возврата размера stack
    public int size() {
        return top + 1;
    }
 
    // Вспомогательная функция для проверки, пуст stack или нет
    public boolean isEmpty() {
        return top == -1;               // или return size() == 0;
    }
 
    // Вспомогательная функция для проверки, заполнен ли stack или нет
    public boolean isFull() {
        return top == capacity - 1;     // или return size() == capacity;
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        Stack stack = new Stack(3);
 
        stack.push(1);      // вставляем 1 в stack
        stack.push(2);      // вставляем 2 в stack
 
        stack.pop();        // удаление верхнего элемента (2)
        stack.pop();        // удаление верхнего элемента (1)
 
        stack.push(3);      // вставляем 3 в stack
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        // удаление верхнего элемента (3)
 
        // проверяем, пуст ли stack
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
