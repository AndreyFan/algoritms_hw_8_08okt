package de.telran.hw_8_08okt;


import de.telran.hw_8_08okt.ClassicStack;


class SpecialStack {  // Структура на основе ClassicStack
            de.telran.hw_8_08okt.ClassicStack mainStack;  // Основной стек для хранения всех элементов
            de.telran.hw_8_08okt.ClassicStack minStack;   // Дополнительный стек для хранения минимальных элементов

            // Конструктор
            public SpecialStack() {
                mainStack = new de.telran.hw_8_08okt.ClassicStack();
                minStack = new ClassicStack();
            }
            // напишем push с дополнительной логикой
            public void push(int value) {
                mainStack.push(value);
                // Если minStack пуст или новый элемент меньше или равен текущему минимальному
                if (minStack.isEmpty() || value <= minStack.peek()) {
                    minStack.push(value);
                }
            }

            // Метод для удаления верхнего элемента из стека
            public int pop() {
                if (mainStack.isEmpty()) {
                    System.out.println("Stack is empty");
                    return -1;
                }
                // Если удаляемый элемент также является минимальным
                int value = mainStack.pop();
                if (value == minStack.peek()) {
                    minStack.pop();
                }
                return value;
            }

            // Метод для получения минимального элемента
            public int getMin() {
                if (minStack.isEmpty()) {
                    System.out.println("Stack is empty");
                    return -1;
                }
                return minStack.peek();
            }

            public boolean isEmpty() {
                return mainStack.isEmpty();
            }

            public int peek(){
                return mainStack.peek();
            }

  public void print(){
      for (int index = mainStack.getTop(); index > -1; index--) {
          System.out.print(" "+mainStack.getA()[index]);
      }
      System.out.println();
  }
}


